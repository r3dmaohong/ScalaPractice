

class hello {
  
}
object hello{
  def variableParameters(s:String*){
    //按照順序個別印出
    s.foreach(x=>println(x))
  }
  def helloDefault(name:String="default value"):String={
    "Hello " + name
  }
  
  def main(args:Array[String]){
    variableParameters("HI","FIGHTING","BOY")
    println(helloDefault())
    
    val max = 0
    val result = if(max>0) 1 else 0
    println("result = " + result)
    
    var (n,r) = (10,0)
    while(n>0){
      r = r + n
      n = n - 1
    }
    println("n = " + n + ",r = " + r)
    
    for(i <- 1 to 10){
      print("to " + i + " ")
    }
    println()
    //to也可以用until
    for(i <- 1 until 10 if i%2==0){
      print("until " + i + " ")
    }
  }
}