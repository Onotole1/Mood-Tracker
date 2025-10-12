package ru.netology.moodtracker

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ru.netology.moodtracker.ui.theme.MoodTrackerTheme

@Composable
fun MoodScreenContent(onMoodClicked: (Mood) -> Unit, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "Выберите настроение", style = MaterialTheme.typography.titleMedium)
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            @Composable
            fun MoodButton(mood: Mood) {
                TextButton(onClick = { onMoodClicked(mood) }) {
                    Text(mood.title)
                }
            }

            Mood.entries.forEach { MoodButton(it) }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MoodScreenPreview() {
    MoodTrackerTheme {
        MoodScreenContent(onMoodClicked = {})
    }
}