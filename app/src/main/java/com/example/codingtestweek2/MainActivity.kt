package com.example.codingtestweek2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
    }


    fun sortArray(unsortedArray : IntArray) : IntArray
    {
        unsortedArray.sort()
        return unsortedArray
    }

    //I am trying to take each letter in the word and attach it to the next letter to get all the different
    //permutations of the two letter options. This idea wont work for more than a two letter word unfortunately.
    //I was not able to get the function to work so it is not called.
    fun stringOrder(passedWord : String): List<String>
    {
        var word = passedWord.toCharArray()
        val wordLength = word.count()
        var list = mutableListOf(String())
        for(i in 0..wordLength)
        {
            var newArray : CharArray
            var letter = word[i]
        }
        for(i in word.indices)
        {
            for(j in word.indices)
            {
                if(j != word.count())
                {
                    Log.d("TAG", "j is: " + j.toString())
                    list.add((word[i].toString() + word[i + j].toString()))
                    Log.d("TAG", list.toString())
                }
            }
        }
        return list
    }

    //I am trying to flatten the 2d area and then search through it and compare each value to each other
    //If they are the the same then I put it into a new list which I am trying to use to then look through
    //the original 2d array to find the coordinates and add them to the returned list

    fun findDupInArray(array : Array<Array<String>>) : List<String>
    {
        var listOfDup = mutableListOf<String>()
        var listOfLocations = mutableListOf<String>()
        var newArray = array.flatten()

        for(i in newArray.indices)
        {
            for(j in newArray.indices)
            {
                if(newArray[i] == newArray[j])
                {
                    listOfDup.add(newArray[i].toString())
                }
            }
        }
        for (h in newArray.indices)
        {
            for (k in newArray.indices)
            {
                if (listOfDup[h] == array[h][k])
                {
                    var coridnates: String = h.toString() + "," + k.toString()
                    listOfLocations.add(coridnates)
                }
            }
        }
        return listOfLocations
    }


}
