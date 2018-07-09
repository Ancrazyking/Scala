package MyObject

/**
  * @author Ancrazyking
  * @date 2018/7/9 8:18  
  **/
class Rational02(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)

  val numer = n / g
  val denom = d / g

  def this(n:Int)=this(n,1)


  def add(that:Rational02):Rational02=new Rational02(numer*that.denom+that.numer*denom,denom*that.denom)

  override def toString=numer+"/"+denom

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)



}


object Ratoional02 {




}