package com.atilsamancioglu.oopkotlin

open class Muzisyen (isim: String, yas: Int, enstruman: String) {

    //Encapsulation
    private var grupAdi = "Metallica"
    var isim : String? = isim
        private set
        get


    var yas : Int? = yas
        private set
        get

    private var enstruman: String? = enstruman

    fun grupAdiniGoster(sifre: String) : String {
        if (sifre == "Atil") {
            return grupAdi
        } else {
            return "Yanlış Şifre Verdiniz"
        }
    }

}