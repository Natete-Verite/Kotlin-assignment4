
fun main(){
    home("table","chair","cup","plate")
    capitals()
    count()
    var y=identification(arrayOf("Umuhoza","Natete","Verite"))
    println(y)
    num(arrayOf(1,2,3,4,5))
    var s = sumIntegers(arrayOf("Kenya",5,3.2,false,7,1.2))
    println(s)
    var d = identification("judy","wanjiru","wainaina")
    println(d.contentToString())
}
fun home(thing1:String,thing2:String,thing3:String,thing4:String){
    var thi = arrayOf(thing1,thing2,thing3,thing4)
    println(thi.contentToString())
    var y = num(arrayOf(1,2,3,4,5))
    println(y)

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
fun num(numbers:Array<Int>):Int{
    var numb =0
    numbers.forEach { num->
        numb += num
    }
        println(numb)
    return numb

}
//create a function that takes in an array of mixed types and sums up integers only

fun sumIntegers(medly: Array<Any>):Int{
    var sum = 0
    medly.forEach { el ->
        if (el is Int){
            sum+= el
        }
    }
    return sum
}
fun identification(a:String,b:String,c:String):Array<String> {
    var name = arrayOf(a, b, c)
    return name
}