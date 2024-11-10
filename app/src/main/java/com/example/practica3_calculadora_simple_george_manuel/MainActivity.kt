package com.example.practica3_calculadora_simple_george_manuel

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

//modificar build.gardle:app para que funcione
class MainActivity : AppCompatActivity() {

    var oper: Int = 0
    var numero1: Double = 0.0
    lateinit var tv_num1: TextView
    lateinit var tv_num2: TextView
    //0 nada
    //1 suma
    //2 resta
    //3 multiplica
    //4 divide

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_num1 = findViewById(R.id.tv_num1)
        tv_num2 = findViewById(R.id.tv_num2)
        val borrar: Button = findViewById(R.id.borrar)
        val igual: Button = findViewById(R.id.igual)



        igual.setOnClickListener{
            var numero2: Double = tv_num2.text.toString().toDouble()
            var resultado: Double = 0.0

            when(oper){
                1 -> resultado = numero1 + numero2
                2 -> resultado = numero1 - numero2
                3 -> resultado = numero1 * numero2
                4 -> resultado = numero1 / numero2
            }
            tv_num1.setText(resultado.toString())
            //tv_num2.setText(resultado.toString())
        }



        borrar.setOnClickListener{
            tv_num1.setText("")
            tv_num2.setText("")
            numero1 = 0.0
            oper = 0
        }
    }

    fun presionarNumero(view: View){
        //val tv_num2: TextView = findViewById(R.id.tv_num2)
        var num2 = tv_num2.text.toString()
        //var num2: Double = tv_num2.text.toString().toDouble()

        //esto es para mostrar los numeros escritos, seguramente no haga ni falta pero ahi esta
        when(view.id){
            R.id.boton0 -> tv_num2.setText(num2+"0")
            R.id.boton1 -> tv_num2.setText(num2+"1")
            R.id.boton2 -> tv_num2.setText(num2+"2")
            R.id.boton3 -> tv_num2.setText(num2+"3")
            R.id.boton4 -> tv_num2.setText(num2+"4")
            R.id.boton5 -> tv_num2.setText(num2+"5")
            R.id.boton6 -> tv_num2.setText(num2+"6")
            R.id.boton7 -> tv_num2.setText(num2+"7")
            R.id.boton8 -> tv_num2.setText(num2+"8")
            R.id.boton9 -> tv_num2.setText(num2+"9")
        }
    }

    fun operaciones(view: View){
        var num2 = tv_num2.text.toString()
        numero1 = num2.toString().toDouble()
        tv_num2.setText("")
        when(view.id){
            R.id.suma -> {
                tv_num1.setText(num2+"+")
                oper = 1
            }
            R.id.resta ->{
                tv_num1.setText(num2+"-")
                oper = 2
            }
            R.id.multiplica ->{
                tv_num1.setText(num2+"*")
                oper = 3
            }
            R.id.divide -> {
                tv_num1.setText(num2+"/")
                oper = 4
            }
        }
    }


    /*fun operaciones(view: View){
        numero1 = tv_num2.text.toString().toDouble()
        var num2: String = tv_num2.text.toString()
        tv_num2.setText("")
        when(view.id){
            R.id.suma -> {
                tv_num2.setText(num2 + "+")
                oper = 1
            }
            R.id.resta -> {
                tv_num2.setText(num2 + "-")
                oper = 2
            }
            R.id.multiplica -> {
                tv_num2.setText(num2 + "x")
                oper = 3
            }
            R.id.divide -> {
                tv_num2.setText(num2 + "/")
                oper = 4
            }
        }
    }*/
}
