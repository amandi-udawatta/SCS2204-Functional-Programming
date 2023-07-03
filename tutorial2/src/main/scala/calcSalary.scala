object calcSalary {
  def salary (norm : Double, OT : Double) : Double = {
    val beforetax = (norm * 250) + (OT * 85)
    val aftertax = beforetax * 0.88 //tax is 12%
    aftertax
  }
  def main(arg : Array[String]) : Unit = {
    println("Take home salary is Rs." + salary(40, 30))
  }
}
