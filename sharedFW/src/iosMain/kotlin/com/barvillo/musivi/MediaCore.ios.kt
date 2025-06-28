package com.barvillo.musivi

import platform.UIKit.UIDevice
import platform.MediaPlayer.MPMediaItem

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual typealias Song = MPMediaItem
actual fun getSongs(): ArrayList<Song> {
    TODO("Not yet implemented")
}
actual fun getPlatform(): Platform = IOSPlatform()
