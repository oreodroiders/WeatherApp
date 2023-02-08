package com.github.odaridavid.weatherapp.core.model

enum class Units(val value: String, val tempLabel: String) {
    STANDARD("standard","°F"),
    METRIC("metric","°C"),
    IMPERIAL("imperial","°F"),
}
