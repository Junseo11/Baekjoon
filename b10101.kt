package baek.BaekjoonKotlin

import java.util.Scanner
import java.util.ServiceConfigurationError

fun main() = with(Scanner(System.`in`)){
    var a = nextInt()
    var b = nextInt()
    var c = nextInt()

    if(a == 60 && a==b && b==c){
        println("Equilateral")
    }
    else if(a+b+c == 180 && (a==b || b==c || c==a)){
        println("Isosceles")
    }
    else if( a+b+c == 180 && a!=b && b!=c && c!=a){
        println("Scalene")
    }
    else{
        println("Error")
    }
}