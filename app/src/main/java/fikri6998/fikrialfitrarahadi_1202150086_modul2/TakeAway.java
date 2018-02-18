package fikri6998.fikrialfitrarahadi_1202150086_modul2;

import android.app.DialogFragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.Toast;

public class TakeAway extends AppCompatActivity {

    private TextInputLayout mNamaCustomer,mPhoneCustomer,mAlamatCustomer,mCatatanCustomer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.take_away);

        mNamaCustomer = (TextInputLayout) findViewById(R.id.nama_customer);
        mPhoneCustomer = (TextInputLayout) findViewById(R.id.phone_customer);
        mAlamatCustomer = (TextInputLayout) findViewById(R.id.alamat_customer);
        mCatatanCustomer = (TextInputLayout) findViewById(R.id.catatan_customer);
    }

    public void pilih_pesan(View view) {

        String nama = mNamaCustomer.getEditText().getText().toString();
        String telepon = mPhoneCustomer.getEditText().getText().toString();
        String alamat = mAlamatCustomer.getEditText().getText().toString();
        String catatan = mCatatanCustomer.getEditText().getText().toString();

        if (nama.isEmpty()|| telepon.isEmpty() || alamat.isEmpty() || catatan.isEmpty()){
            Toast.makeText(this,"Isi Dulu Data Yang Ada",Toast.LENGTH_LONG).show();
        }

        //mengirimkan nama dan jumlah ke dalam intent agar bisa di get pada class yang di tuju
        Intent intent = new Intent(TakeAway.this,DaftarMenu.class);
        startActivity(intent);
    }

    public void showDatePickerDialog(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getFragmentManager(), getString(R.string.date_picker));
    }

    public void showTimePickerDialog(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getFragmentManager(), getString(R.string.time_picker));
    }

    public void processDatePickerResult(int year, int month, int day) {

        mNamaCustomer = (TextInputLayout) findViewById(R.id.nama_customer);
        mPhoneCustomer = (TextInputLayout) findViewById(R.id.phone_customer);

        //membuat string nama dana jumlah untuk mengambil nilai dari TextInputLayout
        String nama = mNamaCustomer.getEditText().getText().toString();
        String telepon = mPhoneCustomer.getEditText().getText().toString();

        if (nama.isEmpty() || telepon.isEmpty()) {
            Toast.makeText(this, "ISI TERLEBIH DAHULU", Toast.LENGTH_LONG).show();
        } else {

            //Memasukkan bulan pertama dan bulan selanjutnya
            String month_string = Integer.toString(month + 1);
            String day_string = Integer.toString(day);
            String year_string = Integer.toString(year);
            // Assign the concatenated strings to dateMessage.
            String dateMessage = (month_string + "/" + day_string + "/" + year_string);
            Toast.makeText(this, "Nama : " + nama + "\n Phone : " + telepon + "\n Waktu Mengambil Pesanan : " + getString(R.string.date_picker) + dateMessage, Toast.LENGTH_SHORT).show();
        }
    }

    public void processTimePickerResult(int hourOfDay, int minute) {
        //membuat string nama dana jumlah untuk mengambil nilai dari TextInputLayout
        String nama = mNamaCustomer.getEditText().getText().toString();
        String telepon = mPhoneCustomer.getEditText().getText().toString();

        if (nama.isEmpty() || telepon.isEmpty()) {
            Toast.makeText(this, "ISI TERLEBIH DAHULU", Toast.LENGTH_LONG).show();
        } else {

            // melakukan convert kedalam waktu
            String hour_string = Integer.toString(hourOfDay);
            String minute_string = Integer.toString(minute);
            String timeMessage = (hour_string + ":" + minute_string);
            Toast.makeText(this, "Nama : " + nama + "\n Phone : " + telepon + "\n Waktu Mengambil Pesanan : " + getString(R.string.time_picker) + timeMessage, Toast.LENGTH_SHORT).show();
        }
    }
}
