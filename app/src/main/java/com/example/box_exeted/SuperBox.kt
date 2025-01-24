package com.example.box_exeted

class SuperBox(private var ves: Int) : Box() {

    override fun increase(magnitude : Int){
        lenth *= magnitude
        width *= magnitude
        height *= magnitude
        ves *= magnitude

    }

    override fun getInfo() : String{
         val maneString = super.getInfo()
         return "$maneString, вес: $ves"
    }

    fun getAnotherBox(box: Box, ves: Int) {
        super.getAnotherBox(box)
        this.ves = ves
    }

}