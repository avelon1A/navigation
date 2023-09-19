package com.example.newnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class forthFragment : Fragment() {


        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val view = inflater.inflate(R.layout.fragment_forth, container, false)

            val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)

            // Create a list of Person objects
            val personList = listOf(
               "Action Institute group",
               "Cancer care group",
                "Global giving group",
                "Green peace group",
                "Helping hands group",
                "Human society group",
                "Impact hub group",
                "Show of empathy group",
                "Vehement capital partners group"

                // Add more persons as needed
            )

            // Create an instance of your custom RecyclerViewAdapter
            val adapter = PersonAdapter(personList)

            // Set the adapter for the RecyclerView
            recyclerView.adapter = adapter

            // Set the layout manager (e.g., LinearLayoutManager)
            recyclerView.layoutManager = LinearLayoutManager(requireContext())

            return view
        }
    }
