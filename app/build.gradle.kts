plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("plugin.compose")
}

android {
    namespace = "io.didomi.sampleappcompose"
    compileSdk = 37

    defaultConfig {
        applicationId = "io.didomi.sampleappcompose"

        minSdk = 23
        targetSdk = 37

        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        maybeCreate("release")
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlin {
        compilerOptions {
            jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
        }
    }

    packaging {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
}

dependencies {
    implementation("androidx.activity:activity-compose:1.13.0")
    implementation("androidx.compose.material:material:1.11.4")
    implementation("androidx.compose.ui:ui:1.11.4")
    implementation("androidx.compose.ui:ui-tooling-preview:1.11.4")

    implementation("androidx.core:core-ktx:1.19.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.11.0")

    implementation("com.google.android.gms:play-services-ads:25.4.0")

    implementation("io.didomi.sdk:android:2.48.0")

    debugImplementation("androidx.compose.ui:ui-test-manifest:1.11.4")
    debugImplementation("androidx.compose.ui:ui-tooling:1.11.4")
}
