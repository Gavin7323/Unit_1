package Section5

package com.example.counterapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

class MainActivity : AppCompatActivity() {

    private var count = 0
    private lateinit var countText: TextView
    private lateinit var incrementButton: Button
    private lateinit var decrementButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = ConstraintLayout(this)
        layout.layoutParams = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.MATCH_PARENT,
            ConstraintLayout.LayoutParams.MATCH_PARENT
        )

        countText = TextView(this).apply {
            text = "0"
            textSize = 30f
        }

        incrementButton = Button(this).apply {
            text = "Increment"
        }

        decrementButton = Button(this).apply {
            text = "Decrement"
        }

        layout.addView(countText)
        layout.addView(incrementButton)
        layout.addView(decrementButton)


        val set = ConstraintSet()
        set.clone(layout)

        set.connect(countText.id, ConstraintSet.TOP, layout.id, ConstraintSet.TOP, 200)
        set.connect(countText.id, ConstraintSet.START, layout.id, ConstraintSet.START, 100)

        set.connect(incrementButton.id, ConstraintSet.TOP, countText.id, ConstraintSet.BOTTOM, 50)
        set.connect(incrementButton.id, ConstraintSet.START, layout.id, ConstraintSet.START, 100)

        set.connect(decrementButton.id, ConstraintSet.TOP, countText.id, ConstraintSet.BOTTOM, 50)
        set.connect(decrementButton.id, ConstraintSet.END, layout.id, ConstraintSet.END, 100)

        set.applyTo(layout)

        incrementButton.setOnClickListener {
            count++
            countText.text = count.toString()
        }

        decre
