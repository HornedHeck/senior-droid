plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = 32

    defaultConfig {
        applicationId = "dev.hornedheck.andoroidsamples"
        minSdk = 21
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        val options = this as org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions
        options.jvmTarget = "1.8"
    }
}

dependencies {
    implementation(Android.KTX_CORE)
    implementation(Android.COMPAT)
    implementation(Android.GOOGLE_MATERIAL)
    implementation(Android.KTX_VM)
    implementation(Android.CONSTRAINT_LAYOUT)

    implementation(Koin.CORE)
    implementation(Koin.ANDROID)

    testImplementation(Main.JUNIT4)
    testImplementation(Koin.TEST)
    testImplementation(Koin.JUNIT4)

    androidTestImplementation(Android.JUNIT_ANDROID)
    androidTestImplementation(Android.ESPRESSO)
}