object calcCost {
  def cost(copies: Int) : Double = {
    val discountedPrice = 24.95 * copies * 0.6
    val shipping = if (copies <= 50) copies * 3.0 else 150 + ((copies - 50) * 0.75)
    val total = discountedPrice + shipping
    total
  }
  def main(arg: Array[String]) : Unit = {
    println("Wholesale cost is " + cost(60))
  }

}
