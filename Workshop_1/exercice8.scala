object Exercise {
  def main(args: Array[String]): Unit = {
    println("Enter a character:")
    val character = scala.io.StdIn.readChar()

    val result = if (character.isUpper) {
      "The character is an uppercase letter."
    } else if (character.isLower) {
      "The character is a lowercase letter."
    } else if (character.isDigit) {
      "The character is a digit."
    } else {
      "The character is not a letter or digit."
    }

    println(result)
  }
}
