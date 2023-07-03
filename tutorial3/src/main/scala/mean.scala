object mean {
    def average(n1: Int, n2: Int): Float = {
      val sum = n1 + n2
      val avg = sum.toFloat / 2
      avg
    }
    def main(args: Array[String]): Unit = {
      val num1 = 18
      val num2 = 45
      printf("Arithmetic Mean: %.2f" , average(num1, num2))
    }


}
