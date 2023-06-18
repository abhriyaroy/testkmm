package studio.zebro.testkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform