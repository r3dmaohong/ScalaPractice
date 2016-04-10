
class UseTrait {
  
}

///practice 1 
trait Logger{
  def log(msg:String){
    println("log : " + msg)
  }
}
class ConcreteLogger extends Logger{
  def concreteLog{
    log("it's me!")
  }
}
////practice 2 
trait traitLogger{
  def log(msg:String)
}

trait ConsoleLogger extends traitLogger{
  def log(msg:String){
    println(msg)
  }
}

class Test extends ConsoleLogger{
  def test(){
    log("here is Spark!")
  }
}
////practice 3
trait Flogger{
  def log(msg:String){
    println("log content is : " + msg)
  }
}

trait MessageLogger extends Flogger{
  override def log(msg:String){
    println("log message is : " + msg)
  }
}

abstract class Account{
  def save
}

class MyAccount extends Account with Flogger{
  def save{
    log("10000")
  }
}

object UseTrait{
  def main(args:Array[String]){
    //practice 1 
    val logger = new ConcreteLogger
    logger.concreteLog
    //practice 2 
    val logger2 = new Test
    logger2.test
    //practice 3 
    val acc = new MyAccount
    acc.save
    //practice 4
    val acc2 = new MyAccount with MessageLogger
    acc2.save
  }
}