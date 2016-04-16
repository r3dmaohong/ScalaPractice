

class closure {
  
  
}

object closure extends App{
  var y = 1
  val sum = (x:Int)=>x+y
  println(sum(5))
  y = 16
  println(sum(5))
}