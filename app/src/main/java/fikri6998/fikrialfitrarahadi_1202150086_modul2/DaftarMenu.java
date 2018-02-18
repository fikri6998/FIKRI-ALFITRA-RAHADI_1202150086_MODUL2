package fikri6998.fikrialfitrarahadi_1202150086_modul2;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {

    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataMenu;
    private ArrayList<String> dataHarga;
    private ArrayList<Integer> foto;


    //Daftar Menu Makanan
    private String[] Judul = {"Grilled Butter Prawns", "Pastrami Wrapped Barramundi","Grilled Lamb Leg","Oven-Roasted Salmon","Benedict Loco Moco","Foie Gras Rice"};
    //Daftar Harga
    private String[] test = {"Rp. 130.000", "Rp. 130.000","Rp. 90.000","Rp. 135.000","Rp. 85.000","Rp. 140.000"};
    //Daftar Gambar
    private int[] Foto = {R.drawable.gambar_1, R.drawable.gambar_2,R.drawable.gambar_3,R.drawable.gambar_4,R.drawable.gambar_5,
            R.drawable.gambar_6};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftar_menu);

        //mendeklarasikan array list untuk menu, harga dan gambar
        dataMenu = new ArrayList<>();
        dataHarga = new ArrayList<>();
        foto = new ArrayList<>();
        DaftarItem();


        rvView = (RecyclerView) findViewById(R.id.recyclerview);
        rvView.setHasFixedSize(true);

        /**
         * Kita menggunakan LinearLayoutManager untuk list standar
         * yang hanya berisi daftar item
         * disusun dari atas ke bawah
         */
        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(dataMenu,dataHarga,foto);
        rvView.setAdapter(adapter);

    }

    //Mengambil data dari Varibale Gambar dan Judul, lalu memasangnya pada list yang terhubung dengan Class Adapter
    private void DaftarItem(){
        for (int w=0; w<Judul.length; w++){
            dataMenu.add(Judul[w]);
            dataHarga.add(test[w]);
            foto.add(Foto[w]);
        }
    }

}

