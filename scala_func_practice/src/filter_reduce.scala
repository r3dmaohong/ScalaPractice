

class filter_reduce {
  
}
object filter_reduce extends App{
  val array = Array(11,22,33,44)
  val array2 = array.filter(_>33)
  println(array2.deep.mkString(","))
  
  val array3 = Array(1,2,3,4)
  println(array3.reduce(_+_))
  println(array3.reduce(_-_))
}