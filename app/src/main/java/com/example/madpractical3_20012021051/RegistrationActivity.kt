package com.example.madpractical3_20012021051

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

import com.example.madpractical3_20012021051.databinding.ActivityRegistrationBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class RegistrationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val login=findViewById<Button>(R.id.register)
        login.setOnClickListener{
            val intent1=Intent(this,LoginActivity::class.java)
            startActivity(intent1)
        }
        setSupportActionBar(binding.toolbar)
    }
}
/*fun gotologin(){
    Toast.makeText(this,"register button clicked",Toast.LENGTH_LONG).show()
    val intent=Intent(this,LoginActivity::class.java)
        intent.putExtra("loginactivity",username)

}*/