package MyLoopControl

/**
  * @author Ancrazyking
  * @date 2018/7/9 10:46  
  **/
object MyWhile {
  def gcdLoop(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while (a != 0) {
      val temp = a
      a = b % a
      b = temp
    }
    a
  }
  def main(args:Array[String]):Unit={





  }

}
