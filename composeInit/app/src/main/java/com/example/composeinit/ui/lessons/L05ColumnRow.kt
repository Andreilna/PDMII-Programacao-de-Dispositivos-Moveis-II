
package com.example.composeinit.ui.lessons

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeinit.enuns.ArrangementOption
import com.example.composeinit.enuns.RowAlignmentOption
import com.example.composeinit.ui.components.RowDemo
import com.example.composeinit.ui.lesson.LessonScaffold
import com.example.composeinit.ui.lesson.OptionsControl

@Composable
fun L05ColumnRow() {
    var arrangement by remember {
        mutableStateOf(ArrangementOption.START)
    }

    var alignment by remember {
        mutableStateOf(RowAlignmentOption.CENTER)
    }

    LessonScaffold(
        title = "Column e Row",
        notice = "As três caixas estão numa Row. 'arrangement' muda como o espaço " +
                "horizontal é distribuído; 'alignment' posiciona as caixas no topo, " +
                "no meio ou na base. A Column faria o mesmo, só que na vertical.",
        controls = {
            OptionsControl(
                label = "HorizontalArrangement",
                options = ArrangementOption.entries.toList(),
                selected = arrangement,
                optionLabel = { it.label },
                onSelected = {
                    arrangement = it
                }
            )

            OptionsControl(
                label = "VerticalAlignment",
                options = RowAlignmentOption.entries.toList(),
                selected = alignment,
                optionLabel = { it.label },
                onSelected = {
                    alignment = it
                }
            )
        }
    ) {
        RowDemo(
            arrangementOption = arrangement.value,
            alignmentOption = alignment.value
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun L05ColumnRowPreview() {
    L05ColumnRow()
}
