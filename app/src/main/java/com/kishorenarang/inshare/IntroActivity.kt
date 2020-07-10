package com.kishorenarang.inshare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.chyrta.onboarder.OnboarderActivity
import com.chyrta.onboarder.OnboarderPage

class IntroActivity : OnboarderActivity {


    var onboarderList:ArrayList<OnboarderPage>;

    constructor()
    {
        onboarderList = ArrayList<OnboarderPage>();

    }

    override fun onFinishButtonPressed() {



    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val ob1 = OnboarderPage("Fast Transfers", "Send Your Media Files Very Over the wi-fi with fastest speed possible", R.drawable.rocket)
        val ob2 = OnboarderPage("News Feet", "Enjoy the complimentry trending news arround you. No need to install the additional application. ", R.drawable.newspaper)

        ob1.backgroundColor = R.color.inPrimary
        ob1.titleColor = R.color.inTextWhite
        ob1.descriptionColor = R.color.inTextWhite

        ob2.backgroundColor = R.color.inPrimarySecond
        ob1.titleColor = R.color.inTextBlack
        ob1.descriptionColor = R.color.inTextBlack

        this.onboarderList.add(ob1);
        this.onboarderList.add(ob2);





    Log.e("D", ""+setOnboardPagesReady(this.onboarderList).toString());

    }
}
