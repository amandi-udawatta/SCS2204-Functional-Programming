object patternmatch{
  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide a single integer input.")
    } else {
      val input = args(0).toInt

      val messageFunc = (input: Int) => input match {
        case n if n <= 0 => "Negative/Zero is input"
        case n if n % 2 == 0 => "Even number is given"
        case n if n % 2 != 0 => "Odd number is given"
      }

      val resultMessage = messageFunc(input)
      println(resultMessage)
    }
  }
}
