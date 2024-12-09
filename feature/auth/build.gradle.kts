plugins {
    id("chaeum.android.feature")
    alias(libs.plugins.androidx.navigation.safeargs)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.example.auth"
}

dependencies {
    implementation(libs.kotlinx.serialization.json)
}