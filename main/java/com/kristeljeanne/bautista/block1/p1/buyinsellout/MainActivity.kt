package com.kristeljeanne.bautista.block1.p1.buyinsellout

import android.app.Activity
import android.graphics.drawable.DrawableContainer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MainActivity : Activity() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this Activity
        var view = inflater.inflate(R.layout.activity_main,container,false)
    }
        return view
}
