package com.HilalAditya.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> gambar = new ArrayList<>();
    private ArrayList<String> namahewan = new ArrayList<>();
    private ArrayList<String> klasifikasi = new ArrayList<>();
    private ArrayList<String> makanan = new ArrayList<>();
    private ArrayList<String> deskripsi = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet(); //Menjalankan method
    }
    //Method untuk memproses RecyclerView
    protected  void prosesRecyclerViewAdapter(){

        RecyclerView recyclerView = findViewById(R.id.rcvHwn); //Deklarasi object yang akan digunakan
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(gambar, namahewan, klasifikasi, makanan, deskripsi, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){
        //Sapi
        namahewan.add("Sapi");
        gambar.add("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Cow_female_black_white.jpg/1280px-Cow_female_black_white.jpg");
        klasifikasi.add("Klasifikasi : Mamalia");
        makanan.add("Makanan : Tumbuhan");
        deskripsi.add("Sapi merupakan mamalia berkaki empat dengan tapak belah. Kebanyakan sapi memiliki tanduk. Walaupun demikian, seleksi genetik telah membuat sapi tanpa tanduk tersebar di mana-mana.\n" +
                "\n" +
                "Sebagai hewan ruminansia, sapi memakan dan mencerna tumbuhan melalui fermentasi dalam sistem pencernaannya. Lambung sapi terdiri atas empat ruangan, yaitu rumen, retikulum, omasum, dan abomasum. Pakan yang telah difermentasi dalam rumen kemudian diregurgitasi (dikembalikan ke mulut) untuk dikunyah lagi. Proses pengunyahan kembali inilah yang disebut ruminasi.");

        //Ikan
        namahewan.add("Ikan");
        gambar.add("https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Guppy-male.jpg/330px-Guppy-male.jpg");
        klasifikasi.add("Klasifikasi : Pisces");
        makanan.add("Makanan : Cacing Sutra, Tumbuhan air, Dll ");
        deskripsi.add("Ikan adalah anggota vertebrata poikilotermik (berdarah dingin) yang hidup di air dan bernapas dengan insang. Ikan merupakan kelompok vertebrata yang paling beraneka ragam dengan jumlah spesies lebih dari 27,000 di seluruh dunia. .\n" +
                "\n" +
                "Secara taksonomi, ikan tergolong kelompok paraphyletic yang hubungan kekerabatannya masih diperdebatkan; biasanya ikan dibagi menjadi ikan tanpa rahang (kelas Agnatha, 75 spesies termasuk lamprey dan ikan hag), ikan bertulang rawan (kelas Chondrichthyes, 800 spesies termasuk hiu dan pari), dan sisanya tergolong ikan bertulang keras (kelas Osteichthyes). Ikan dalam berbagai bahasa daerah disebut iwak.");

        //Ayam
        namahewan.add("Ayam");
        gambar.add("https://img.okezone.com/content/2020/08/21/320/2265466/eksistensi-logo-ayam-di-dunia-bisnis-dari-restoran-hingga-jamu-97G9P2QKv1.png");
        klasifikasi.add("Klasifikasi : Aves");
        makanan.add("Makanan : Tumbuhan, Biji-bijian, Cacing, Dll");
        deskripsi.add("Ayam adalah hewan aves atau unggas yang bernafas dengan paru-paru, memiliki paruh dan memiliki 2 kaki yang fungsinya untuk menggaruk tanah agar bisa mencari makan. Ayam merupakan jenis burung yang akan dimanfaatkan daging, telur, dan bulunya. Pada umunya hewan ini termasuk bagian dari rasa atau ordo gallifermos dan anserifornes, biasanya hewan ini sering dijadikan hewan ternak atau hewan peliharaan..\n" +
                "\n" +
                "Ayam ternak atau ayam peliharaan saat ini sangat mudah dijinakkan sehingga dapat dengan mudah untuk memeliharanya, salah satu kelebiha hewan ternak yatiu dapat dengan mudah beradapatasi dalam kondisi apapun tetapi harus tercukupi ketersediaan makanannya. Yang unik dari ayam adalah sistem reproduksinya yang diatur oleh hormon, jika ayam mengalami gangguan pada fungsi fisiologis pada tubuh maka akan terjadi perubahan seperti ayam betinan yang dapat berganti kelamin menjadi ayam jantan. Hal ini dapat terjadi pada ayam dewasa yang masih memiliki ovotestis yang dorman atau tidak bergerak.");

        //Ular
        namahewan.add("Ular");
        gambar.add("https://asset.kompas.com/crops/ubhvSdGgOTYLzPao7OAec3S8ZWg=/0x40:1000x707/780x390/data/photo/2019/12/09/5dee298189071.jpg");
        klasifikasi.add("Klasifikasi : Reptile");
        makanan.add("Makanan : Daging");
        deskripsi.add("Ular adalah kelompok reptilia tidak berkaki dan bertubuh panjang yang tersebar luas di dunia. Secara ilmiah, semua jenis ular dikelompokkan dalam satu sub-ordo, yaitu Serpentes dan juga merupakan anggota dari ordo Squamata (reptilia bersisik) bersama dengan kadal. Akan tetapi, ular (Serpentes) sendiri diklasifikasikan pada cabang klade (Ophidia), yaitu segolongan reptilia-reptilia dengan atau tanpa kaki, bertubuh panjang, dan memiliki fisiologis yang sangat berbeda dengan kadal.");



        //Singa
        namahewan.add("Singa");
        gambar.add("https://cdn0-production-images-kly.akamaized.net/Ekfdx72s5lcmx3yjF40028QTnso=/640x640/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2396228/original/055603500_1540900672-lion-3040797_1920.jpg");
        klasifikasi.add("Klasifikasi : Mamalia");
        makanan.add("Makanan : Daging");
        deskripsi.add("Singa (bahasa Sanskerta: Siṃha, atau nama ilmiahnya Panthera leo) adalah spesies hewan dari keluarga felidae atau jenis kucing. Singa merupakan hewan yang hidup berkelompok. Biasanya terdiri dari seekor jantan dan banyak betina. Kelompok ini menjaga daerah kekuasaannya. Umur singa antara 10 sampai 15 tahun di alam bebas, tetapi dalam penangkaran memungkinkan lebih dari 20 tahun.\n" +
                "\n" +
                "Singa betina jauh lebih aktif dalam berburu, sedangkan singa jantan lebih santai bersikap menunggu dan meminta jatah dari hasil buruan para betinanya. Singa jantan dipercaya lebih unggul dan perkasa dibandingkan dengan kucing besar lainnya, tetapi kelemahan singa ialah tidak bisa memanjat pohon sebagus kucing-kucing besar lainnya. Singa jantan ditumbuhi bulu tebal di sekitar tengkuknya, hal ini lebih menguntungkan untuk melindungi tengkuknya, terutama dalam perkelahian bebas antara kucing besar yang cenderung menerkam tengkuk untuk melumpuhkan musuhnya.");



        prosesRecyclerViewAdapter();
    }
}