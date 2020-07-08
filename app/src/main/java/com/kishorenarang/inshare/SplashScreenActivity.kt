package com.kishorenarang.inshare

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ramotion.paperonboarding.PaperOnboardingPage

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        val src1 = PaperOnboardingPage(
            "Hotels",
            "Description Text",
            Color.parseColor("#678FB4"),
            R.drawable.onboarding_pager_circle_icon,
            R.drawable.ic_menu_gallery
        )



    }
}
