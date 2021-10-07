package com.HilalAditya.recyclerview;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.HilalAditya.recyclerview.R;
import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    //Deklarasi object
    ImageView img;
    TextView tvNama, tvKlasifikasi, tvMakanan, tvDeskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Memberikan nilai dengan memanggil ID setiap object
        img = findViewById(R.id.img);
        tvNama = findViewById(R.id.tvNama);
        tvKlasifikasi = findViewById(R.id.tvKlasifikasi);
        tvMakanan = findViewById(R.id.tvMakanan);
        tvDeskripsi = findViewById(R.id.tvDeskripsi);

        //Menjalankan pegambilan data
        getIncomingExtra();
    }
    //Method untuk mengambil data yang dikirimkan
    private void getIncomingExtra() {
        //Pengecekan apakah memiliki Extra
        if(getIntent().hasExtra("gambar") && getIntent().hasExtra("namahewan")
                && getIntent().hasExtra("klasifikasi")
                && getIntent().hasExtra("makanan") & getIntent().hasExtra("deskripsi")){

            //Membuat variable untuk mengambil nilai string
            String gambar = getIntent().getStringExtra("gambar");
            String namahewan = getIntent().getStringExtra("namahewan");
            String klasifikasi = getIntent().getStringExtra("klasifikasi");
            String makanan = getIntent().getStringExtra("makanan");
            String deskripsi = getIntent().getStringExtra("deskripsi");

            //Menjalankan
            setDataActivity(gambar, namahewan, klasifikasi, makanan, deskripsi);
        }
    }
    //Method untuk mengirimkan data
    private void setDataActivity(
            String gambar, String namahewan, String klasifikasi, String makanan,String deskripsi){

        //Memasukkan data ke dalam objek sesuai dengan tempatnya
        Glide.with(this).asBitmap().load(gambar).into(img);
        tvNama.setText(namahewan);
        tvKlasifikasi.setText(klasifikasi);
        tvMakanan.setText(makanan);
        tvDeskripsi.setText(deskripsi);

    }
}