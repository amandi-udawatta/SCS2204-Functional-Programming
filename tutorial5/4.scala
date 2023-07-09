object evenOrOdd {
  def isEvenOrOdd(n: Int): String = {
    if(n == 0){
      return "Even"
    }
    else if (n == 1) {
      return "Odd"
    }
    isEvenOrOdd(n-2)
  }

  def main(args:Array[String]): Unit = {
    println(isEvenOrOdd(7))
  }

}
