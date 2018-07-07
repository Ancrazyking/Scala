package MyMap
import scala.collection.mutable.Map
/**
  * @author Ancrazyking
  * @date 2018/7/7 16:35  
  **/
object Map01 {
  def main(args:Array[String]): Unit ={
    val treasureMap=Map[Int,String]()
    treasureMap +=(1->"Go to island")
    treasureMap +=(2->"Find big X on ground.")
    treasureMap +=(3->"Dig.")
    println(treasureMap(2))
  }
}
