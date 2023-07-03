object calcVolume {
  def volume (radius: Double) : Double = (4 * 3.14 * radius * radius * radius)/3

  def main (args: Array[String]) : Unit = {
    val volume_sphere = volume (5)
    println("Volume of the sphere is "+ volume_sphere)
  }

}
