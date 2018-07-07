package functionandinstruction

/**
  * @author Ancrazyking
  * @date 2018/7/7 16:41  
  **/
object function {
  def main(args: Array[String]): Unit = {


  }


  /**
    * 指令式的编程风格
    * 通过var变量
    * @param args
    */
  def printArgs(args: Array[String]): Unit = {
    var i = 0
    while (i < args.length) {
      println(args(i))
      i += 1
    }
  }


  /**
    * 函数式编程风格
    * 无var变量
    * @param args
    */
  def printArgsByFunction(args:Array[String]):Unit={
    for(arg <- args){
      println(arg)
    }


  }


}
