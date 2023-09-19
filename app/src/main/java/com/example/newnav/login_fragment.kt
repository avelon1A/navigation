package com.example.newnav

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout

class login_fragment : Fragment() {
    lateinit var username: TextInputLayout
    lateinit var password: TextInputLayout
    lateinit var login: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login_fragment, container, false)

        // Initialize your views

        password = view.findViewById(R.id.password)
        username = view.findViewById(R.id.username)
        login = view.findViewById(R.id.login_button) // Correct the button ID here

        login.setOnClickListener {
            val enteredUsername = username.toString()
            val enteredPassword = password.toString()
            login(enteredUsername, enteredPassword)
        }

        return view
    }

    private fun login(username: String, password: String) {
        if (username == "username" && password == "12345678") {
            Toast.makeText(requireContext(), "Login Successful", Toast.LENGTH_SHORT).show()
            // Create an instance of the first fragment
            val firstFragment = firstFragment()

            // Get the FragmentManager
            val fragmentManager = requireActivity().supportFragmentManager

            // Start a new fragment transaction
            val transaction = fragmentManager.beginTransaction()

            // Replace the current fragment with the first fragment
            transaction.replace(R.id.fragmentContainerView2, firstFragment)

            // Add the transaction to the back stack
            transaction.addToBackStack(null)

            // Commit the transaction
            transaction.commit()
        }
        else{
            Toast.makeText(requireContext(), "Login fail", Toast.LENGTH_SHORT).show()

        }
    }

}