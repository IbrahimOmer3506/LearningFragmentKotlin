package com.oztasibrahimomer.fragmentkotlin2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.firebase.database.*
import com.oztasibrahimomer.fragmentkotlin2.databinding.Fragment2Binding

class Fragment2 : Fragment() {

    private lateinit var binding:Fragment2Binding

    private lateinit var database: FirebaseDatabase
    private lateinit var databaseReference: DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding= Fragment2Binding.inflate(inflater,container,false)

        database=FirebaseDatabase.getInstance()
        databaseReference=database.getReference("nahlar")

        val postListener=object:ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {

                val value =snapshot.getValue(String::class.java)

                if(value!=null){

                    if(value=="1"){

                        binding.imageView.setImageResource(R.drawable.nah)

                    }
                    else{
                        binding.imageView.setImageResource(R.drawable.normal)

                    }
                }

            }

            override fun onCancelled(error: DatabaseError) {



            }

        }


        databaseReference.addValueEventListener(postListener)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }

}