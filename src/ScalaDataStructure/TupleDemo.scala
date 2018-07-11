package ScalaDataStructure

/**
  * @author Ancrazyking
  * @date 2018/7/11 14:21
  *      元组可以容纳不同类型的对象
  *      通过"_下标"来访问,默认从1开始
  **/
object TupleDemo {
  def main(args:Array[String]): Unit ={
    val tuple=("Hadoop",28,37.2,"Strom","Spark")
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)
    println(tuple._4)
    println(tuple._5)
    println("======================")
    println(tuple)

  }
}
