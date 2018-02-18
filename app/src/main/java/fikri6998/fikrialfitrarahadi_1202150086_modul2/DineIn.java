package fikri6998.fikrialfitrarahadi_1202150086_modul2;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class DineIn extends AppCompatActivity {

    private Spinner mNomorMeja;
    private TextInputLayout mNamaCustomer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dine_in);

        mNomorMeja = (Spinner) findViewById(R.id.nomor_meja);

        //memanggil array untuk menampung data yang ada pada spinner nantinya
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.labels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //jika spinner tidak kosong maka akan menset isi adapter dengan isi yang kita sudah masukkan di string.xml
        if (mNomorMeja != null){
            mNomorMeja.setAdapter(adapter);
        }
    }

    public void LaunchpilihPesanan(View view) {

        mNamaCustomer = (TextInputLayout) findViewById(R.id.nama_customer);

        //membuat string test agar spinner dapat dipilih
        String test = mNomorMeja.getSelectedItem().toString();

        //jika spinner null
        if (mNamaCustomer ==null){
            Toast.makeText(this,"Isi dulu bro",Toast.LENGTH_LONG).show();
        }
        //jika dipilih meja 1 akan muncul toast kalau memilih meja 1
        else if (test.equalsIgnoreCase("Meja 1")){
            String nama = mNamaCustomer.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 1",Toast.LENGTH_LONG).show();
        }
        //jika dipilih meja 1 akan muncul toast kalau memilih meja 2
        else if (test.equalsIgnoreCase("Meja 2")){
            String nama = mNamaCustomer.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 2",Toast.LENGTH_LONG).show();
        }
        //jika dipilih meja 1 akan muncul toast kalau memilih meja 3
        else if (test.equalsIgnoreCase("Meja 3")){
            String nama = mNamaCustomer.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 3",Toast.LENGTH_LONG).show();
        }
        //jika dipilih meja 1 akan muncul toast kalau memilih meja 4
        else if (test.equalsIgnoreCase("Meja 4")){
            String nama = mNamaCustomer.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 4",Toast.LENGTH_LONG).show();
        }
        //jika dipilih meja 1 akan muncul toast kalau memilih meja 5
        else if (test.equalsIgnoreCase("Meja 5")){
            String nama = mNamaCustomer.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 5",Toast.LENGTH_LONG).show();
        }


        //membuat string nama dana jumlah untuk mengambil nilai dari TextInputLayout
        //   String nama1 = a.getEditText().getText().toString();
//
        //mengirimkan nama dan jumlah ke dalam intent agar bisa di get pada class yang di tuju
        Intent intent = new Intent(DineIn.this,DaftarMenu.class);
        startActivity(intent);

    }

    }

