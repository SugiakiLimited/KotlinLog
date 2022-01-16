package jp.techacademy.akiko.sugiyama.kotlinlog
import android.util.Log
open class Dog: Animal {
    //引数付きコストラクタ
    constructor(name: String, age: Int): super(name, age){
    }

    //Animalクラスのメソッドをオーバーライド
    override fun say(){
        Log.d("kotlintest",this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }
}