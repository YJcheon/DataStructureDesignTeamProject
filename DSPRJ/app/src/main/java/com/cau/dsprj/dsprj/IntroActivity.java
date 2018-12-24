package com.cau.dsprj.dsprj;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class IntroActivity extends AppCompatActivity {
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        handler = new Handler();
        handler.postDelayed(mrun, 2000);
    }
    Runnable mrun = new Runnable() {
        @Override
        public void run() {
            Intent MainActivity = new Intent(IntroActivity.this, MainActivity.class);
            startActivity(MainActivity);
            finish();
        }
    };
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        handler.removeCallbacks(mrun);
    }
}
