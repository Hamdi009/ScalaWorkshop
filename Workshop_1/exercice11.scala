object Exercise {
  def main(args: Array[String]): Unit = {
    println("Enter a positive integer:")
    val number = scala.io.StdIn.readInt()

    val isPrime = if (number < 2) {
      false
    } else {
      var isPrime = true
      for (i <- 2 until number) {
        if (number % i == 0) {
          isPrime = false
        }
      }
      isPrime
    }
    val result = if (isPrime) {
      "The number is prime."
    } else {
      "The number is not prime."
    }
    println(result)
  }
}
