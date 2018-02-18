package fikri6998.fikrialfitrarahadi_1202150086_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenu extends AppCompatActivity {

    private TextView mNamaMenu,mHargaMenu,mKomposisiMenu;
    private ImageView mFotoMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_menu);

        //melakukan insiasi pada id nya

        mNamaMenu = (TextView) findViewById(R.id.namamenu);

        mHargaMenu = (TextView) findViewById(R.id.hargamenu);

        mKomposisiMenu = (TextView) findViewById(R.id.komposisimenu);

        mFotoMenu = (ImageView) findViewById(R.id.fotomenu);


        //melakukan get data dari menu fitur sebelumnya sudah membawa data yang dikirim
        Intent c = getIntent();

        String menu = c.getStringExtra("judul");
        String price = c.getStringExtra("price");
        String komposisi= c.getStringExtra("komposisi");
        Integer foto = c.getIntExtra("gambar",0);

        //melakukan set tex maupun setImageResource untuk data yang sudah di bawa dari layout sbeelumnya
        mNamaMenu.setText(menu);
        mHargaMenu.setText(price);
        mKomposisiMenu.setText(komposisi);
        mFotoMenu.setImageResource(foto);



    }
}
