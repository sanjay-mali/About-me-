package com.example.aboutme

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val github = findViewById<Button>(R.id.github)
        val linkdin = findViewById<Button>(R.id.linkdin)

        github.setOnClickListener {
            gotoUrl("https://github.com/sanjay-mali")
        }
        linkdin.setOnClickListener {
            gotoUrl("https://www.linkedin.com/in/sanjay-mali-63672a21a/")
        }
    }

    fun gotoUrl(s:String){
        val url:Uri = Uri.parse(s)
        intent = Intent(Intent.ACTION_VIEW,url)
        startActivity(intent)
    }

}
