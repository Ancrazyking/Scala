package MyTuple

/**
  * @author Ancrazyking
  * @date 2018/7/7 16:09
  *     Tuple元组与列表一样,是不可变的,但是与列表不同的是,元组可以包含多个不同类型的元素.
  *     通过元组名._下标来访问,注意,下标从1开始.
  **/
object Tuple01 {
  def main(args: Array[String]) = {
    val pair = (99, "afeng", 12.3)
    println(pair._1)
    println(pair._2)
    println(pair._3)

  }


}
