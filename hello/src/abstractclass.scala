

class abstractclass {
  
}

abstract class People{
  def speak
  
  val name:String
  var age:Int
}

class Worker extends People{
  def speak{
    println("Hello, Everyone!")
  }
  
  val name = "Mao"
  var age = 26
}

object abstractclass{
  def main(args:Array[String]){
    val worker = new Worker
    worker.speak
    println(worker.name + " : " + worker.age)
  }

}