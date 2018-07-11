/**
  * @author Ancrazyking
  * @date 2018/7/11 15:29
  *      Iterator  迭代器
  **/
object IteratorDemo {
  def main(args:Array[String]): Unit ={
      var iter=Iterator("Hadoop","Storm","Spark")
      while(iter.hasNext)
        println(iter.next())
  }
}
