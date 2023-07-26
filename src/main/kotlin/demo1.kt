fun main() {
    var s1 = Student(78,"Akshay","Panchal");

}

open class Person(var firstname:String,var lastanme:String){


}
class Student(var no:Int,f:String,l:String):Person(f,l){
    var name:String= f + "" +l;

}