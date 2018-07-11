package MyLoopControl

import util.control.Breaks._

/**
  * @author Ancrazyking
  * @date 2018/7/11 10:26
  *       为了提取终止整个循环或者跳到下一个循环,Scala没有提供break和continu关键字.Scala总提供了一个Breaks类.
  *       Breaks类中有两个方法用于对循环结构控制,即breakable  和 break;
  **/
object BreaksDemo {
  def main(args: Array[String]): Unit = {

    printf("%s", "Hello,World!\n")
    val array = Array(1, 3, 10, 5, 4)

    /**
      * 终止本次循环
      */
    breakable {
      for (i <- array) {
        if (i > 5) break
        println(i)
      }
    }

    println("=====================")

    /**
      * 终止当次循环
      */
    for(i <- array){
      breakable{
          if(i>5) break()
        println(i)
      }
    }
  }
}
