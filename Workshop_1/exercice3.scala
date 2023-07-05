object Exercise {
  def main(args: Array[String]): Unit = {
    println("Enter a year:")
    val year = scala.io.StdIn.readInt()
    val isLeapYear = if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
      true
    } else {
      false
    }
    if (isLeapYear) {
      println("Leap year")
    } else {
      println("Not a leap year")
    }
  }
}
