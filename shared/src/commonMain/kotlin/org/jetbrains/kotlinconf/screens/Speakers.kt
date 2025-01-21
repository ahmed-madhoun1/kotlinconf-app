package org.jetbrains.kotlinconf.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import kotlinconfapp.shared.generated.resources.Res
import kotlinconfapp.shared.generated.resources.arrow_left_24
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.kotlinconf.SpeakerId
import org.jetbrains.kotlinconf.Speakers
import org.jetbrains.kotlinconf.ui.components.StyledText

@Composable
fun Speakers(
    speakers: Speakers,
    onSpeaker: (SpeakerId) -> Unit,
    onBack: () -> Unit,
) {
    Column {
        Image(
            painterResource(Res.drawable.arrow_left_24),
            "back",
            modifier = Modifier.clickable { onBack() })
        StyledText("Speakers")
        for (speaker in speakers.all) {
            StyledText(
                speaker.name,
                modifier = Modifier.clickable { onSpeaker(speaker.id) }
            )
        }
    }
}
