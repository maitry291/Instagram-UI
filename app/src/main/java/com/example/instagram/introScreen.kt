package com.example.instagram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Thread.sleep

class introScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_screen)

        supportActionBar?.hide()

        val t= Thread(Runnable {     //syntax is like this do remember
            try {
                sleep(1500)
            }
            catch (e:Exception){
                println(e)
            }
            finally {
                val i= Intent(this@introScreen,MainActivity::class.java)
                startActivity(i)
            }
        })
        t.start()

    }

}