package com.wdharmana.englishpremierleague

import android.app.Application
import android.arch.persistence.room.Room
import com.wdharmana.englishpremierleague.service.local.TeamDatabase

class MainApp : Application() {


    companion object {
        lateinit var database:  TeamDatabase
    }

    override fun onCreate() {
        super.onCreate()

        database = Room.databaseBuilder(this, TeamDatabase::class.java, "teams.db")
                .allowMainThreadQueries()
                .build()

    }


}