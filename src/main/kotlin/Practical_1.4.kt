fun main() {
    print("Enter Number:")
    val num = readLine()!!.toInt()
    if (num % 2== 0){
        println("$num is Even Number")
    }
    else{
        println("$num is odd Number")
    }
}