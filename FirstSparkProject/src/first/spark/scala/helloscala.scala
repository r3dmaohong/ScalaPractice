package first.spark.scala

class helloscala {
  
}

//建議main於object中
object helloscala{
  def hello(name:String):String={
    "Hello" + name
  }
  def helloscala(){
    println("Hello Scala, this is rocky")
  }
  def add = (x:Int,y:Int)=>x+y
  
  //函數指定給常數
  val sum = (x:Int,y:Int)=>x+y
  
  def sum2(x:Int)(y:Int):Int={
    x + y
  }
  def main(args:Array[String]){
    println("Hello Scala!!")
    println(hello("Scala"))
    helloscala()
    //沒參數時可以不用括號
    helloscala
    
    println(add(1,2))
    println(sum(1,2))
    println(sum2(2)(3))
    
    
  }
}