package com.unal.inlumicol.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.unal.inlumicol.R
import com.unal.inlumicol.databinding.FragmentRegistroFallasBinding

class RegistroFallasFragment : Fragment(){
    // For binding -----------------------------------------------------------
    private var _binding : FragmentRegistroFallasBinding? = null
    private val binding get() = _binding!!
    //------------------------------------------------------------------------

    // Variables -------------------------------------------------------------
    private val municipiosList = listOf(
        "Municipio",
        "Soacha",
        "Zipaquirá",
        "Fusagasugá",
        "Giradot",
        "Facatativá",
        "Tocaima",
        "La Calera",
        "Mosquera",
        "Guatavita"
    )
    //------------------------------------------------------------------------

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegistroFallasBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Llenar los spinners con datos:
        llenarSpinners()
    }
    private fun llenarSpinners() {
        // Para el spinner municipio
        binding.spMunicipio.adapter = ArrayAdapter(
            requireContext(),
            R.layout.spinner_item_personalised,
            municipiosList
        )
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}