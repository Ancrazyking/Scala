package MyList

/**
  * @author Ancrazyking
  * @date 2018/7/7 11:29
  *::是列表中最常用的操作符,发音为"cons",它可以把新元素组合到现有列表的最前端,然后返回新列表
  *
  **/
object List02 {
  def main(args:Array[String]): Unit ={
    val list1=List(1,2)
    val list2=List(3,4)
    //val list=list1:::list2
    //val list=list2::list1
    val list=list2.::(list1)
    for (i <- list)
      print(i)




  }



}
