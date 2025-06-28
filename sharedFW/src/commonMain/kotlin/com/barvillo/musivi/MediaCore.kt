package com.barvillo.musivi

interface Platform {
    val name: String
}

expect class Song
expect fun getSongs(): ArrayList<Song>

expect fun getPlatform(): Platform