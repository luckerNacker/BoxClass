package com.example.box_exeted

open class Box {

    protected  var lenth = 0
    protected  var width = 0
    protected  var height = 0

    constructor(){
        this.lenth = 2
        this.width = 2
        this.height = 2
    }
    constructor(lenth : Int,width : Int,height : Int ){
        this.lenth =  lenth
        this.width =  width
        this.height =  height
    }

    constructor(universalInt: Int){
        this.lenth =  universalInt
        this.width =  universalInt
        this.height =  universalInt
    }

    open fun increase(magnitude : Int){
        lenth *= magnitude
        width *= magnitude
        height *= magnitude
    }

    open fun getInfo() : String{
        return "Длина: $lenth, ширина: $width, высота: $height"
    }

    open fun getAnotherBox(box : Box){
        this.lenth = box.lenth
        this.width = box.width
        this.height = box.height
    }
}