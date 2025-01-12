@file:Suppress("UnstableApiUsage")

plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "io.didomi.sampleappcompose"
    compileSdk = 34

    defaultConfig {
        applicationId = "io.didomi.sampleappcompose"

        minSdk = 24
        targetSdk = 34

        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.14"
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    packaging {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
}

dependencies {
    implementation("androidx.activity:activity-compose:1.9.1")
    implementation("androidx.compose.material:material:1.6.8")
    implementation("androidx.compose.ui:ui:1.6.8")
    implementation("androidx.compose.ui:ui-tooling-preview:1.6.8")

    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.4")

    implementation("com.google.android.gms:play-services-ads:23.3.0")

    implementation("io.didomi.sdk:android:2.18.0")

    debugImplementation("androidx.compose.ui:ui-test-manifest:1.6.8")
    debugImplementation("androidx.compose.ui:ui-tooling:1.6.8")
}
