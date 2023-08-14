object interest {
  def calcInterest(deposit: Double): Double = {
    var interest: Double = 0.0
    if(deposit <= 20000)
      interest = 0.02
    else if(deposit <= 200000)
      interest = 0.04
    else if (deposit <= 2000000)
      interest = 0.035
    else
      interest = 0.065

    //lambda function to get the interest
    val interest_amount = (deposit: Double, interest:Double) => deposit*interest
    interest_amount(deposit, interest)
  }
  def main(args: Array[String]): Unit = {
    val deposit = 30000
    println(calcInterest(deposit))
  }

}
