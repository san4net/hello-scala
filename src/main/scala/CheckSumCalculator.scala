import scala.collection.mutable

class CheckSumCalculator {
  private var sum = 0

  def add( b: Byte ): Unit = {
    sum += b
  }

  def checksum():Int ={
     (sum & 0xFF)+1
  }

}

object CheckSumCalculator{
  private val cache = mutable.Map.empty[String, Int]

  def calculate(s: String): Int ={
    if (cache.contains(s))
      cache(s)
    else{
      val acc = new CheckSumCalculator
      for(c<-s){
        acc.add(c.toByte)
      }
      val cs = acc.checksum();
      cache += (s->cs)
      cs
    }
  }
}


