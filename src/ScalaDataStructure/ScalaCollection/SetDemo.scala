package ScalaDataStructure.ScalaCollection

/**
  * @author Ancrazyking
  * @date 2018/7/11 15:17
  *      Set集合:不重复元素的容器
  *
  *
  *
  **/
object SetDemo {
  def main(args:Array[String]): Unit ={
      var mySet=Set("Hadoop","Storm","Spark")
      mySet+="Spark"
      println(mySet)

  }
}
