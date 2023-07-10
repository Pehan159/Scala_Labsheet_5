import scala.io.StdIn

object Labsheet {
  def main(args: Array[String]): Unit = {
    println("Enter a number:")
    val num = StdIn.readInt()
    val result = decrease(num, 0)
    println(result)
  }

  def decrease(num: Int, result: Int): Int = {
    if (num >= 0) {
      val newResult = result + evenOrOdd(num, num)
      decrease(num - 1, newResult)
    } else {
      result
    }
  }

  def evenOrOdd(num: Int, originalNum: Int): Int = {
    if (num == 0)
      originalNum
    else if (num == 1)
      0
    else
      evenOrOdd(num - 2, originalNum)
  }
}
