package com.oztasibrahimomer.fragmentkotlin2

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import com.google.firebase.FirebaseApp
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.oztasibrahimomer.fragmentkotlin2.databinding.Fragment1Binding


class Fragment1 : Fragment() {

    private lateinit var binding:Fragment1Binding
    private lateinit var firebaseDatabase: FirebaseDatabase
    private lateinit var databaseRef: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding= Fragment1Binding.inflate(inflater,container,false)

        firebaseDatabase=FirebaseDatabase.getInstance()

        databaseRef=firebaseDatabase.getReference("nahlar")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.nahButton.setOnClickListener {

            databaseRef.setValue("1")
        }


        binding.normalButton.setOnClickListener {
            databaseRef.setValue("0")
        }


    }







}