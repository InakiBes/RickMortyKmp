package com.religada.rickmortykmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform