package com.oztasibrahimomer.fragmentkotlin2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.oztasibrahimomer.fragmentkotlin2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        forFragment1()
        forFragment2()




    }

    private fun forFragment1(){

        val fragment1=Fragment1()

        val fragmentManager=supportFragmentManager

        val fragmentTransaction=fragmentManager.beginTransaction()

        fragmentTransaction.add(binding.frameLayoutMain.id,fragment1).commit()


    }
    private fun forFragment2(){
        val fragment2=Fragment2()

        val fragmentManager=supportFragmentManager

        val fragmentTransaction=fragmentManager.beginTransaction()

        fragmentTransaction.add(binding.frameLayoutMain2.id,fragment2).commit()


    }


}