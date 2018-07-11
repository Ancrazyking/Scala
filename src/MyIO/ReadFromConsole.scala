package MyIO
import io.StdIn._
/**
  * @author Ancrazyking
  * @date 2018/7/11 9:15  
  **/
object ReadFromConsole {
  def main(args:Array[String]): Unit ={
    println("请输入您的学号:")
    var i= readInt()
    println("您的学号是"+i)
    val myName="afeng"
    val myAge=20
    val myWeight=75.5
    /**
      * c语言风格的格式化字符串
      */
    printf("My  name is %s. I am  %d years old and %.1f kg. \n",myName,myAge,myWeight)


    val  m=10
    val  f=3.5452
    val  s="hello"

    /**
      * s插值字符串,通过$访问变量的值
      */
    println(s"$s:m=$m,f=$f")

    /**
      * f插值字符串
      */
    println(f"$s:m=$m%-4d,f=$f%.1f")


  }

}
