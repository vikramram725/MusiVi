package com.barvillo.musivi

import dev.icerock.moko.resources.ImageResource
import dev.icerock.moko.resources.getImageByFileName

fun getImageByFileName(name: String): ImageResource {
    val fallbackImage = MusiViRes.MR.images.app_logo
    return MusiViRes.MR.images.getImageByFileName(name) ?: fallbackImage
}