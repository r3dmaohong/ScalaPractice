

class curry {
  
}
object curry extends App{
  def mulOneAtATime(x:Int)=(y:Int)=>x*y
  println(mulOneAtATime(6)(7))
  
  def mul(x:Int)(y:Int) = x*y
  println(mul(6)(7))
  
  var a = Array("Hello","World")
  var b = Array("hello","world")
  // _.equalsIgnoreCase(_)  為 (a:String, b:String)=>a.equalsIgnoreCase(b)
  println(a.corresponds(b)(_.equalsIgnoreCase(_)))
  
  a = Array("Hello","World")
  b = Array("Hello","world0")
  println(a.corresponds(b)(_.equalsIgnoreCase(_)))
}