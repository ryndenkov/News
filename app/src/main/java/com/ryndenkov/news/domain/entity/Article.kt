package com.ryndenkov.news.domain.entity

data class Article(
    val title: String,
    val description: String,
    val imageUrl: String?,
    val sourceName: String,
    val publishedAd: Long,
    val url: String
)