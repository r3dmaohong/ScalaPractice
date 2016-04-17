

class min {

}

object min extends App{
  def min(num1:Int,num2:Int):Int={
  if(num1>num2){
    num2
  }else{
    num1
  }
}
  def min1(num1:Int,num2:Int)=if(num1>num2){println(num2)}else{println(num1)}
  
  def add(x:Int,y:Int):Int=(x+y)
  println(min(1,2))
  min1(3,2)
  //_用法特殊
  var result = add _
  println(result(2,3))
  //匿名函數
  val fun = (x:Int) => x+3
  println(fun(7))
  
  println(scala.collection.mutable.ArrayBuffer(1,2,3,4).map((x:Int)=>x+3))
}