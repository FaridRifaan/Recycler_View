package com.latihan.recycler_view.rv_berita

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.latihan.recycler_view.R
import com.latihan.recycler_view.databinding.ActivityBeritaBinding

class ActivityBerita : AppCompatActivity() {

    lateinit var binding : ActivityBeritaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityBeritaBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val listBeritaData = arrayListOf(
            ListBerita("indonesia batal jadi tuan rumah piala dunia u-20", "Rabu, 29 Maret 2023", "sports", R.drawable.image_fifa ),
            ListBerita("5 Poin Penting Rilis FIFA usai Batalkan Piala Dunia U-20 di Indonesia", "Kamis, 30 Mar 2023", "Sports",R.drawable.img_fifa2),
            ListBerita( "Bersama Huawei, Telkom-ITDRI Luncurkan Interplay Smart Home+", "Rabu, 29 Mar 2023", "Teknologi",R.drawable.img_huwawei),
            ListBerita("Google Search Beri Fitur Buat Ngecek Validitas Sumber Info", "Rabu, 29 Mar 2023", "Teknologi", R.drawable.img_go ),
            ListBerita( "Piala Dunia U-20 Batal di Indonesia, Bagaimana Nasib Hokky Caraka dkk?", "Rabu, 29 Mar 2023", "Sports", R.drawable.img_is),
            ListBerita( "Pesan Menyentuh Erick Thohir Usai Piala Dunia U-20 Batal di Indonesia", "Rabu, 29 Mar 2023", "Sports", R.drawable.img_erik),
            ListBerita("Exco PSSI Soal Polemik Penolakan Israel: FIFA Susah Mundur", "Rabu, 29 Mar 2023", "Sports", R.drawable.img_pegang),
            ListBerita( "Honda Protes Hukuman untuk Marquez di MotoGP Argentina", "Rabu, 29 Mar 2023", "Sports", R.drawable.motor_gp),
            ListBerita("Rossi Trending Usai Marquez Kecelakaan Hebat di MotoGP Portugal", "Senin, 27 Mar 2023", "Sports", R.drawable.motor_marc),
            ListBerita("Hasil Spain Masters: Gregoria Mulus Lolos ke 16 Besar", "Rabu, 29 Mar 2023 ", "Sports", R.drawable.gregoria),
        )
        val adapterBerita1 = BeritaAdapter(listBeritaData)

        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//        val gl = GridLayoutManager(2)
        binding.rvBerita.layoutManager = lm
        binding.rvBerita.adapter = adapterBerita1

    }
}