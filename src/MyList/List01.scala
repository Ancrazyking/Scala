package MyList

/**
  * @author Ancrazyking
  * @date 2018/7/7 11:22  
  **/
object List01 {
  def main(args: Array[String]): Unit = {
    val list = List.apply(1, 2, 3)
    //val list=List(1,2,3)
    for (i <- list)
      print(i)
  }
}
