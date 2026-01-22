package com.ryndenkov.news.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import kotlinx.coroutines.flow.Flow
import java.nio.charset.CodingErrorAction.IGNORE

@Dao
interface NewsDao {

    @Query("SELECT * FROM subscriptions")
    fun getAllSubscriptions(): Flow<List<SubscriptionDbModel>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addSubscription(subscriptionDbModel: SubscriptionDbModel)

    @Transaction
    @Delete
    suspend fun deleteSubscription(subscriptionDbModel: SubscriptionDbModel)

    @Query("SELECT * FROM articles WHERE topic IN (:topics) ORDER BY publishedAd DESC")
    fun getAllArticlesByTopics(topics: List<String>): Flow<List<ArticleDbModel>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addArticles(articles: List<ArticleDbModel>)

    @Query("DELETE FROM articles WHERE topic IN (:topics)")
    suspend fun deleteArticlesByTopics(topics: List<String>)
}