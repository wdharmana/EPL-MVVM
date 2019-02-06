package com.wdharmana.englishpremierleague.service.remote

import com.wdharmana.englishpremierleague.model.TeamResponse
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiService {
    @GET("search_all_teams.php?l=English%20Premier%20League")
    fun getTeamList(): Observable<TeamResponse>

    companion object {
        fun create(): ApiService {
            val API_URL = "https://www.thesportsdb.com/api/v1/json/1/"
            val retrofit = Retrofit.Builder().baseUrl(API_URL)
                    .addCallAdapterFactory(
                            RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            return retrofit.create(ApiService::class.java)
        }
    }

}