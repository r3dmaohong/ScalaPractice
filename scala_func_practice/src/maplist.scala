

class maplist {
  
}
object maplist extends App{
  val l = List(1,2,3,4,5,6,7,8,9)
  val newlist = l.map((x:Int)=>2*x)
  print(newlist)
  println(l.map(x=>2*x))
  println(l.map(_*2))
  
  val array = Array(1,2,3,4)
  println(array)
  val newarray = array.map(1 + _)
  println(newarray)
  println(newarray.deep.mkString(","))

}