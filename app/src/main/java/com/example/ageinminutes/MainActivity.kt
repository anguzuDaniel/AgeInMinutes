package com.example.ageinminutes

import android.app.DatePickerDialog
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.example.ageinminutes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        this.binding.datePicker?.setOnClickListener{
            Toast.makeText(this, "Button works", Toast.LENGTH_LONG).show();
        }

    }


    fun clickDatePicker() {

//        val myCalender = Calender.getInstance();
//        val year = myCalender.get(Calender.YEAR);
//
//        DatePickerDialog(this, DatePickerDialog.OnDateSetListener(view, year, month, dayOfMonth));
    }
}