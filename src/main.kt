
fun main(){
    home("table","chair","cup","plate")
    capitals()
    count()
    var y=identification(arrayOf("Umuhoza","Natete","Verite"))
    println(y)
}
fun home(thing1:String,thing2:String,thing3:String,thing4:String){
    var thi = arrayOf(thing1,thing2,thing3,thing4)
    println(thi.contentToString())
}
fun capitals(){
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    //println(cities.contentToString())
    cities.forEach { capitals ->
        println(capitals.capitalize())
    }
}
fun count(){
    var numArray = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var o = numArray.get(1)
    var p = numArray.get(4)
    var sum = o+p
    println(sum)
    println(numArray.indexOf(158))
    println(numArray.sorted())
}
fun identification(such:Array<String>):String{
    var name = such.contentToString()
    return name
}
