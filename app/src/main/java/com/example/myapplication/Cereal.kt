package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.lang.StringBuilder

class Cereal : AppCompatActivity()
{
        var cereals = arrayOf("Lentils","wheat","dal","rice")
        lateinit var lvCereals: ListView
        lateinit var cbLentils: CheckBox
        lateinit var cbWheat : CheckBox
        lateinit var cbDal : CheckBox
        lateinit var cbRice : CheckBox
        lateinit var btnBuy2: Button
        lateinit var btnCart2: Button

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_cereal)

            lvCereals = findViewById(R.id.lvCereals)
            cbLentils = findViewById(R.id.cbLentils)
            cbWheat = findViewById(R.id.cbWheat)
            cbDal = findViewById(R.id.cbDal)
            cbRice = findViewById(R.id.cbRice)
            btnBuy2 = findViewById(R.id.btnBuy2)
            btnCart2 = findViewById(R.id.btnCart2)

            var bool1:Boolean = false
            var bool2:Boolean= false
            var bool3:Boolean = false
            var bool4:Boolean = false
            var bool5:Boolean = false
            var bool6:Boolean= false

            val adapter1 = ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,cereals)
            lvCereals.setAdapter(adapter1)

            lvCereals.onItemClickListener = object : AdapterView.OnItemClickListener
            {
                override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    if(p2==0)
                        cbLentils.isChecked=true
                    if(p2==1)
                        cbWheat.isChecked=true
                    if(p2==2)
                        cbDal.isChecked=true
                    if(p2==3)
                        cbRice.isChecked=true
                }
            }
            btnBuy2.setOnClickListener {
                var TotalAmount1=0
                val result1 = StringBuilder()
                if(cbLentils.isChecked)
                {
                    result1.append("Lentils: 140Rs.")
                    TotalAmount1+=140
                }
                if(cbWheat.isChecked)
                {
                    result1.append("\nWheat: 40Rs.")
                    TotalAmount1+=40
                }
                if(cbDal.isChecked)
                {
                    result1.append("\nDal: 90Rs.")
                    TotalAmount1+=90
                }
                if(cbRice.isChecked)
                {  result1.append("\nRice: 50Rs.")
                    TotalAmount1+=50
                }
                result1.append("\nTotal: ")
                result1.append(TotalAmount1)
                Toast.makeText(this,"Order Confirmed!!",Toast.LENGTH_SHORT).show()
                Toast.makeText(this,result1,Toast.LENGTH_LONG).show()
            }

            btnCart2.setOnClickListener {
                Toast.makeText(this,"Item added Successsfully!!",Toast.LENGTH_LONG).show()

                if(cbLentils.isChecked)
                {
                    bool1 = true
                }
                if(cbWheat.isChecked)
                {
                    bool2 = true
                }
                if(cbDal.isChecked)
                {
                    bool3 = true
                }
                if(cbRice.isChecked)
                {
                    bool4 = true
                }
            }

            if(bool1==true)
                cbLentils.isChecked=true
            if(bool2==true)
                cbWheat.isChecked=true
            if(bool3==true)
                cbDal.isChecked=true
            if(bool4==true)
                cbRice.isChecked=true
        }
}