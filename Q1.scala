import scala.io.StdIn

object Labsheet {
  def main(args: Array[String]): Unit = {
    println("Enter a number:")
    val num = StdIn.readInt()
    println(prime(num, 2))
  }

  def prime(n: Int, i: Int): Boolean = {
    if (n <= 1)
      false
    else if (n == i)
      true
    else if (n % i == 0)
      false
    else
      prime(n, i + 1)
  }
}
