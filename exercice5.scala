object Exercise {
  def main(args: Array[String]): Unit = {
    println("Enter a character:")
    val character = scala.io.StdIn.readLine().toLowerCase().charAt(0)

    val isVowel = if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
      true
    } else {
      false
    }

    if (isVowel) {
      println("The character is a vowel.")
    } else {
      println("The character is a consonant.")
    }
  }
}
