package com.example.curriculumvitaekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.curriculumvitaekotlin.databinding.ActivityThirdBinding
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    lateinit var binding: ActivityThirdBinding
    private lateinit var textName : TextView
    private lateinit var textEmail : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        textName = findViewById(R.id.tv_name)
        textEmail = findViewById(R.id.tv_email)

        val Name = intent.getStringExtra("name")
        val Email = intent.getStringExtra("email")


        textName.text=Name
        textEmail.text=Email

        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnskills.setOnClickListener {
            replaceFragment(Fragskills())
        }
        binding.btnhobbies.setOnClickListener {
            replaceFragment(fraghobbies())
        }
        binding.btnlanguage.setOnClickListener {
            replaceFragment(fraglanguage())
        }

        }

    private fun replaceFragment(fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.framelayout,fragment)
        fragmentTransaction.commit()


    }


    }
