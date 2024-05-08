package com.example.myfirstkmmapp.domain.note

import com.example.myfirstkmmapp.presentation.BabyBlueHex
import com.example.myfirstkmmapp.presentation.LightGreenHex
import com.example.myfirstkmmapp.presentation.RedOrangeHex
import com.example.myfirstkmmapp.presentation.RedPinkHex
import com.example.myfirstkmmapp.presentation.VioletHex
import kotlinx.datetime.LocalDateTime

data class Note(
    val id: Long?,
    val title: String,
    val content: String,
    val colorHex: Long,
    val createdDateTime: LocalDateTime
){
    companion object{
        private val colors = listOf(RedOrangeHex, RedPinkHex, LightGreenHex, BabyBlueHex, VioletHex)
        fun generateRandomColor() = colors.random()
    }
}
