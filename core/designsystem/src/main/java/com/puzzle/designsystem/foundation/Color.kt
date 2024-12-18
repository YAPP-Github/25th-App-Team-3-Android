package com.puzzle.designsystem.foundation

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

val PrimaryDefault = Color(0xFF6200EE)
val PrimaryMiddle = Color(0xFFBB86FC)
val PrimaryLight = Color(0xFFEDE7F6)

val SubDefault = Color(0xFFF48FB1)
val SubMiddle = Color(0xFFF8BBD0)
val SubLight = Color(0xFFFCE4EC)

val Black = Color(0xFF212121)
val Dark1 = Color(0xFF424242)
val Dark2 = Color(0xFF616161)
val Dark3 = Color(0xFF757575)
val Light1 = Color(0xFFBDBDBD)
val Light2 = Color(0xFFE0E0E0)
val Light3 = Color(0xFFEEEEEE)
val White = Color(0xFFF5F5F5)

@Immutable
data class PieceColors(
    val primaryDefault: Color = PrimaryDefault,
    val primaryMiddle: Color = PrimaryMiddle,
    val primaryLight: Color = PrimaryLight,
    val subDefault: Color = SubDefault,
    val subMiddle: Color = SubMiddle,
    val subLight: Color = SubLight,
    val black: Color = Black,
    val dark1: Color = Dark1,
    val dark2: Color = Dark2,
    val dark3: Color = Dark3,
    val light1: Color = Light1,
    val light2: Color = Light2,
    val light3: Color = Light3,
    val white: Color = White,
)
