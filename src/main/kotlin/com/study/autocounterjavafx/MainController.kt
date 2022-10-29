package com.study.autocounterjavafx

import javafx.fxml.FXML
import javafx.scene.control.Label
import java.util.*
import kotlin.collections.ArrayList

class HelloController {
    @FXML
    private lateinit var welcomeText: Label

    @FXML
    private fun onHelloButtonClick() {
        welcomeText.text = "Welcome to JavaFX Application!"
    }

    fun main() {
        val list: ArrayList<String> = ArrayList()
        println("Set start point (Default 0) [Int]")
        val start: Int = readIntOrDefault(0)

        println("Set end point [Int]")
        val end: Int = readInt()

        println("Set string divider (Default none) [Char[]]")
        val divider: String = readOrDefault("")

        println("With line jump? [yes/no]")
        val lineJump: Boolean = readYesNo()

        for(i in start..end){
            list.add(i.toString())
        }

        val output = if(lineJump) list.joinToString(divider+ "\n") else list.joinToString(divider)
        println(output)

    }

    fun readYesNo(default: Boolean = false): Boolean{
        val value: String?
        value = readln().lowercase(Locale.getDefault())
        if(value == "yes" || value == "y"){
            return true
        }
        if(value == "no" || value == "n"){
            return false
        }
        return default
    }

    fun readOrDefault(default: String): String {
        val value: String?
        value = readln()
        if(value.isEmpty()){
            return default
        }
        return value
    }

    fun readInt(): Int{
        var value: Int? = null
        while (value == null) {
            value = readln().toIntOrNull()
            if(value == null){
                println("NaN detected please type again")
            }
        }
        return value
    }

    fun readIntOrDefault(default: Int): Int {
        return readln().toIntOrNull() ?: return default
    }
}