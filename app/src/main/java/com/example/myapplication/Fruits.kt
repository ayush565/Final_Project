package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.lang.StringBuilder

class Fruits : AppCompatActivity() {
    var fruits = arrayOf("guava","apple","mango","cherry","orange","litchi")
    var pos = ArrayList<String>()
    lateinit var lvFruits:ListView
    lateinit var cbGuava : CheckBox
    lateinit var cbApple : CheckBox
    lateinit var cbMango : CheckBox
    lateinit var cbCherry : CheckBox
    lateinit var cbLitchi : CheckBox
    lateinit var cbOrange : CheckBox
    lateinit var btnBuy : Button
    lateinit var btnCart : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruits)

        lvFruits = findViewById(R.id.lvFruits)
        cbApple = findViewById(R.id.cbApple)
        cbGuava = findViewById(R.id.cbGuava)
        cbCherry = findViewById(R.id.cbCherry)
        cbOrange = findViewById(R.id.cbOrange)
        cbMango = findViewById(R.id.cbMango)
        cbLitchi = findViewById(R.id.cbLitchi)
        btnBuy = findViewById(R.id.btnBuy)
        btnCart = findViewById(R.id.btnCart)

        var bool1:Boolean = false
        var bool2:Boolean= false
        var bool3:Boolean = false
        var bool4:Boolean = false
        var bool5:Boolean = false
        var bool6:Boolean= false

        val adapter = ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,fruits)
        lvFruits.setAdapter(adapter)

        lvFruits.onItemClickListener = object : AdapterView.OnItemClickListener
        {
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if(p2==0)
                    cbGuava.isChecked=true
                if(p2==1)
                    cbApple.isChecked=true
                if(p2==2)
                    cbMango.isChecked=true
                if(p2==3)
                    cbCherry.isChecked=true
                if(p2==4)
                    cbOrange.isChecked=true
                if(p2==5)
                    cbLitchi.isChecked=true
            }
        }
        btnBuy.setOnClickListener {
            var TotalAmount=0
            val result = StringBuilder()

            if(cbGuava.isChecked)
            {
                result.append("Guava: 50Rs.")
                TotalAmount+=50
            }
            if(cbApple.isChecked)
            {
                result.append("\nApple: 100Rs.")
                TotalAmount+=100

            }
            if(cbMango.isChecked)
            {
                result.append("\nMango: 80Rs.")
                TotalAmount+=80
            }
            if(cbCherry.isChecked)
            {
                result.append("\nCherry: 100Rs.")
                TotalAmount+=100
            }
            if(cbOrange.isChecked)
            {
                result.append("\nOrange: 40Rs.")
                TotalAmount+=40
            }
            if(cbLitchi.isChecked)
            {
                result.append("\nLitchi: 90Rs.")
                TotalAmount+=90
            }
            result.append("\nTotal: ")
            result.append(TotalAmount)
            Toast.makeText(this,"Order Confirmed!!",Toast.LENGTH_SHORT).show()
            Toast.makeText(this,result,Toast.LENGTH_LONG).show()
        }
        btnCart.setOnClickListener {
            Toast.makeText(this,"Item added Successsfully!!",Toast.LENGTH_LONG).show()

            if(cbGuava.isChecked)
            {
                bool1 = true
            }
            if(cbApple.isChecked)
            {
                bool2 = true
            }
            if(cbMango.isChecked)
            {
                bool3 = true
            }
            if(cbCherry.isChecked)
            {
                bool4 = true
            }
            if(cbOrange.isChecked)
            {
                bool5 = true
            }
            if(cbLitchi.isChecked)
            {
                bool6 = true
            }
        }
        if(bool1==true)
            cbGuava.isChecked=true
        if(bool2==true)
            cbApple.isChecked=true
        if(bool3==true)
            cbMango.isChecked=true
        if(bool4==true)
            cbCherry.isChecked=true
        if(bool5==true)
            cbOrange.isChecked=true
        if(bool6==true)
            cbLitchi.isChecked=true
    }
}