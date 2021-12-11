package com.example.dicodingproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.ArrayList

class AdapterBarang(val listBarang: ArrayList<Barang>,private val klik: klik) : RecyclerView.Adapter<AdapterBarang.BarangViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback
    inner class BarangViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var foto: ImageView = itemView.findViewById(R.id.Img_kecil)
        var harga: TextView = itemView.findViewById(R.id.txtHarga)
        var deskripsi: TextView = itemView.findViewById(R.id.txtDeskripsi)
        var namaBarang: TextView = itemView.findViewById(R.id.txtNamaBarang)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(barang: Barang)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BarangViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.tampilan_awal, parent, false)
        return BarangViewHolder(view)
    }

    override fun onBindViewHolder(holder: BarangViewHolder, position: Int) {
        val barang = listBarang[position]
        Glide.with(holder.itemView.context)
            .load(barang.Foto)
            .apply(RequestOptions().override(55, 55))
            .into(holder.foto)
        holder.namaBarang.text = barang.NamaBarang
        holder.deskripsi.text = barang.Deskripsi
        holder.harga.text = barang.harga.toString()

        holder.itemView.setOnClickListener {
            klik.onBarangClick(position)
        }
    }

    override fun getItemCount(): Int {
       return listBarang.size
    }
}