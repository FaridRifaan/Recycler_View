package com.latihan.recycler_view.rv_berita
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.latihan.recycler_view.R


class BeritaAdapter(var listBerita : ArrayList<ListBerita>) : RecyclerView.Adapter<BeritaAdapter.ViewHolder>(){
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        var beritaNama = view.findViewById<TextView>(R.id.nama_berita)
        var tanglBerita = view.findViewById<TextView>(R.id.txt_tgl)
        var kategBerita = view.findViewById<TextView>(R.id.kategori_text)
        var img  = view.findViewById<ImageView>(R.id.img_berita)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeritaAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_berita, parent, false)
        return BeritaAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: BeritaAdapter.ViewHolder, position: Int) {
        holder.beritaNama.text = listBerita[position].namaBerita
        holder.tanglBerita.text = listBerita[position].tglBerita
        holder.kategBerita.text = listBerita[position].kategoriBerita
        holder.img.setImageResource(listBerita[position].imgBerita)
    }

    override fun getItemCount(): Int {
        return  listBerita.size
    }

}