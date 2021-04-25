package com.phb.tokoku.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.phb.tokoku.R
import com.phb.tokoku.adapter.AdapterProduk
import com.phb.tokoku.adapter.AdapterSlider
import com.phb.tokoku.model.Produk


class HomeFragment : Fragment() {

    lateinit var vpSlider: ViewPager
    lateinit var rvProduk: RecyclerView
    lateinit var rvProdukTerlaris: RecyclerView
    lateinit var rvElektronik: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_home,container,false)
        vpSlider = view.findViewById(R.id.vp_slider)
        rvProduk = view.findViewById(R.id.rv_produk)
        rvProdukTerlaris = view.findViewById(R.id.rv_produkTerlaris)
        rvElektronik = view.findViewById(R.id.rv_elektronik)

        val arrSlider = ArrayList<Int>()
        arrSlider.add(R.drawable.slider1)
        arrSlider.add(R.drawable.slider2)
        arrSlider.add(R.drawable.slider3)

        val adapterSlider = AdapterSlider(arrSlider, activity)
        vpSlider.adapter = adapterSlider

        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        val layoutManager2 = LinearLayoutManager(activity)
        layoutManager2.orientation = LinearLayoutManager.HORIZONTAL

        val layoutManager3 = LinearLayoutManager(activity)
        layoutManager3.orientation = LinearLayoutManager.HORIZONTAL

        rvProduk.adapter = AdapterProduk(arrProduk)
        rvProduk.layoutManager = layoutManager

        rvProdukTerlaris.adapter = AdapterProduk(arrProdukTerlaris)
        rvProdukTerlaris.layoutManager = layoutManager2

        rvElektronik.adapter = AdapterProduk(arrElektronik)
        rvElektronik.layoutManager = layoutManager3

        return view
    }

    val arrProduk: ArrayList<Produk>get(){
        val arr = ArrayList<Produk>()
        val p1 = Produk()
        p1.nama = "Hp core i3"
        p1.harga = "RP. 5.000.000"
        p1.gambar = R.drawable.hp_14_bs749tu

        val p2 = Produk()
        p2.nama = "Hp envy i3"
        p2.harga = "RP. 5.500.000"
        p2.gambar = R.drawable.hp_14_bs749tu

        val p3 = Produk()
        p3.nama = "Hp notebook i3"
        p3.harga = "RP. 5.300.000"
        p3.gambar = R.drawable.hp_14_bs749tu

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)

        return arr
    }

    val arrElektronik: ArrayList<Produk>get(){
        val arr = ArrayList<Produk>()
        val p1 = Produk()
        p1.nama = "Hp core i3"
        p1.harga = "RP. 5.000.000"
        p1.gambar = R.drawable.hp_14_bs749tu

        val p2 = Produk()
        p2.nama = "Hp envy i3"
        p2.harga = "RP. 5.500.000"
        p2.gambar = R.drawable.hp_14_bs749tu

        val p3 = Produk()
        p3.nama = "Hp notebook i3"
        p3.harga = "RP. 5.300.000"
        p3.gambar = R.drawable.hp_14_bs749tu

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)

        return arr
    }

    val arrProdukTerlaris: ArrayList<Produk>get(){
        val arr = ArrayList<Produk>()
        val p1 = Produk()
        p1.nama = "Hp core i3"
        p1.harga = "RP. 5.000.000"
        p1.gambar = R.drawable.hp_14_bs749tu

        val p2 = Produk()
        p2.nama = "Hp envy i3"
        p2.harga = "RP. 5.500.000"
        p2.gambar = R.drawable.hp_14_bs749tu

        val p3 = Produk()
        p3.nama = "Hp notebook i3"
        p3.harga = "RP. 5.300.000"
        p3.gambar = R.drawable.hp_14_bs749tu

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)

        return arr
    }
}