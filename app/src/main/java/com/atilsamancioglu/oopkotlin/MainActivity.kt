package com.atilsamancioglu.oopkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("-------Sınıflar------")
        var kullanici = Kullanici("Atil Samancioglu",70)
        var kullanici2 = Kullanici("James",50)

        println("-------Encapsulation------")
        var james = Muzisyen("James",50,"Gitar")
        println(james.yas.toString())
        println(james.grupAdiniGoster("Atil"))
        println(james.grupAdiniGoster("Samancioglu"))

        println("-------Inheritance------")
        var lars = OzelMuzisyen("Lars",60,"Bateri")
        lars.sarkiSoyle()

        println("-------Polymorphism------")
        //Statik Polymorphism
        val matematik = Matematik()
        println(matematik.toplama())
        println(matematik.toplama(5,10))
        println(matematik.toplama(5,10,15))

        //Dinamik Polymorphism
        var hayvan = Hayvanlar()
        hayvan.sesCikar()

        var barley = Kopek()
        barley.kopekFonksiyonu()
        barley.sesCikar()

        println("-------Abstraction & Interface------")
        var atil = Kullanici("Atıl",40)
        var bilgi = atil.bilgiFonksiyonu()
        println(bilgi)

        var piyano = Piano()
        piyano.marka = "ABC"
        piyano.dijital = true
        println(piyano.oda)
        piyano.bilgi()

        println("-------Lambda Gösterimi (Expression) ------")

        stringYazdir("Test Stringi")

        val stringYazdirLambda = {verilenString : String -> println(verilenString)}
        stringYazdirLambda("Lambda Test Stringi")

        val carpmaLambda = {a: Int, b:Int -> a * b}
        println(carpmaLambda(5,5))


        val carpmaLambdaVersiyon2 : (Int, Int) -> Int = {a,b -> a*b}
        println(carpmaLambdaVersiyon2(5,6))

        //Async, listener, callback, completion

        downloadMuzisyen("metallica.com",{ muzisyen ->
            println(muzisyen.isim)
        })
    }

    fun stringYazdir(string: String) {
        println(string)
    }

    fun downloadMuzisyen(url: String, completion: (Muzisyen) -> Unit) {
        //Download
        //Veri
        val james = Muzisyen("James",50,"Gitar")
        completion(james)
    }
}