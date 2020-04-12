package com.atilsamancioglu.oopkotlin

class Kopek : Hayvanlar() {

    fun kopekFonksiyonu() {
        super.sesCikar()
    }

    override fun sesCikar() {
        println("köpek sınıfı")
    }

}