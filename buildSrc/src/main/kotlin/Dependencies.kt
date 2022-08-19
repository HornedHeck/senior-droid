import org.gradle.launcher.Main

object MainDependencies {

    const val JUNIT4 = "junit:junit:${MainLibs.JUNIT4}"

}

object AndroidDependencies {

    const val KTX_CORE = "androidx.core:core-ktx:${Android.KTX_CORE}"
    const val COMPAT = "androidx.appcompat:appcompat:${Android.COMPAT}"
    const val GOOGLE_MATERIAL = "com.google.android.material:material:${Android.GOOGLE_MATERIAL}"
    const val JUNIT_ANDROID = "androidx.test.ext:junit:${Android.JUNIT_ANDROID}"
    const val ESPRESSO = "androidx.test.espresso:espresso-core:${Android.ESPRESSO}"

}