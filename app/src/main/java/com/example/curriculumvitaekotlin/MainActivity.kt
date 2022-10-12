package com.example.curriculumvitaekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.newSingleThreadContext
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var editName: EditText
    private lateinit var editEmail: EditText
    private lateinit var btnNext : Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editName = findViewById(R.id.etName)
        editEmail = findViewById(R.id.email)
        btnNext = findViewById(R.id.nextBTN)

        btnNext.setOnClickListener{
            startActivity(Intent(this,ThirdActivity::class.java)
                .putExtra("name",editName.text.toString())
                .putExtra("email",editEmail.text.toString()))
        }


    }
}