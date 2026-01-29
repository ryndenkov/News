package com.ryndenkov.news.data.mapper

import com.ryndenkov.news.domain.entity.RefreshConfig
import com.ryndenkov.news.domain.entity.Settings

fun Settings.toRefreshConfig(): RefreshConfig {
    return RefreshConfig(language, interval, wifiOnly)
}