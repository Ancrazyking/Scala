package MyIO
import scala.io.Source
/**
  * @author Ancrazyking
  * @date 2018/7/11 9:35  
  **/
object ReadFromFile {
  def main(args:Array[String]): Unit ={

    /**
      * 从文件中读取文件信息
      */
    val inputFile=Source.fromFile("output.txt")
    val lines=inputFile.getLines()
    for(line <- lines) println(line)
  }
}
