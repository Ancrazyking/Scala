package MyList

/**
  * @author Ancrazyking
  * @date 2018/7/7 11:34  
  **/
object List03 {


  def main(args:Array[String]): Unit ={
    val  list=List(3,4,5)
    val  listMiddle=2::list
    val  listEnd=1::listMiddle
    print(listEnd)
  }


}
