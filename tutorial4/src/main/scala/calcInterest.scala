object calcInterest {

  def interest (deposit: Double): Double = {
    val interestAmount = deposit match {
      case deposit if (deposit <= 20000) => deposit * 0.02
      case deposit if (deposit <= 200000) => deposit * 0.04
      case deposit if (deposit <= 2000000) => deposit * 0.035
      case deposit if (deposit > 2000000) => deposit * 0.065
    }
    interestAmount
  }

  def main(args: Array[String]): Unit = {
    val deposit = 1000
    println("interest for Rs." + deposit + " is: Rs." + interest(deposit))
  }

}
