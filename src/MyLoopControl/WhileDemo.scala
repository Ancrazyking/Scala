package MyLoopControl

/**
  * @author Ancrazyking
  * @date 2018/7/11 9:46
  *     Scala中基本没有分号;能省略就省,除非一行有多个语句.
  **/
object WhileDemo {
  def main(args:Array[String]): Unit ={
    /**
      * while循环
      */
    var i=9
    while(i > 0){
      printf("i is %d\n",i)
      i =i-1
    }


    /**
      * do--while循环
      */
    var j=0
    do{
      j=j+1
      printf("j is %d\n",j)
    }while(j<5)



  }

}
