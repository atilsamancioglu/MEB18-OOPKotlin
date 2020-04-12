package com.atilsamancioglu.oopkotlin

class Piano : EvDekorasyonu, Enstruman {

    var marka : String? = null
    var dijital : Boolean? = null
    override var oda: String
        get() = "Salon"
        set(value) {}


}