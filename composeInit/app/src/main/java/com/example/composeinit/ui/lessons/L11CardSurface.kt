package com.example.composeinit.ui.lessons

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.composeinit.enuns.AccentOption
import com.example.composeinit.ui.lesson.LessonScaffold
import com.example.composeinit.ui.lesson.OptionsControl
import com.example.composeinit.ui.lesson.SliderControl
import com.example.composeinit.ui.theme.ComposeInitTheme
import kotlin.math.roundToInt

@Composable
fun L11CardSurface(modifier: Modifier = Modifier) {
    var elevation by remember { mutableStateOf(2f) }
    var accent by remember { mutableStateOf(AccentOption.PRIMARY) }

    LessonScaffold(
        title = "Card e Surface",
        notice = "",
        controls = {
            SliderControl(
                "elevation",
                value = elevation,
                onValueChange = {
                    elevation = it
                },
                range = 0f..12f
            )

            OptionsControl(
                label = "Cor destaque",
                options = AccentOption.entries.toList(),
                selected = accent,
                optionLabel = {it.label},
                onSelected = { accent = it }
            )
        }
    ) {
        CardDemo(
            elevation = elevation.roundToInt().dp,
            accentOption = accent
        )
    }
}

@Composable
fun CardDemo(
    elevation: Dp,
    accentOption: AccentOption
) {
    val cor: Color = when(accentOption){
        AccentOption.PRIMARY -> MaterialTheme.colorScheme.primary
        AccentOption.TERTIARY -> MaterialTheme.colorScheme.tertiary
        AccentOption.ERROR -> MaterialTheme.colorScheme.error
    }
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(elevation)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                androidx.compose.material3.Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = null,
                    tint = cor
                )
                Text(
                    "Favorito",
                    style = MaterialTheme.typography.titleMedium
                )
            }
            HorizontalDivider(
                modifier = Modifier.padding(
                    vertical = 8.dp,
                ),
                color = cor
            )
        }

    }
}

@Preview
@Composable
private fun L11CardSurfacePreview() {
    ComposeInitTheme{
        L11CardSurface()
    }
}