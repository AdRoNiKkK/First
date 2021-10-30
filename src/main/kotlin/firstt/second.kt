package firstt

fun main(){
    val a = 23
    val b = 24
    val c = 25
    if(a < b && a < c ){
        print (b + c)
    }
    else if(b < c ){
        print (a + c)
    }
    else {
        print(a + b)
    }
}