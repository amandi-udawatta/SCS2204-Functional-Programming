class Rational(n: Int, d: Int) {

  private val gcdValue = gcd(n.abs, d.abs)
  val numerator = n / gcdValue
  val denominator = d / gcdValue

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def neg: Rational = new Rational(-numerator, denominator)

  def +(other: Rational): Rational = {
    new Rational(numerator * other.denominator + other.numerator * denominator, denominator * other.denominator)
  }

  def -(other: Rational): Rational = {
    this + other.neg
  }

  def *(other: Rational): Rational = {
    new Rational(numerator * other.numerator, denominator * other.denominator)
  }

  override def toString: String = s"$numerator/$denominator"
}

object RationalDemo {
  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)
    val negX = x.neg
    println(s"Original rational: $x")
    println(s"Negated rational: $negX")

    val result = x * y - z
    println(s"The result of xy - z is: $result")
  }
}
