package com.example.android.sampleintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.sampleintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    companion object{
        val TAG = "Intent"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       val stringIntent = binding.editText.text.toString()

        binding.button.setOnClickListener {
            val stringIntent = binding.editText.text.toString()

            val intent = Intent(this, ReceiverActivity::class.java).apply {
                putExtra(TAG, stringIntent)
            }
            startActivity(intent)
        }

    }
}