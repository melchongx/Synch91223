package com.example.synch91223

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Synch91423 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_synch91423)

        var lettersToast:String = ""
        var numbersToast:Int = 0

        /**Validations*/
        var opType:String = ""
        var lettersEmpty:Boolean = true
        var numbersEmpty:Boolean = true

        val opPlus = findViewById<Button>(R.id.btnPlus)
        opPlus.setOnClickListener {
            opType = "plus"
        }

        val opMinus = findViewById<Button>(R.id.btnMinus)
        opMinus.setOnClickListener {
            opType = "minus"
        }

        val concatA = findViewById<Button>(R.id.btnA)
        concatA.setOnClickListener {
            if (opType.equals("plus")) {
                lettersToast += "A"
                Toast.makeText(this, lettersToast, Toast.LENGTH_SHORT).show()
            } else  if (opType.equals("minus")){
                var lettersLength = lettersToast.length
                if (lettersLength <= 1) {
                    Toast.makeText(this, "String is empty.", Toast.LENGTH_SHORT).show()
                } else {
                    lettersToast = lettersToast.dropLast(1)
                    Toast.makeText(this, lettersToast, Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "There is no input operation yet", Toast.LENGTH_SHORT).show()
            }
        }

        val concatB = findViewById<Button>(R.id.btnB)
        concatB.setOnClickListener {
            if (opType.equals("plus")) {
                lettersToast += "B"
                Toast.makeText(this, lettersToast, Toast.LENGTH_SHORT).show()
            } else if (opType.equals("minus")) {
                var lettersLength = lettersToast.length
                if (lettersLength <= 1) {
                    Toast.makeText(this, "String is empty.", Toast.LENGTH_SHORT).show()
                } else {
                    lettersToast = lettersToast.dropLast(1)
                    Toast.makeText(this, lettersToast, Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "There is no input operation yet", Toast.LENGTH_SHORT).show()
            }
        }

        val concatC = findViewById<Button>(R.id.btnC)
        concatC.setOnClickListener {
            if (opType.equals("plus")) {
                lettersToast += "C"
                Toast.makeText(this, lettersToast, Toast.LENGTH_SHORT).show()
            } else if (opType.equals("minus")){
                var lettersLength = lettersToast.length
                if (lettersLength <= 1) {
                    Toast.makeText(this, "String is empty.", Toast.LENGTH_SHORT).show()
                } else {
                    lettersToast = lettersToast.dropLast(1)
                    Toast.makeText(this, lettersToast, Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "There is no input operation yet", Toast.LENGTH_SHORT).show()
            }
        }

        val add1 = findViewById<Button>(R.id.btn1)
        add1.setOnClickListener {
            if (opType.equals("plus")) {
                numbersToast += 1
                Toast.makeText(this, numbersToast.toString(), Toast.LENGTH_SHORT).show()
                opType = ""
            } else if (opType.equals("minus")) {
                if (numbersToast < 1) {
                    Toast.makeText(this, "Cannot go below 0", Toast.LENGTH_SHORT).show()
                    numbersToast = 0
                } else {
                    numbersToast -= 1
                    Toast.makeText(this, numbersToast.toString(), Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "There is no input operation yet", Toast.LENGTH_SHORT).show()
            }
        }

        val add2 = findViewById<Button>(R.id.btn2)
        add2.setOnClickListener {
            if (opType.equals("plus")) {
                numbersToast += 2
                Toast.makeText(this, numbersToast.toString(), Toast.LENGTH_SHORT).show()
                opType = ""
            } else if (opType.equals("minus")) {
                if (numbersToast < 2) {
                    Toast.makeText(this, "Cannot go below 0", Toast.LENGTH_SHORT).show()
                    numbersToast = 0
                } else {
                    numbersToast -= 2
                    Toast.makeText(this, numbersToast.toString(), Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "There is no input operation yet", Toast.LENGTH_SHORT).show()
            }
        }

        val add3 = findViewById<Button>(R.id.btn3)
        add3.setOnClickListener {
            if (opType.equals("plus")) {
                numbersToast += 3
                Toast.makeText(this, numbersToast.toString(), Toast.LENGTH_SHORT).show()
                opType = ""
            } else if (opType.equals("minus")){
                if (numbersToast < 3) {
                    Toast.makeText(this, "Cannot go below 0", Toast.LENGTH_SHORT).show()
                    numbersToast = 0
                } else {
                    numbersToast -= 3
                    Toast.makeText(this, numbersToast.toString(), Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "There is no input operation yet", Toast.LENGTH_SHORT).show()
            }
        }
    }
}