/**
 * Class template and definition
 * @param n
 * @param d
 */
class Rational(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n,d)
  val numer:Int = n/g
  val deno:Int = d/g

  // auxiliary constructor
  def this(n: Int) = this(n, 1)

  def +(that: Rational)=new Rational(numer *that.deno + deno *that.numer, deno*that.deno)

  def *(that: Rational)=new Rational(numer *that.numer , deno*that.deno)

  def gcd(n: Int, d: Int): Int = if (d == 0) n else gcd(d, n % d)

  override def toString:String = n+"/"+d


}

object AuxMain{
  def main(args: Array[String]): Unit = {
    val v = new Rational(2,3)
    val v1 = v + new Rational(3,4)
    print(v,"and" , v1)

  }
}


