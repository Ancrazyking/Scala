package MyObject

/**
  * @author Ancrazyking
  * @date 2018/7/9 19:25  
  **/
class Counter {
  private var value=0
  def increment():Unit={value+=1}
  def current():Int={value}
}
