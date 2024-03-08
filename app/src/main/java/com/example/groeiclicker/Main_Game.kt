package com.example.groeiclicker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Main_Game.newInstance] factory method to
 * create an instance of this fragment.
 */
class Main_Game : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main__game, container, false)
        view.findViewById<TextView>(R.id.textcountermain).text = counter.toString()


        if (counter > 19) {
            view.findViewById<ImageView>(R.id.achtergrond_indicator)
                .setImageResource(R.drawable.stoep)


        }
        if (counter > 99) {
            view.findViewById<ImageView>(R.id.achtergrond_indicator)
                .setImageResource(R.drawable.auto_met_verkeers_bord)


        }
        if (counter > 299) {
            view.findViewById<ImageView>(R.id.achtergrond_indicator)
                .setImageResource(R.drawable.houten_garage)

        }

        if (counter > 499) {
            view.findViewById<ImageView>(R.id.achtergrond_indicator)
                .setImageResource(R.drawable.huis)

        }


        if (counter > 999) {
            view.findViewById<ImageView>(R.id.achtergrond_indicator)
                .setImageResource(R.drawable.vlugzeug)
        }

        if (counter > 2999) {
            view.findViewById<ImageView>(R.id.achtergrond_indicator)
                .setImageResource(R.drawable.gebauw)
        }

        if (counter > 9999) {
            view.findViewById<ImageView>(R.id.achtergrond_indicator)
                .setImageResource(R.drawable.rock)
        }


        view.findViewById<ImageButton>(R.id.button_winkelmandje).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.groei_store)

        }
        view.findViewById<ImageButton>(R.id.SettingsButtonMainGame).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.Settings)



        }


        view.findViewById<ImageButton>(R.id.imageButtonclickhere).setOnClickListener {
            counter = counter + 1
            view.findViewById<TextView>(R.id.textcountermain).text = counter.toString()







            if (counter > 19) {
                view.findViewById<ImageView>(R.id.achtergrond_indicator)
                    .setImageResource(R.drawable.stoep)


            }
            if (counter > 99) {
                view.findViewById<ImageView>(R.id.achtergrond_indicator)
                    .setImageResource(R.drawable.auto_met_verkeers_bord)


            }
            if (counter > 299) {
                view.findViewById<ImageView>(R.id.achtergrond_indicator)
                    .setImageResource(R.drawable.houten_garage)

            }


            if (counter > 499) {
                view.findViewById<ImageView>(R.id.achtergrond_indicator)
                    .setImageResource(R.drawable.huis)

            }

            if (counter > 999) {
                view.findViewById<ImageView>(R.id.achtergrond_indicator)
                    .setImageResource(R.drawable.vlugzeug)

            }

            if (counter > 2999) {
                view.findViewById<ImageView>(R.id.achtergrond_indicator)
                    .setImageResource(R.drawable.gebauw)
            }

            if (counter > 9999) {
                view.findViewById<ImageView>(R.id.achtergrond_indicator)
                    .setImageResource(R.drawable.rock)
            }


            view.findViewById<ImageButton>(R.id.button_winkelmandje).setOnClickListener {
                Navigation.findNavController(view).navigate(R.id.groei_store)

            }
            view.findViewById<ImageButton>(R.id.SettingsButtonMainGame).setOnClickListener {
                Navigation.findNavController(view).navigate(R.id.Settings)



            }


        }
        return view


    }

    }































