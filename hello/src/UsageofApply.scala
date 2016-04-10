

class UsageofApply {
  
}

class ApplyTest{
  def apply() = "this apply is in class"
  def test{
    println("test")
  }

}

object ApplyTest{
    var count = 0
  def apply() = new ApplyTest
  def static{
    println("I am static method")
  }
    def incr = {
    count = count + 1
  }
}

object UseageofApply extends App{
  //1
  ApplyTest.static
  //2
  val a = ApplyTest()
  a.test
  //3
  val b = new ApplyTest
  println(b())
  //4
  for(i <- 1 to 10){
    ApplyTest.incr
  }
  println(ApplyTest.count)
}