package com.example.android.sampleintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.android.sampleintent.databinding.ActivityReceiverBinding

class ReceiverActivity : AppCompatActivity() {

    private lateinit var binding: ActivityReceiverBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityReceiverBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val message = intent.getStringExtra("Intent")

        supportActionBar?.title = message
        binding.textView.text = message


//        else{
//            supportActionBar?.title = message
//            binding.textView.text = "Hello Intent"
//        }
    }
}