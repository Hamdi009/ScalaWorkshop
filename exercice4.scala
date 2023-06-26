object Exercise {
  def main(args: Array[String]): Unit = {
    println("Enter your age:")
    val age = scala.io.StdIn.readInt()
    if (age < 18) {
      println("You are a minor.")
    } else {
      println("You are an adult.")
    }
  }
}
