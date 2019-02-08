package com.wdharmana.englishpremierleague.viewmodel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import com.wdharmana.englishpremierleague.model.Team
import com.wdharmana.englishpremierleague.service.remote.TeamRepository

class TeamViewModel(application: Application) : AndroidViewModel(application) {

    val listObservable = TeamRepository.getInstance().getTeamList(application.baseContext)

    fun getTeamListObservable(): LiveData<List<Team>> {
        return listObservable
    }

}