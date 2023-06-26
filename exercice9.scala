object Exercise {
  def main(args: Array[String]): Unit = {
    println("Enter your grade:")
    val grade = scala.io.StdIn.readChar().toUpper

    val message = grade match {
      case 'A' => "Excellent!"
      case 'B' => "Good job!"
      case 'C' => "Keep it up!"
      case 'D' => "You need to improve"
      case 'F' => "Failed"
      case _ => "Invalid grade"
    }
    println(message)
  }
}
