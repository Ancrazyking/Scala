package MyLoopControl

/**
  * @author Ancrazyking
  * @date 2018/7/11 9:52  
  **/
object ForDemo {
  def main(args:Array[String]): Unit ={

    /**
      * 像 变量 <- 表达式 被称为 生成器(generator)
      */
    for(i <- 1 to 5)
        printf("i is %d \n",i)

    /**
      * by2表示以2递增
      */
    for(i <-1 to 5 by 2)
        printf("i is %d \n",i)


    /**
      * 增加了条件判断语句,守卫的表达式
      */
    for(i <- 1 to 5 if i%2==0)
      println(i)


    println("=======================================")

    /**
      * Scala中支持多个生成器.
      */
    for(i  <- 1 to 5 ;j <- 1 to 3 )println(i*j)


    /**
      * for推导式,在每次执行的时候创创造一个值,
      * 然后将包含了所有产生值的集合作为for循环的表达式返回一个集合,
      * 集合类型由生成器中的集合类型确定.
      */

    for( i<- Array(1,2,3,4,5) if i%2==0 ) yield {println(i)}





  }


}
