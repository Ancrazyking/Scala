package ScalaDataStructure.ScalaCollection

/**
  * @author Ancrazyking
  * @date 2018/7/11 15:22
  *      Map 映射
  *      一系列键值对的容器,键是唯一的,但是值不一定是唯一的
  **/
object MapDemo {
  def main(args:Array[String]): Unit ={
      val stu=Map("name"->"afeng","age"->20,"height"->187,"weight"->75)
      println(stu("name"))
  }
}
