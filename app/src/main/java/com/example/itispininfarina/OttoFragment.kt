package com.example.itispininfarina

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit


class OttoFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val layout = inflater.inflate(R.layout.fragment_otto, container, false)


        val cal: Calendar = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"))

        val sdf = SimpleDateFormat("dd MM yyyy", Locale.ITALY)

        cal.add(Calendar.DAY_OF_YEAR, -1);

        val today = cal.time

        cal.time = sdf.parse("08 06 2022");// all done


        val finescuola = cal.time

        val differenzagiorni = getDateDiff(today, finescuola, TimeUnit.DAYS);


        val textgiornirim = layout.findViewById<TextView>(R.id.textgiornirim)

        textgiornirim.text = "$differenzagiorni giorni"

        return layout
    }


    fun getDateDiff(date1: Date, date2: Date, timeUnit: TimeUnit): Long {
        val diffInMillies = date2.time - date1.time
        return timeUnit.convert(diffInMillies, TimeUnit.MILLISECONDS)
    }


}