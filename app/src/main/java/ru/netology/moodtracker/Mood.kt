package ru.netology.moodtracker

enum class Mood {
    GOOD,
    NEUTRAL,
    BAD,
    ;

    val title: String
        get() = when (this) {
            GOOD -> "Хорошее"
            NEUTRAL -> "Нейтральное"
            BAD -> "Плохое"
        }
}
