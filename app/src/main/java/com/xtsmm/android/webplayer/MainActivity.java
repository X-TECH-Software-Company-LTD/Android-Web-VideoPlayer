package com.xtsmm.android.webplayer;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.xtsmm.library.android.webplayer.WebPlayer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        /*
        1 - require android:configChanges to prevent screen rotate restarts
        2 - require Manifest Internet Permission
        3 - require requestWindowFeature(Window.FEATURE_NO_TITLE); getSupportActionBar().hide();
        4 - using clapper js
        */


        setContentView(new WebPlayer(this).play("https://content.jwplatform.com/manifests/yp34SRmf.m3u8","https://cdn57.androidauthority.net/wp-content/uploads/2015/11/00-best-backgrounds-and-wallpaper-apps-for-android.jpg"));
    }
}