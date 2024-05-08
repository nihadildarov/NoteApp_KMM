plugins {
    //trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.androidApplication).apply(false)
    alias(libs.plugins.androidLibrary).apply(false)
    alias(libs.plugins.kotlinAndroid).apply(false)
    alias(libs.plugins.kotlinMultiplatform).apply(false)
    id("org.jetbrains.kotlin.kapt") version "1.9.21" apply false
    id("com.google.dagger.hilt.android") version "2.48" apply false
}
buildscript {
    repositories {
        mavenCentral()
        google()
    }

    dependencies{

        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.7")
        classpath("com.google.gms:google-services:4.4.1")
    }
}
//plugins {
//    id("com.android.application") version "8.2.1" apply false
//    id("org.jetbrains.kotlin.android") version "1.9.20" apply false
//    id("org.jetbrains.kotlin.kapt") version "1.9.21" apply false
//    //id("org.jetbrains.kotlin.ksp") version "1.9.21" apply  false
//    id("com.google.dagger.hilt.android") version "2.48" apply false
//    id("com.google.gms.google-services") version "4.4.1" apply false
//
//}