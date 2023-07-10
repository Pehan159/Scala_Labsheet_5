import scala.io.StdIn

object Labsheet {
  def main(args: Array[String]): Unit = {
    println("Enter a number:")
    val num = StdIn.readInt()
    decrease(num)
  }

  def decrease(num: Int): Unit = {
    if (num >= 2) {
      print(prime(num, 2)+" ")
      decrease(num - 1)
    }
  }

  def prime(n: Int, i: Int): String= {
    if (n <= 1)
      " "
    else if (n == i)
      n.toString
    else if (n % i == 0)
      " "
    else
      prime(n, i + 1)
  }
}
