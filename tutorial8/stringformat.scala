object formatCase {

  def toUpper(input: String): String = {
    input.toUpperCase
  }

  def toLower(input: String): String = {
    input.toLowerCase
  }
  
  def formatNames(name: String)(func: String => String): String = {
    func(name)
  }

  def main(args: Array[String]): Unit = {
    var n1 = "Benny"
    var n2 = "Niroshan"
    var n3 = "Saman"
    var n4 = "Kumara"

    println(formatNames(n1)(toUpper))
    println(formatNames(n2.take(2))(toUpper) + formatNames(n2.drop(2))(toLower))
    println(formatNames(n3)(toLower))
    println(n4.dropRight(1) + formatNames(n4.takeRight(1))(toUpper))

  }

}
