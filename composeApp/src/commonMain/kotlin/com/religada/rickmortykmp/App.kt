package com.religada.rickmortykmp

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.religada.rickmortykmp.ui.core.navigation.NavigationWrapper
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        NavigationWrapper()
    }
}
