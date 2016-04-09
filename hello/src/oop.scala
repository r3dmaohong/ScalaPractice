

class oop {
  
}

/*class Person{
  //_為placeholder
  var name:String = _
  val age = 27
  //無法外部使用
  private[this] val gender = "male"
}*/

//沒有使用val var就等於宣告成private?
class Person(val name:String, val age:Int){
  println("this is primary constructor")
  var gender:String = _
  
  def this(name:String,age:Int,gender:String){
    this(name,age)
    this.gender = gender
  }
  
  val University = "NTU"
}
class Student(name:String,age:Int,val major:String) extends Person(name,age){
  println("this is the subclass of Person, major is : "+major)
  
  override def toString = "Overreded toString method ......"
  //取代
  override val University = "NCCU"
}

object oop{
  def main(args:Array[String]){
    /*val p = new Person
    p.name = "good boy"
    print(p.name + " : " + p.age)*/
    val p = new Person("GOOD BOY", 26,"male")
    println(p.name + " : " + p.age + " " + p.gender)
    
    val s = new Student("BOYY",26,"Big Data")
    println(s.toString)
    println(s.University)
    
  }
}