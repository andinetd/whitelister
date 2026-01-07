package com.example.whitelister

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.app.ui.*
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            NavHost(
                navController = navController,
                startDestination = Routes.INBOX
            ) {
                composable(Routes.INBOX) {
                    InboxScreen(
                        viewModel = hiltViewModel(),
                        onNavigateToAllowedChats = { navController.navigate(Routes.ALLOWED_CHATS) },
                        onNavigateToSettings = { navController.navigate(Routes.SETTINGS) }
                    )
                }
                composable(Routes.ALLOWED_CHATS) {
                    AllowedChatsScreen(hiltViewModel())
                }
                composable(Routes.SETTINGS) {
                    SettingsScreen(hiltViewModel())
                }
            }
        }
    }
}