package com.distributedlife.theweekbefore.russia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.distributedlife.theweekbefore.base.HomeScreen;
import com.distributedlife.theweekbefore.base.abstractions.StaticDictionaryFilenameStore;

public class SplashScreen extends Activity {

    public static final String DICTIONARY = "/assets/russian.json";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        StaticDictionaryFilenameStore.setFilename(DICTIONARY);

        startActivity(new Intent(this, HomeScreen.class));

        finish();
    }
}
