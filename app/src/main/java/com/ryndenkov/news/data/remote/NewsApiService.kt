package com.ryndenkov.news.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {

    @GET("/v2/everything?apiKey=49d283518b2f454fa661de86c7e6ede2")
    suspend fun loadArticles(
        @Query("q") topic: String
    ): NewsResponseDto
}