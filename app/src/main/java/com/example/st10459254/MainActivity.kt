package com.example.st10459254

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //NOTE all logging will be done in the report under the heading LOGGING as it was too much to write in comments
        //These variables are not necessary as I can just write the number, but its here just for clarity and to understand the code easier.
        var NM = 95 //Nelson Mandela
        var CB = 78 //Christiaan Barnard
        var DT = 90 //Desmond Tutu
        var SB = 30 //Steve Biko
        var SZ = 41 //Shaka Zulu
        var CH = 50 //Chris Hani
        var AL = 69 //Albert Luthuli
        var OT = 75 //Oliver Tambo
        var RS = 53 //Robert Sobukwe
        var ES = 32 //Enoch Sontonga

        val textage=findViewById<EditText>(R.id.editTextText)
        val generateH=findViewById<Button>(R.id.GenHIs)
        val clearT=findViewById<Button>(R.id.Clear)
        val display=findViewById<TextView>(R.id.textView4)

        textage.text.clear()
        textage.hint="Enter age:"//So its easier for the user to just type the age, rather than deleting the text and then writing it
        generateH.setOnClickListener {//for the button to look for history

            val enteredAge=textage.text.toString() //to get the data from textbox as a string
            val ageInt: Int?=enteredAge.toIntOrNull() //to change it from a string to an integer
            //toIntOrNul will bring back the string to an integer to see if its in 20 to 100.
            if (ageInt !=null) { //to check if it is an integer
                if (ageInt in 20..100){ //to check if it is in range
                    if (ageInt==NM){
                        display.text="You are 95 years old! You share the age of Nelson Mandela, the first president of post-Apartheid South Africa!"
                    }else if (ageInt==CB){
                        display.text="You are 78 years old! You share the age of Christiaan Barnard, a famous heart transplant surgeon!"
                    }else if (ageInt==DT){
                        display.text="You are 90 years old! You share the age of Desmond Tutu, a Nobel Peace Prize winner!"
                    }else if (ageInt==SB){
                        display.text="You are 30 years old! You share the age of Steve Biko, a political activist!"
                    }else if (ageInt==SZ){
                        display.text="You are 41 years old! You share the age of Shaka Zulu, the founder of the Zulu nation!"
                    }else if (ageInt==CH){
                        display.text="You are 50 years old! You share the age of Chris Hani, the Secretary General of the SACP!"
                    }else if (ageInt==AL){
                        display.text="You are 69 years old! You share the age of Albert Luthuli, a Nobel Peace Prize winner!"
                    }else if (ageInt==OT){
                        display.text="You are 75 years old! You share the age of Oliver Tambo, a political activist!"
                    }else if (ageInt==RS){
                        display.text="You are 53 years old! You share the age of Robert Sobukwe, the founder of PAC!"
                    }else if (ageInt==ES){
                        display.text="You are 32 years old! You share the age of Enoch Sontonga, a composer who wrote 'Nkosi Sikelel iAfrika'"
                    }else{
                        display.text="You do not share an age with any historical figures on the list!"
                    }

                }else {
                    display.text="Age can only be in range of 20 to 100!" //as told in the assignment specific messages depending on what the user types, this is for out of range
                }
            }else {
                display.text="Wrong format used, only whole numbers can be entered!" //as told in the assignment specific messages depending on what the user types, this is for if its not a number or if its a decimal number
            }
        }

        clearT.setOnClickListener {//clears all data and resets the text hint of the edittext
            textage.text.clear()
            textage.hint="Enter age"
            display.text=""
        }

        }

}