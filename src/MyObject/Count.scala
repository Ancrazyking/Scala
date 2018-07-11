package MyObject

/**
  * @author Ancrazyking
  * @date 2018/7/9 20:58
  **/
class Count {
  var value = 0 //无private修饰符,从而让这个变量对外部可见,可以用getter和setter方法
  val m = 1 //可以通过getter获得,无法通过setter设置
  def increment(step: Int): Unit = {
    value += step
  }

  def current(): Int = {
    value
  }
}

object Count {



}
