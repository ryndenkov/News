package com.ryndenkov.news.domain.usecase

import com.ryndenkov.news.domain.entity.Interval
import com.ryndenkov.news.domain.repository.SettingsRepository
import javax.inject.Inject

class UpdateIntervalUseCase @Inject constructor(
    private val settingsRepository: SettingsRepository
) {

    suspend operator fun invoke(interval: Interval) {
        settingsRepository.updateInterval(interval.minutes)
    }
}