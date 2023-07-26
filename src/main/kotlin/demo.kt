class  student(var no:Int){
    var name :String="";
    constructor(n:Int,s:String):this(n){
        println("Second Con")
        name =s
    }
    init {
        println("init called")
    }
}
fun main() {
    var s1 =student(111,"Akshay")
    println(s1.no)
    println(s1.name)
}