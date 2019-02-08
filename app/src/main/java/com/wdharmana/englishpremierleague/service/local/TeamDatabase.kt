package com.wdharmana.englishpremierleague.service.local

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.wdharmana.englishpremierleague.model.Team

@Database(entities = arrayOf(Team::class), version = 1)
abstract class TeamDatabase: RoomDatabase() {
    abstract fun teamDao(): TeamDao
}