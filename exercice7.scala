object Exercise {
  def main(args: Array[String]): Unit = {
    println("Enter the first number:")
    val number1 = scala.io.StdIn.readInt()

    println("Enter the second number:")
    val number2 = scala.io.StdIn.readInt()

    println("Enter the third number:")
    val number3 = scala.io.StdIn.readInt()

    val largestNumber = if (number1 > number2 && number1 > number3) {
      number1
    } else if (number2 > number1 && number2 > number3) {
      number2
    } else {
      number3
    }

    println(s"The largest number is $largestNumber")
  }
}
