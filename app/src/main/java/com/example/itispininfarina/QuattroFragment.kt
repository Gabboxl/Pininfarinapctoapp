package com.example.itispininfarina

import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class QuattroFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val layout = inflater.inflate(R.layout.fragment_quattro, container, false)

        var linkTextView: TextView;
        linkTextView = layout.findViewById(R.id.linkfragment4);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance())

        return layout
    }


}