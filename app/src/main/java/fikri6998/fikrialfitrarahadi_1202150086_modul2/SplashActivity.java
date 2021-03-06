package fikri6998.fikrialfitrarahadi_1202150086_modul2;

import android.content.Intent;
import android.os.Handler;
import android.service.autofill.FillEventHistory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGTH = 3000;

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_splash);

        //memungkinkan anda untuk mengirim atau memproses objek message disini kasusnya adalah menampilkan toast setelah muncul
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //melakukan intent ke menu selanjutnya setelah splash screen sudah muncul
                Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
                SplashActivity.this.startActivity(mainIntent);
                //jeda selesai Splashscreen
                SplashActivity.this.finish();

            }
        }, SPLASH_DISPLAY_LENGTH);



    }


}

