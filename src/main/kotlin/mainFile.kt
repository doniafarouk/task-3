
import java.util.Scanner

fun main(){
    var scanner = Scanner(System.`in`)
    println("enter BMW or tesla")

    var model1 = BMW(scanner.nextLine(),scanner.nextLine(),scanner.nextInt())

    var model2 = Tesla(scanner.nextLine(),scanner.nextLine(),scanner.nextInt())

    println("model 1 ${model1.getFuleType()}")
    println("model 2 ${model2.getFuleType()}")
}

abstract class Car(model: String,color: String,speed: Int ){
    abstract fun getFuleType(): String

}

class BMW(model: String,color: String,speed: Int ) : Car(model,color,speed){
    override fun getFuleType(): String {
        return "gas"

    }
}

class Tesla(model: String,color: String,speed: Int ) : Car(model,color,speed){
    override fun getFuleType(): String{
        return "electric"

    }

}
