package com.ryndenkov.news.domain.usecase

import com.ryndenkov.news.domain.repository.SettingsRepository
import javax.inject.Inject

class GetSettingsUseCase @Inject constructor(
    private val settingsRepository: SettingsRepository
) {

    operator fun invoke() = settingsRepository.getSettings()
}
