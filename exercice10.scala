object Exercise {
  def main(args: Array[String]): Unit = {
    println("Enter a month number between (1-12):")
    val monthNumber = scala.io.StdIn.readInt()

    val monthName = monthNumber match {
      case 1 => "January"
      case 2 => "February"
      case 3 => "March"
      case 4 => "April"
      case 5 => "May"
      case 6 => "June"
      case 7 => "July"
      case 8 => "August"
      case 9 => "September"
      case 10 => "October"
      case 11 => "November"
      case 12 => "December"
      case _ => "Invalid month number"
    }
    println(monthName)
  }
}
