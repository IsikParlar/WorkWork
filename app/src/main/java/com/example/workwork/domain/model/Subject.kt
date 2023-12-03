package com.example.workwork.domain.model

import androidx.compose.ui.graphics.Color
import com.example.workwork.presentation.theme.gradient1
import com.example.workwork.presentation.theme.gradient2
import com.example.workwork.presentation.theme.gradient3
import com.example.workwork.presentation.theme.gradient4
import com.example.workwork.presentation.theme.gradient5

data class Subject(
    val name: String,
    val goalHours: Float,
    val colors: List<Color>,
    val subjectId: Int
){
    //companion object in Kotlin is a construct used to provide access to static fields and methods of a class without needing an instance of the class.
    companion object {
        val subjectCardColors = listOf(gradient1, gradient2, gradient3, gradient4, gradient5)
    }
}
