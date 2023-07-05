object Exercise {
  def main(args: Array[String]): Unit = {
    println("Enter the first number:")
    val number1 = scala.io.StdIn.readInt()
    println("Enter the second number:")
    val number2 = scala.io.StdIn.readInt()
    val largerNumber = if (number1 > number2) number1 else number2
    println(s"The larger number is $largerNumber")
  }
}