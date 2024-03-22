plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.desafio"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.desafio"
        minSdk = 25
        //targetSdk = 25
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
       // kotlinCompilerExtensionVersion = '1.1.0-alpha01' // Substitua pela versão mais recente
      //  kotlinCompilerVersion = '1.5.21' // Substitua pela versão mais recent
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(libs.androidx.runtime.livedata.v105)
    implementation(libs.ui)
    implementation(libs.material3)
    implementation(libs.androidx.activity.compose.v131)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.androidx.runtime.livedata)
    implementation(libs.ui.tooling.preview) // Adicione esta linha para visualizar Composables
    implementation(libs.material)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.core.ktx.v170)
    implementation(libs.kotlin.stdlib)
    implementation(libs.retrofit)
    implementation(libs.converter.gson)
    implementation(libs.kotlinx.coroutines.android) // Adicione esta linha para suporte a Coroutines
    implementation(libs.ui.tooling) // Adicione esta linha para suporte ao Preview
    implementation(libs.ui.test.junit4)
    implementation(libs.androidx.material3.android)
    implementation(libs.androidx.compose.material)
    implementation(libs.androidx.runtime) // Adicione esta linha para testes de Composables
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit.v113)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
}
