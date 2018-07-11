package ScalaDataStructure.ScalaCollection

import scala.collection.mutable.ListBuffer

/**
  * @author Ancrazyking
  * @date 2018/7/11 14:29
  *
  *      序列(Sequence)
  **/
object SequenceDemo {
  def main(args:Array[String]): Unit ={

    /**
      * 序列--列表
      * 列表:一种共享相同类型的不可变的对象序列
      */
    var strList=List("Hadoop","Strom","Spark")

    /**
      * 构造列表通常是在已有列表前端增加元素
      */
    val otherList="Apache"::strList

    println(otherList)

    println(strList)


    /**
      * Scala还定义了一个空列表对象Nil,借助Nil,可以将多个元素用操作符::串起来初始化一个列表
      */
    val intList=1::2::3::Nil




    /**
      * ================================================================
      */


    /**
      * 序列--向量
      * Vetor可以实现所有访问操作都是常数时间
      */
    val v1=Vector(1,2)


    /**
      * 序列 ---ListBuffer和ArrayBuffer
      * 可变的版本 mutable
      */

    val mutableL1=ListBuffer(10,20,30)
    mutableL1+=40
    println(mutableL1)
    mutableL1+=40
    println(mutableL1)

    /**
      * Range类:一种特殊的,带索引的不可变数字等差序列
      * 其包含的值为从给定起点按一定步增长(减小)
      */
    println(1 to 5)





  }
}
