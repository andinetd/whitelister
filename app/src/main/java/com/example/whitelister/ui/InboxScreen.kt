package com.example.app.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun InboxScreen(
    viewModel: InboxViewModel,
    onNavigateToAllowedChats: () -> Unit,
    onNavigateToSettings: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Inbox")

        Button(onClick = onNavigateToAllowedChats) {
            Text("Go to Allowed Chats")
        }

        Button(onClick = onNavigateToSettings) {
            Text("Go to Settings")
        }
    }
}