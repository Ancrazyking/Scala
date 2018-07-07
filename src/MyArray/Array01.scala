package MyArray

/**
  * @author Ancrazyking
  * @date 2018/7/7 11:02
  * scala中访问数组用的是()而不是[]    注意
  *
  **/
object Array01 {
  def main(args:Array[String]): Unit ={
    val greetStrings=new Array[String](3)
    greetStrings(0)="Hello"
    greetStrings(1)=","
    greetStrings(2)="World!\n"

    for(i <- 0 to 2)
      print(greetStrings(i))
  }
}
