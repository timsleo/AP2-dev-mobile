package com.example.ap2_devmobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FragmentVoltar : Fragment() {
    //@SuppressLint("MissingInflatedId")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.botao_fragment, container, false)

        val button: Button = view.findViewById(R.id.botaoFragment)
        button.setOnClickListener {
            activity?.finish()
        }

        return view
    }
}