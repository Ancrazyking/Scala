package ScalaDataStructure

/**
  * @author Ancrazyking
  * @date 2018/7/11 14:09
  *      可以调用Array的ofDim方法来创建多维数组.
  *
  *
  **/
object ArrayDemo {
  def main(args:Array[String]):Unit={
    /**
      * 数组的第一种创建方式
      * val intValueArray=new Array[Int](3)
      * 括号里面表示数组的数量
      * 中括号里面表示泛型
      */
    val  intValueArray=new Array[Int](3)
    intValueArray(0)=12
    intValueArray(1)=45
    intValueArray(2)=33

    /**
      * until 与 to的方法是不一样的
      * until相当于 0  to  intValueArray.length-1
      */
    for(i <-  0 to intValueArray.length-1)
      println(intValueArray(i))


    /**
      * 数组的第二种创建方式
      * 通过调用Array的apply方法
      */

    val intArr=Array(12,45,33)
    val stringArr=Array("hadoop","strom","spark")

    /**
      * 调用数组的update方法
      */
    println(intArr(0))


  }
}
