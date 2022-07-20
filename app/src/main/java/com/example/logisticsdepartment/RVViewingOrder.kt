package com.example.logisticsdepartment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.logisticsdepartment.databinding.FragmentRVViewingOrderBinding


class RVViewingOrder : Fragment(R.layout.fragment_r_v_viewing_order) {

    private var _binding: FragmentRVViewingOrderBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentRVViewingOrderBinding.bind(view)
        binding.btnSend.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_RVViewingOrder2_to_costumerFragment)
            Toast.makeText(context, "Заказ отправлен", Toast.LENGTH_LONG).show()
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}