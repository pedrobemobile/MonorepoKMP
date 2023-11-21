package com.example.monorepokmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform