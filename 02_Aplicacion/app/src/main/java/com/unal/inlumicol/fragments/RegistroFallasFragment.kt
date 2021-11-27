package com.unal.inlumicol.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.unal.inlumicol.databinding.FragmentRegistroFallasBinding

class RegistroFallasFragment : Fragment(){

    private var _binding : FragmentRegistroFallasBinding? = null
    private val binding get() = _binding!!

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
        // TODO(Aqui código del registro de la falla)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}