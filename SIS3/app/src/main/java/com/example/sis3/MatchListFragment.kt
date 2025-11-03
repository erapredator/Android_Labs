package com.example.matchtracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.matchtracker.databinding.FragmentMatchListBinding

class MatchListFragment : Fragment() {
    private var _binding: FragmentMatchListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentMatchListBinding.inflate(inflater, container, false)

        binding.buttonMatch1.setOnClickListener {
            val action = MatchListFragmentDirections.actionMatchListFragmentToMatchDetailsFragment(
                opponent = "FC Almaty",
                date = "Oct 20, 2025",
                location = "Almaty Stadium"
            )
            findNavController().navigate(action)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
