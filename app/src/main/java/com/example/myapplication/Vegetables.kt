package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.lang.StringBuilder

class Vegetables : AppCompatActivity() {
    var vegetables = arrayOf("Coriander","Onion","Tomato","Capsicum","Carrot","Beans")
    lateinit var cbCoriander:CheckBox
    lateinit var cbOnion:CheckBox
    lateinit var cbTomato:CheckBox
    lateinit var cbCapsicum:CheckBox
    lateinit var cbCarrot:CheckBox
    lateinit var cbBeans:CheckBox
    lateinit var lvVeg:ListView
    lateinit var btnBuy3:Button
    lateinit var btnCart3:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vegetables)

        lvVeg=findViewById(R.id.lvVeg)
        cbCoriander = findViewById(R.id.cbCoriander)
        cbOnion = findViewById(R.id.cbOnion)
        cbTomato = findViewById(R.id.cbTomato)
        cbCapsicum = findViewById(R.id.cbCapsicum)
        cbCarrot = findViewById(R.id.cbCarrot)
        cbBeans = findViewById(R.id.cbBeans)
        btnBuy3 = findViewById(R.id.btnBuy3)
        btnCart3 = findViewById(R.id.btnCart3)

        var bool1:Boolean = false
        var bool2:Boolean= false
        var bool3:Boolean = false
        var bool4:Boolean = false
        var bool5:Boolean = false
        var bool6:Boolean= false

        val adapter2 = ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,vegetables)
        lvVeg.setAdapter(adapter2)

        lvVeg.onItemClickListener = object : AdapterView.OnItemClickListener
        {
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if(p2==0)
                    cbCoriander.isChecked=true
                if(p2==1)
                    cbOnion.isChecked=true
                if(p2==2)
                    cbTomato.isChecked=true
                if(p2==3)
                    cbCapsicum.isChecked=true
                if(p2==4)
                    cbCarrot.isChecked=true
                if(p2==5)
                    cbBeans.isChecked=true
            }
        }

        btnBuy3.setOnClickListener {
            var TotalAmount=0
            val result = StringBuilder()

            if(cbCoriander.isChecked)
            {
                result.append("Coriander: 50Rs.")
                TotalAmount+=50
            }
            if(cbOnion.isChecked)
            {
                result.append("\nCarrot: 45Rs.")
                TotalAmount+=45
            }
            if(cbTomato.isChecked)
            {
                result.append("\nTomato: 350Rs.")
                TotalAmount+=50
            }
            if(cbCapsicum.isChecked)
            {
                result.append("\nCapsicum: 60Rs.")
                TotalAmount+=60
            }
            if(cbCarrot.isChecked)
            {
                result.append("\nCarrot: 20Rs.")
                TotalAmount+=20
            }
            if(cbBeans.isChecked)
            {
                result.append("\nBeans: 40Rs.")
                TotalAmount+=40
            }
            result.append("\nTotal: ")
            result.append(TotalAmount)
            Toast.makeText(this,"Order Confirmed!!",Toast.LENGTH_SHORT).show()
            Toast.makeText(this,result,Toast.LENGTH_LONG).show()
        }

        btnCart3.setOnClickListener {
            Toast.makeText(this,"Item added Successsfully!!",Toast.LENGTH_LONG).show()

            if(cbCarrot.isChecked)
            {
                bool1 = true
            }
            if(cbCoriander.isChecked)
            {
                bool2 = true
            }
            if(cbOnion.isChecked)
            {
                bool3 = true
            }
            if(cbTomato.isChecked)
            {
                bool4 = true
            }
            if(cbCapsicum.isChecked)
            {
                bool5 = true
            }
            if(cbBeans.isChecked)
            {
                bool6 = true
            }
        }
        if(bool1==true)
            cbCarrot.isChecked=true
        if(bool2==true)
            cbCoriander.isChecked=true
        if(bool3==true)
            cbOnion.isChecked=true
        if(bool4==true)
            cbTomato.isChecked=true
        if(bool5==true)
            cbCapsicum.isChecked=true
        if(bool6==true)
            cbBeans.isChecked=true
    }
}