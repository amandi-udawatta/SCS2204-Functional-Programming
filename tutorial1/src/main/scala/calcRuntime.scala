object calcRuntime {
  def time(easy: Double, tempo: Double) : Double = {
    easy * 8 + tempo * 7  //km * min per km
  }
  def main (arg: Array [String]) : Unit = {
    println("Running time " + time(4 , 3))
  }

}
