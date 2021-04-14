package com.example.aplikasikotlinstefani

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun submit_btn (view :View) {
        val namaEditText = findViewById<EditText>(R.id.nama_edit_text)
        val nama = namaEditText.text.toString()
        val toast = Toast.makeText(applicationContext, nama, toast.lENGTH_SHORT)
        toast.show()
    }
}
}