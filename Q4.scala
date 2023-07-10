import scala.io.StdIn
object Labsheet{
	def main(args: Array[String]): Unit ={
		println("Enter a number :-")
		var num = StdIn.readInt() 
		println(evenOrOdd(num))

	}

	def evenOrOdd(num: Int): String = {
		if(num==0)
			"Even"
		else if(num == 1)
			"Odd"
		else
			evenOrOdd(num-2)

	}
}