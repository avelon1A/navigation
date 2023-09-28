package com.example.newnav


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.textfield.TextInputEditText


class login_fragment : Fragment() {
    lateinit var username: TextInputEditText
    lateinit var password: TextInputEditText
    lateinit var login: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login_fragment, container, false)

        // Initialize your views

        password = view.findViewById(R.id.password_edit_text)
        username = view.findViewById(R.id.username_edit_text)
        login = view.findViewById(R.id.login_button) // Correct the button ID here

        login.setOnClickListener {
            val enteredUsername = username.text.toString()
            val enteredPassword = password.text.toString()
            login(enteredUsername, enteredPassword)
        }

        return view
    }

    private fun login(username: String, password: String) {
        if (username == "username" && password == "12345678") {
            Toast.makeText(requireContext(), "Login Successful", Toast.LENGTH_SHORT).show()
            // Create an instance of the first fragment
            val navController = findNavController()

            // Navigate to the firstFragment
            navController.navigate(R.id.action_login_fragment_to_firstFragment)
        } else {
            Toast.makeText(requireContext(), "Login fail", Toast.LENGTH_SHORT).show()
        }
    }
}