package com.example.itispininfarina

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel


class FragmentPrincipale : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val layout =  inflater.inflate(R.layout.fragment_principale, container, false)

        val imageSlider = layout.findViewById<ImageSlider>(R.id.slider)

        val slideModels = ArrayList<SlideModel>();

        slideModels.add(SlideModel(R.drawable.img_2))
        slideModels.add(SlideModel(R.drawable.r))
        slideModels.add(SlideModel(R.drawable._7745248_ydc39p3ovprekkq5re8gdoa_kxu1zrxzkn5udvxf9ce))
        slideModels.add(SlideModel(R.drawable.informatica_removebg_preview))
        slideModels.add(SlideModel(R.drawable.elettronica_removebg_preview))
        slideModels.add(SlideModel(R.drawable.meccanica_removebg_preview))
        slideModels.add(SlideModel(R.drawable.biotecnologie_removebg_preview))

        imageSlider.setImageList(slideModels)

        return layout
    }

}