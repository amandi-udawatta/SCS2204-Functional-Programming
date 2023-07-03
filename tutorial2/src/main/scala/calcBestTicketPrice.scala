object calcBestTicketPrice {
  def profit (price : Int, attendance : Int) : Double = {
    val loss: Double = 500 + (attendance * 3)
    val gain: Double = (attendance * price) - loss
    gain
  }

  def main (arg : Array[String]) : Unit = {
    if(profit(20 , 100) > profit(10, 140)){
      println("Best ticket price is Rs. 20")
    }
    else{
      println("Best ticket price is Rs. 10")
    }
  }
}