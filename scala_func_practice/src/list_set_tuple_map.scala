

class list_set_tuple_map {
  
}
object list_set_tuple_map extends App{
  val l = List(1,2,3,4,5)
  val s = Set(1,2,3,4,5,4,3,2,1)
  println(l)
  println(s)
  
  //tuple
  val t = ("first","second")
  println(t)
  println(t._1)
  println("A"->"B")
  //map??
  //option
  val m = Map("A"->"B")
  println(m.get("A"))
  println(m.get("A").get)
  println(m.get("A").getOrElse("None"))
  println(m.get("A").getOrElse(0))
  
  println(l.filter { x => x%2==0 })
  println(l.filter( _%2==0 ))
  
  val l2 = List(6,7,8,9,10)
  println(l zip l2)
  println(l.zip(l2))
  val l3 = List(1,2,3)
  println(l zip l3)
  
  println(l.partition(_%2==0))
  
  val ll = List(List("A","B"),List("C","D"))
  println(ll)
  println(ll.flatten)
  println(ll.flatMap { x => x.map(_*2) })  
}