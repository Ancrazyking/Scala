package MyLoopControl

/**
  * @author Ancrazyking
  * @date 2018/7/11 9:40  
  **/
object IfDemo {
  def main(args: Array[String]): Unit = {
    val x = 6
    if (x > 0) println("This is a positive number")
    else println("This is not a positive number")

    val y = 3
    if (y > 0) {
      println("This is a positive number")
    } else if (y == 0) {
      println("This is a zero")
    } else {
      println("This is a negative number")
    }

    /**
      * 与Java中不同的是,Scala中的if表达式可以赋值给变量
      */
    val a=if(x>0) 1 else -1
    println(a)  //if判断条件是有值的,值为1


  }
}
