object convertTemp {
  def farenheit (celcius: Double) : Double = celcius * 1.8000 + 32.00

  def main(args: Array[String]) : Unit = {
    val temp = farenheit(35)
    println("The temperature is " + temp)

  }

}
