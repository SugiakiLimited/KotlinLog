package jp.techacademy.akiko.sugiyama.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dog = Dog("ポチ", 3) //名前ポチ、年齢3際でＤｏｇのインスタンスを作る

        dog.say() //ポチが吠えます（ログ出力）
        Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + dog.age + "歳です。")

        val bigdog = BigDog("ヨーゼフ", 15) //名前ヨーゼフ、年齢15際でBigＤｏｇのインスタンスを作る

        bigdog.say() //ハチが吠えます（ログ出力）
        Log.d("kotlintest", "犬の名前は" + bigdog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + bigdog.age + "歳です。")

        val human = Human("波平",54,"盆栽")
        human.say()
        human.think()

        val human2 = Human("サザエ",24,"読書")
        human2.say()
        human2.think()

        }
    }