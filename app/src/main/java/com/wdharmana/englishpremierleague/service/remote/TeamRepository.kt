package com.wdharmana.englishpremierleague.service.remote

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.content.Context
import android.net.ConnectivityManager
import com.wdharmana.englishpremierleague.MainApp
import com.wdharmana.englishpremierleague.model.Team
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class TeamRepository {


    private var apiService: ApiService

    init {
        apiService = ApiService.create()
    }

    companion object {
        private var teamRepository: TeamRepository? = null
        @Synchronized
        @JvmStatic
        fun getInstance(): TeamRepository {
            if (teamRepository == null) {
                teamRepository = TeamRepository()
            }
            return teamRepository!!
        }
    }

    fun getTeamList(ctx: Context): LiveData<List<Team>> {
        val data = MutableLiveData<List<Team>>()

        if(!isConnected(ctx)) {
            val lists = MainApp.database.teamDao().getAllTeam()
            data.value = lists
        } else {

            apiService.getTeamList().subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(
                            { result ->

                                data.value = result.teams

                                result.teams.forEach {
                                    MainApp.database?.teamDao().insertTeam(it)
                                }

                            },
                            { error ->
                                data.value = null
                            }
                    )
        }

        return data
    }

    fun isConnected(ctx: Context) : Boolean {
        val connectivityManager = ctx.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        return connectivityManager.getActiveNetworkInfo() != null
    }

}