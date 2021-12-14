package com.unal.inlumicol.dialogs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.unal.inlumicol.databinding.FallasDialogBinding

class Dialog_fallas : DialogFragment() {

    private var _binding: FallasDialogBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FallasDialogBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnCancelar.setOnClickListener{
            this.dismiss()
        }
        binding.btnConfirmar.setOnClickListener{
            Toast.makeText(requireContext(),"Enviando a la DB",Toast.LENGTH_SHORT).show()
            // TODO("código para enviar reporte de falla")
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}