package com.ryndenkov.news.domain.usecase

import com.ryndenkov.news.domain.repository.NewsRepository
import javax.inject.Inject

class GetAllSubscriptionsUseCase @Inject constructor(
    private val newsRepository: NewsRepository
) {

    operator fun invoke() = newsRepository.getAllSubscriptions()
}