package com.google.sample.tunnel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.androidgamesdk.GameActivity

class MainActivity : GameActivity() {

    companion object {
        init {
            System.loadLibrary("game")
        }
    }
}