package com.example.hiltpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

// make an entry point
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    // files injection
    @Inject
    @Named("String1")
    lateinit var someClass: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Look ${someClass}")
    }
}

