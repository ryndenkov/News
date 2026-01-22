package com.ryndenkov.news.domain.repository

import com.ryndenkov.news.domain.entity.Article
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    fun getAllSubscriptions(): Flow<List<String>>

    suspend fun addSubscription(topic: String)

    suspend fun updateArticlesForTopic(topic: String)

    suspend fun removeSubscription(topic: String)

    suspend fun updateArticlesForAllSubscription()

    fun getArticlesByTopics(topic: List<String>): Flow<List<Article>>

    suspend fun clearAllArticles(topic: List<String>)
}