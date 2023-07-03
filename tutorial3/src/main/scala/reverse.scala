object reverse {

  def rev(word: String): String = {
    if (word.isEmpty) ""
    else rev(word.tail) + word.head
  }
    def main(args: Array[String]): Unit = {
      val str = "Hello, good morning"
      println("reversed string:" + rev(str))
    }

}
