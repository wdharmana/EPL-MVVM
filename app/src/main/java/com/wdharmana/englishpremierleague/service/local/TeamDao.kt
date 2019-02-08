package com.wdharmana.englishpremierleague.service.local

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.FAIL
import android.arch.persistence.room.Query
import com.wdharmana.englishpremierleague.model.Team

@Dao
interface TeamDao {

    @Insert(onConflict = FAIL)
    fun insertTeam(team: Team)

    @Query("SELECT * FROM team")
    fun getAllTeam() : List<Team>

}