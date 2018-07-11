package MyIO

import java.io.PrintWriter

/**
  * @author Ancrazyking
  * @date 2018/7/11 9:33  
  **/
object WriteToFile {
  def main(args: Array[String]): Unit = {
    /**
      * 当前目录下输出到output.txt文件
      * 输出1-5
      */
    val out = new PrintWriter("./output.txt")
    for (i <- 1 to 5)
      out.println(i)
    out.close()


  }
}
