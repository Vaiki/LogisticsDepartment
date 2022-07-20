package com.example.logisticsdepartment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Toast
import androidx.navigation.Navigation

import com.example.logisticsdepartment.databinding.FragmentCreateOrderBinding


class CreateOrderFragment : Fragment(R.layout.fragment_create_order) {
    private var _binding: FragmentCreateOrderBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentCreateOrderBinding.bind(view)
        binding.btnViewing.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_createOrderFragment_to_RVViewingOrder2)
        }
        binding.btnAdd.setOnClickListener {
            Toast.makeText(context, "Заявка добавлена в заказ", Toast.LENGTH_LONG).show()
            clearView()
        }
    }

    private fun clearView() {
        with(binding) {
            acEquipment.setText("")
            etDescription.setText("")
            etDate.setText("")
            etQty.setText("")
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}