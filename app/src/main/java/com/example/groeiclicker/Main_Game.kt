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
        view.findViewById<ImageButton>(R.id.imageButtonclickhere).setOnClickListener {
            counter = counter + 1
        }

            view.findViewById<TextView>(R.id.textcountermain).text = counter.toString()
            if (counter == 20) {
                view.findViewById<ImageView>(R.id.achtergrond_indicator)
                    .setImageResource(R.drawable.stoep)


            }
            if (counter == 100) {
                view.findViewById<ImageView>(R.id.achtergrond_indicator)
                    .setImageResource(R.drawable.auto_met_verkeers_bord)


            }
            if (counter == 300) {
                view.findViewById<ImageView>(R.id.achtergrond_indicator)
                    .setImageResource(R.drawable.houten_garage)

            }
                view.findViewById<ImageButton>(R.id.button_winkelmandje).setOnClickListener {
                    Navigation.findNavController(view).navigate(R.id.groei_store)

                }
                    view.findViewById<ImageButton>(R.id.SettingsButtonMainGame).setOnClickListener {
                        Navigation.findNavController(view).navigate(R.id.Settings)

                    }
                        view.findViewById<ImageButton>(R.id.HomeButtonMainGame).setOnClickListener {
                            Navigation.findNavController(view).navigate(R.id.Start)
                        }




        return view

            }



    }
