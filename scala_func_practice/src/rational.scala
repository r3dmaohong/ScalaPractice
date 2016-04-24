

class rational {
  
}
object rational extends App{
  class Rational(n:Int,d:Int){
    require(d!=0)
    private val g = gcd(n.abs,d.abs)
    val numer = n/g
    val denom=d/g
    override def toString = numer + "/" + denom
    def +(that:Rational)=new Rational()
    
  }
}