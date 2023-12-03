 package com.example.workwork

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.workwork.presentation.dashboard.DashboardScreen
import com.example.workwork.presentation.theme.WorkWorkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WorkWorkTheme {
                // A surface container using the 'background' color from the theme
                DashboardScreen()
            }
        }
    }
}

