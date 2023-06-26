object Exercise {
  def main(args: Array[String]): Unit = {
    println("Enter a three-digit number:")
    val number = scala.io.StdIn.readInt()

    val digit1 = number / 100
    val digit2 = (number / 10) % 10
    val digit3 = number % 10

    val sumOfCubes = Math.pow(digit1, 3) + Math.pow(digit2, 3) + Math.pow(digit3, 3)

    val result = if (number == sumOfCubes.toInt) {
      "The number is an Armstrong number."
    } else {
      "The number is not an Armstrong number."
    }

    println(result)
  }
}
