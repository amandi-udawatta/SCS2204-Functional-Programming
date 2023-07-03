object eval {
  def main(args: Array[String]): Unit = {
    var a: Int = 2
    var b: Int = 3
    var c: Int = 4
    var d: Int = 5
    var k: Float = 4.3f

    // println(--b * a + c * d--); -> Invalid syntax
    b -= 1
    println(b * a + c * d)
    d -= 1
    // println(a++); -> Invalid syntax
    println(a)
    a += 1
    //println(-2 * (g - k) + c); -> g is not declared or initialized
    var g: Float = 4.0f
    println(-2 * (g-k) + c)
    // println(c = c++); -> Invalid syntax
    println(c)
    c += 1
    // println(c = ++c * a++); -> Invalid syntax
    c += 1
    println( c * a)
    a += 1
  } }

