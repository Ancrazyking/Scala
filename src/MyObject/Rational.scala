package MyObject

/**
  * @author Ancrazyking
  * @date 2018/7/8 12:38
  *       有理数
  *       保证d分母不为0
  **/
class Rational(n: Int, d: Int) {
  require(d != 0)
  //检查先决条件 如果为真,require将正常返回,否则抛出异常
  /**
    * 添加字段
    */
  val number: Int = n
  val denom: Int = d

  def this(n:Int)=this(n,1)  //辅助构造器  将传入的整数n表示为(n/1)


  override def toString() = n + "/" + d

  def add(that: Rational): Rational = new Rational(number * that.denom + that.number * denom, denom * that.denom)
}

object Rational {
  def main(args: Array[String]): Unit = {
    val r = new Rational(1, 2)
    val r1 = new Rational(1, 5)
    println(r.toString())
    println(r1.toString())
    print(r add r1)
  }
}
