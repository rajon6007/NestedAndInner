package Nested

class Outer {
    var name:String="Rajon"
    inner class Inner{

        fun display(){
        println(name)
        }
    }
}

fun main(args: Array<String>) {
    val out= Outer()
    val inner = out.Inner()
    inner.display()
}