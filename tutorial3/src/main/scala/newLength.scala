object newLength {

  def newList(oldList: List[String]): List[String] = {
    oldList.filter(_.length > 5)
  }

  def main(args: Array[String]): Unit = {
    val list = List("apple", "banana", "grapes", "kiwi", "123456", "papaya")
    println("new list: " + newList(list))
  }

}
