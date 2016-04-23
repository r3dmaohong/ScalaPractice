

class implicit_ {
  
  
}
class A{
  
}
class RichA(a:A){
  def rich{
    println("so rich...")
  }
}
object implitcit_ extends App{
  //用interpreter
  //手動轉換
  val x:Int = "9".toInt
  //自動轉換
  implicit def strToInt(str:String) = str.toInt
  val y:Int = "00"
  //print(y)
  def add(x:Int,y:Int)=x+y
  add("100",200)
  
  //自動轉型
  implicit def a2RichA(a:A) = new RichA(a)
  
  val a = new A
  a.rich//沒有自動轉型就會發現a不是A的member
  def testParam(implicit name:String){
    println(name)
  }
  implicit val name = "Implicited"
  testParam
  testParam("SPARK")
  //這裡有沒imp有差嗎
  implicit class Calculator(x:Int){
    def add(a:Int):Int = a+1
  }
  println(1.add(1))
  
  implicit def intToString(x:Int):x.toString
  
  
  //A-60
  implicit def doubleToInt(x:Double) = x toInt
  val i:Int = 3.5
  val i2:Double = 3
}