package com.wdharmana.englishpremierleague.service.remote

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
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

    fun getTeamList(): LiveData<List<Team>> {
        val data = MutableLiveData<List<Team>>()

        apiService.getTeamList().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        {
                            result -> data.value = result.teams
                        },
                        {
                            error -> data.value = null
                        }
                )

        return data
    }

}