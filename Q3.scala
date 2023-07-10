import scala.io.StdIn
object Labsheet{
	def main(args: Array[String]): Unit = {
		println(calAdd(5))

	}

	def calAdd(num: Int): Int ={
		var x = num
		
		if(num != 0){
			x = x +calAdd(num-1)
		}
		return x

	}
}