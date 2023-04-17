import kotlin.math.pow

fun main(){
  women()
ladies(7)
    today()
    root(4.0)
}
fun women(){
    var mary="mother"
    var mercy="mother"
    if (mary==mercy){
        println("true")
    }
    else{
        println(false)
    }
}
fun ladies(num:Int){
    if (num==7){
        println("even")
    }
    else{
        println("odd")
    }
}
fun today(){
    val time=22
    if (time>10){
        println("Good morning")
    }
    else if (time<20){
       println("Good day")
    }
    else{
        println("Good evening")
    }
}
fun root(num:Double):Double{
//  return num.toDouble().pow(7.0)
    var a:Double=Math.sqrt(4.0)
    return a
}
