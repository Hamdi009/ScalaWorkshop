object Exercise {
  def main(args: Array[String]): Unit = {
    println("Enter a number:")
    val number = scala.io.StdIn.readInt()

    if (number > 0) {
      println("The number is positive.")
    } else if (number < 0) {
      println("The number is negative.")
    } else {
      println("The number is zero.")
    }
  }
}
