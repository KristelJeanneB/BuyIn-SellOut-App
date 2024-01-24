package com.micaela.delacruz.block1.p1.authentication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View

abstract class RegisterActivity : AppCompatActivity(), View.OnClickListener, View.OnFocusChangeListener, View.OnKeyListener {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        fun onKey(view: View?, keyCode: Int, event: KeyEvent?): Boolean {
            TODO("Not yet implemented")
        }
    }
    class ActivityRegisterBinding {
        companion object {
            fun inflate(from: LayoutInflater?): Any {
                TODO("Not yet implemented")
            }
        }

    }
}
