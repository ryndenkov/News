package com.ryndenkov.news.domain.usecase

import com.ryndenkov.news.domain.entity.Language
import com.ryndenkov.news.domain.repository.SettingsRepository
import javax.inject.Inject

class UpdateLanguageUseCase @Inject constructor(
    private val settingsRepository: SettingsRepository
) {

    suspend operator fun invoke(language: Language) {
        settingsRepository.updateLanguage(language)
    }
}