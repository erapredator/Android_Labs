package com.example.sis3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.matchtracker.databinding.FragmentMatchDetailsBinding

class MatchDetailsFragment : Fragment() {
    private var _binding: FragmentMatchDetailsBinding? = null
    private val binding get() = _binding!!
    private val args: MatchDetailsFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentMatchDetailsBinding.inflate(inflater, container, false)

        binding.textOpponent.text = "Opponent: ${args.opponent}"
        binding.textDate.text = "Date: ${args.date}"
        binding.textLocation.text = "Location: ${args.location}"

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
