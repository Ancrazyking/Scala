package MyException
import java.io.FileNotFoundException
import java.io.FileReader
import java.io.IOException

/**
  * @author Ancrazyking
  * @date 2018/7/11 10:21
  *      Scala中不支持Java中的"受检查异常(checked exception)",将所有异常都当作"不受检异常"(运行时异常)
  **/
object ExceptionDemo {
  def main(args:Array[String]): Unit ={
    try{
      val f=new FileReader("input.txt")

    }catch{
      case ex:FileNotFoundException =>
      case ex:IOException => println("文件不存在")



    }finally{

    }

  }
}
