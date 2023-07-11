import scala.io.StdIn
object Labsheet{
	def main(args: Array[String]): Unit = {
		println("Enter a number:-")
		val num = StdIn.readInt()
		fibonacciSeq(num)


	}

	def fibonacci(n: Int): Int = {
		if (n==0)
			0
		else if (n==1)
			1
		else
			fibonacci(n-1) + fibonacci(n-2);
	}

	def fibonacciSeq(n: Int): Unit = {
		if (n>0)
			fibonacciSeq(n-1);

		print(s"${fibonacci(n)}\t")
	}

}