package com.barvillo.musivi

import android.provider.MediaStore

class AndroidPlatform : Platform {
    override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

actual typealias Song = MediaStore
actual fun getSongs(): ArrayList<Song> {
    TODO()
}
actual fun getPlatform(): Platform = AndroidPlatform()