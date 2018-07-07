package MyArray

/**
  * @author Ancrazyking
  * @date 2018/7/7 11:07
  *  会调用Array的apply方法
  *
  *
  *
  **/
object Array02 {
  def main(args:Array[String]):Unit={
    //val greetStrings=Array("Hello",",","World!/n")
    val greetStrings=Array.apply("Hello",",","World!/n")
    for(i <- 0 to 2)
      print(greetStrings(i))
  }
}
