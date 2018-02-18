package fikri6998.fikrialfitrarahadi_1202150086_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mPesansekarang;
    private RadioGroup mPilihMakanan;
    private RadioButton mDineIn,mTakeAway;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPesansekarang = (Button) findViewById(R.id.buttonPesan);

        mPilihMakanan = (RadioGroup) findViewById(R.id.pilihMakanan);

        mDineIn = (RadioButton) findViewById(R.id.dineIn);

        mTakeAway = (RadioButton) findViewById(R.id.takeAway);


        Toast.makeText(this,"FIKRI ALFITRA RAHADI_1202150086",
                Toast.LENGTH_SHORT).show();
    }

    public void LaunchPilih(View view) {

        mPilihMakanan = (RadioGroup) findViewById(R.id.pilihMakanan);

        mDineIn = (RadioButton) findViewById(R.id.dineIn);

        mTakeAway = (RadioButton) findViewById(R.id.takeAway);


    }

    public void LaunchPesan(View view) {

            int PilihMakanan = mPilihMakanan.getCheckedRadioButtonId();
            switch (PilihMakanan){
                case R.id.takeAway:
                    Toast.makeText(this,"Take Away",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(this,TakeAway.class));
                    break;
                case R.id.dineIn:
                    Toast.makeText(this,"Dine In",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(this,DineIn.class));
                    break;
                default:break;
            }
        }






    public void PilihMakanan(View view) {

        // agar radio button dapat di pilih
        int selecteditem = mPilihMakanan.getCheckedRadioButtonId();

        //jika yang dpilih adalah Dine In dan akan muncul toast yang beriikan anda memilih dine in
        if (selecteditem == mDineIn.getId()){
            Toast.makeText(this,"Dine In",Toast.LENGTH_LONG).show();

            //membuat intent yang mengarah ke DineIn.class
            Intent a = new Intent(MainActivity.this,DineIn.class);
            startActivity(a);
        }
        else if (selecteditem == mTakeAway.getId()){
            Toast.makeText(this,"Take Away",Toast.LENGTH_LONG).show();

            //membuat intent yang mengarah ke TakeAway.class
            Intent a = new Intent(MainActivity.this,TakeAway.class);
            startActivity(a);
        }else {
            Toast.makeText(this,"Pilih salah satu terlebih dahulu",Toast.LENGTH_SHORT).show();
        }

    }

}
