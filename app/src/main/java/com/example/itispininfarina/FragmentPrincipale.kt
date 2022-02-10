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
        var layout =  inflater.inflate(R.layout.fragment_principale, container, false)

        var imageSlider = layout.findViewById<ImageSlider>(R.id.slider)

        var slideModels = ArrayList<SlideModel>();

        slideModels.add(SlideModel(R.drawable.biotecnologie_removebg_preview))
        slideModels.add(SlideModel(R.drawable.elettronica_removebg_preview))

        imageSlider.setImageList(slideModels)

        return layout
    }

}