object calcArea {
  def area(radius: Double) : Double = 3.14 * radius * radius

  def main(args: Array[String]): Unit = {
    val area_circle = area(5)
    println("The area of the disk is " + area_circle)
  }
}
