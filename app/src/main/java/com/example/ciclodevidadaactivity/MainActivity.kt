package com.example.ciclodevidadaactivity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v("Ciclo de Vida", "Activity criada onCreate()")
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.v("Ciclo de Vida", "Activity iniciada onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.v("Ciclo de Vida", "Activity visível onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.v("Ciclo de Vida", "Activity invisível onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.v("Ciclo de Vida", "Activity parada onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v("Ciclo de Vida", "Activity reiniciada onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("Ciclo de Vida", "Activity destruída onDestroy()")
    }
}

