package dev.rahulhgdev.ind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    //splash screen time i.e 4000 milliseconds = 4sec

    private static int intro_Time = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent_qr = new Intent(MainActivity.this,QR_activity.class);
                startActivity(intent_qr);
                finish();
            }
        },intro_Time);
    }
}