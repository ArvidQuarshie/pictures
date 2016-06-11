package com.example.user.pictures;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.github.paolorotolo.appintro.AppIntro;

/**
 * Created by user on 6/20/16.
 */
public class MyIntro extends AppIntro {
    @Override
    public void init(@Nullable Bundle savedInstanceState) {
//loads the fragment
        addSlide(SampleSlide.newInstance(R.layout.fragment_first_fragment));
        addSlide(SampleSlide.newInstance(R.layout.fragment_second));
        showSkipButton(true);
        showDoneButton(true);

    }

    @Override
    public void onSkipPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }


//    public void onSkipPressed(Fragment first_fragment) {
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
//
//    }

    @Override
    public void onDonePressed() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);


    }
}

