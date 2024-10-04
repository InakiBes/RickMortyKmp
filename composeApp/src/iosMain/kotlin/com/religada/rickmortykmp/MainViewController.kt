package com.religada.rickmortykmp

import androidx.compose.ui.window.ComposeUIViewController
import com.religada.rickmortykmp.di.initKoin

fun MainViewController() = ComposeUIViewController(configure = { initKoin() }) { App() }