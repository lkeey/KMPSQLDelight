package dev.lkeeeey.delight

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform