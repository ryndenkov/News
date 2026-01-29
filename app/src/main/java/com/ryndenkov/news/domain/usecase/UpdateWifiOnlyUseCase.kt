package com.ryndenkov.news.domain.usecase

import com.ryndenkov.news.domain.repository.SettingsRepository
import javax.inject.Inject

class UpdateWifiOnlyUseCase @Inject constructor(
    private val settingsRepository: SettingsRepository
) {

    suspend operator fun invoke(wifiOnly: Boolean) {
        settingsRepository.updateWifiOnly(wifiOnly)
    }
}
