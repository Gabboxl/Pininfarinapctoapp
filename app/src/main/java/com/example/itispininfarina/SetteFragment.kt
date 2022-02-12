package com.example.itispininfarina

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.*




class SetteFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val layout =  inflater.inflate(R.layout.fragment_sette, container, false)

        var pulsanteFad = layout.findViewById<Button>(R.id.buttonFad)

        pulsanteFad.setOnClickListener{
            var browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://fad.itispininfarina.it/my/"))
            startActivity(browserIntent)

        }


        val pulsanteCvv = layout.findViewById<Button>(R.id.buttonCvv)

      /* pulsanteCvv.setOnClickListener{
            var browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=eu.spaggiari.classevivafamiglia"))
            startActivity(browserIntent)
        }*/

        val pulsanteClassroom = layout.findViewById<Button>(R.id.buttonClassroom)

        pulsanteClassroom.setOnClickListener{
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://classroom.google.com/h"))
            startActivity(browserIntent)
        }

        val pulsanteOrario = layout.findViewById<Button>(R.id.buttonOrario)

        pulsanteOrario.setOnClickListener{
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://orario.itispininfarina.it/"))
            startActivity(browserIntent)
        }


        pulsanteCvv.setOnClickListener{

            val intent = requireActivity().packageManager.getLaunchIntentForPackage("eu.spaggiari.classevivafamiglia")
            val intentstudente = requireActivity().packageManager.getLaunchIntentForPackage("eu.spaggiari.classevivastudente")
            if (intent != null) {
                //inserire qui il codice da eseguire nel caso in qui l'app non è installata sul dispositivo
                startActivity(intent)
            }
            else if(intentstudente != null)
            {
                startActivity(intentstudente)
            } else
            {
                //inserire qui il codice da eseguire nel caso in cui l'app è installata sul dispositivo
                //con questa riga di codice viene aperta l'app
                Toast.makeText(context, "App non installata", LENGTH_SHORT).show()

            }
        }

        return layout
    }



}