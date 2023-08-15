package com.example.lat3_if9_10120761_muhamadrizankarindra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.EditText

class BiodataActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            sendMessage()
        }

    }

    private fun sendMessage () {
        val textView = findViewById<EditText>(R.id.editTextTextPersonName)
        val message = textView.text.toString()
        val intent = Intent(this,HailActivity::class.java)
        intent.apply {
            putExtra("theMessage",message)
        }
        startActivity(intent)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<BiodataActivity> {
        override fun createFromParcel(parcel: Parcel): BiodataActivity {
            return BiodataActivity(parcel)
        }

        override fun newArray(size: Int): Array<BiodataActivity?> {
            return arrayOfNulls(size)
        }
    }

}