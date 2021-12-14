package com.unal.inlumicol.fragments

import android.os.Bundle
import android.view.*
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.unal.inlumicol.R
import com.unal.inlumicol.databinding.FragmentRegistroFallasBinding

class RegistroFallasFragment : Fragment(){
    // For binding -----------------------------------------------------------
    private var _binding : FragmentRegistroFallasBinding? = null
    private val binding get() = _binding!!
    //------------------------------------------------------------------------

    // Valores -------------------------------------------------------------
    private val municipiosList = listOf(
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
    private val fallasList = listOf(
        "Luminaria apagada",
        "Luminaria colgante (a punto de caer)",
        "Luminaria encendida de día",
        "Luminaria intermitente",
        "Luminaria robada",
        "Falta tapa caja inspección AP",
        "Luminaria girada",
        "Otro"
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
        binding.btnFoto.setOnClickListener{
            messageUser("Entramos a enviar foto")
            // TODO("código para enviar foto a la DB")
        }
        binding.btnUbicacion.setOnClickListener{
            messageUser("Entramos en buscar la ubicación")
            // TODO("código para enviar foto a la DB")

        }
        // Acción btn positivo {icon check}
        binding.btnRegistroFalla.setOnClickListener{
            // Go to fallas dialog
            findNavController().navigate(R.id.action_registroFallasFragment_to_dialog_fallas)

        }
        // Acciones de los botones del menú inferior
        binding.bottomMenu.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.loginUser -> {
                    messageUser("Entramos a login")
                    // TODO("ir al fragmento para hacer login")
                    true
                }
                R.id.dots -> {
                    messageUser("Entramos a configuración")
                    // TODO("ir a configuraciones")
                    true
                }
                else -> false
            }
        }
    }
    override fun onResume() {
        super.onResume()
        // Llenar los spinners con datos:
        llenarSpinners()
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private fun llenarSpinners() {
        // Para el spinner municipio
        binding.spMunicipio.setAdapter(ArrayAdapter(
            requireContext(),
            R.layout.spinner_item_personalised,
            municipiosList
        ))
        // Para el spinner tipo de fallas
        binding.tipoFalla.setAdapter(ArrayAdapter(
            requireContext(),
            R.layout.spinner_item_personalised,
            fallasList
        ))
    }
    private fun messageUser(msg: String){
        Toast.makeText(requireContext(),msg,Toast.LENGTH_SHORT).show()
    }
}