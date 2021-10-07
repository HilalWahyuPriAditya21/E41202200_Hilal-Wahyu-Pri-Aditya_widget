package com.HilalAditya.recyclerview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.HilalAditya.recyclerview.R;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.viewHolder>{

    //Menambahkan properti ArrayList
    private ArrayList<String> gambar = new ArrayList<>();
    private ArrayList<String> namahewan = new ArrayList<>();
    private ArrayList<String> klasifikasi = new ArrayList<>();
    private ArrayList<String> makanan = new ArrayList<>();
    private ArrayList<String> deskripsi = new ArrayList<>();
    private Context context;
    //Menambahkan adapter
    public RecyclerViewAdapter(ArrayList<String> gambar,
                               ArrayList<String> namahewan,
                               ArrayList<String> klasifikasi,
                               ArrayList<String> makanan,
                               ArrayList<String> deskripsi,
                               Context context) {
        this.gambar = gambar;
        this.namahewan = namahewan;
        this.klasifikasi = klasifikasi;
        this.makanan = makanan;
        this.deskripsi = deskripsi;
        this.context = context;
    }

    //Layout
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        viewHolder holder = new viewHolder(view);
        return holder;
    }

    //Mengambil data dari setiap item
    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, @SuppressLint("RecyclerView") int position) {
        Glide.with(context).asBitmap().load( gambar.get(position)).into(holder.gambar);
        holder.nama.setText(namahewan.get(position));

        //Menambahkan event klik
        holder.linearlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Berpindah ke DetailActivity
                Intent intent = new Intent(context, DetailActivity.class);

                //Menyimpan data di dalam memori terlehi dahulu kemudian diterima oleh DetailActtivity
                intent.putExtra("gambar", gambar.get(position));
                intent.putExtra("namahewan", namahewan.get(position));
                intent.putExtra("klasifikasi", klasifikasi.get(position));
                intent.putExtra("makanan", makanan.get(position));
                intent.putExtra("deskripsi", deskripsi.get(position));

                //mengirimkan data
                context.startActivity(intent);
            }
        });
    }

    //Menentukan urutan item
    @Override
    public int getItemCount() {
        return namahewan.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        //Menambahkan property
        ImageView gambar;
        TextView nama;
        LinearLayout linearlayout;

        //Membuat constructor class viewHolder
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.img);
            nama = itemView.findViewById(R.id.tvNama);
            linearlayout = itemView.findViewById(R.id.linearLayout);
        }
    }
}
