// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    dependencies {
        val navigation_version = "2.7.7"
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$navigation_version")
        val dagger_version = "2.51.1"
        classpath("com.google.dagger:hilt-android-gradle-plugin:$dagger_version")
    }
}
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
}