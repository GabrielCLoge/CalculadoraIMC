package com.example.meuprimeiroprojeto

import android.content.ClipData.Item
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val tvResult = findViewById<TextView>(R.id.textview_result)
        val tvclassification = findViewById<TextView>(R.id.tvclassification)

        val result = intent.getFloatExtra("EXTRA_RESULT", 0.1f)

        tvResult.text = result.toString()

        var classification = ": "

        if (result < 18.5f) {
            classification = "ABAIXO DO PESO"

        } else if (result >= 18.5 && result <= 24.9f) {
            classification = "NORMAL"

        } else if (result >= 25f && result <= 29.9f) {
            classification = "SOBREPESO"

        } else if (result >= 30f && result <= 39.9f) {
            classification = "OBSIDADE"

        } else {
            classification = "OBESIDADE GRAVE"


        }

        tvclassification.text = getString(R.string.message_classification, classification)


        }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)

    }

}
