plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.core"
    baseAndroidConfig()
    buildFeatures {
        compose = true
        buildConfig = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
}


dependencies {
    //Compose
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.material3.android)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.runtime.livedata)
    implementation(libs.firebase.crashlytics.buildtools)
    implementation(libs.androidx.work.runtime.ktx)
    implementation(libs.androidx.hilt.common)
    androidTestImplementation(platform(libs.androidx.compose.bom))


    //UI
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)


    //Livecycle
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.common.java8)
    implementation(libs.androidx.lifecycle.viewmodel.savedstate)
    implementation(libs.androidx.lifecycle.service)
    implementation(libs.androidx.lifecycle.process)
    implementation(libs.androidx.lifecycle.reactivestreams.ktx)
    testImplementation(libs.androidx.lifecycle.runtime.testing)

    //Core
    testImplementation(libs.androidx.core.testing)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation(libs.androidx.core.ktx)

    //Material3
    implementation(libs.androidx.material3)


    //Junit
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)

    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)


    // Navigation Component
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)

    // Feature module Support
    implementation(libs.androidx.navigation.dynamic.features.fragment)

    // Testing Navigation
    androidTestImplementation(libs.androidx.navigation.testing)

    //Material design
    implementation(libs.material)

    // Coroutines
    api(libs.kotlinx.coroutines.core)
    api(libs.kotlinx.coroutines.android)

    //Gson
    implementation(libs.converter.gson)


    //DatePicker
    implementation(libs.datetime)
    coreLibraryDesugaring(libs.desugar.jdk.libs)

    implementation(libs.accompanist.swiperefresh)

    implementation(libs.androidx.work.runtime.ktx.v271)

}