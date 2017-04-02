package test.hof

object TestHOF {
	def main(args: Array[String]): Unit = {

		var ints: List[Int] = List(1, 2, 3, 4, 5)

		println("Squaring the elements...")
		for (i <- MyMathLib.transform(MyMathLib.quadratic, ints)) print(i + " ")

		ints = List(2, 3, 4)

		println("\nCubing the elements...")
		for (i <- MyMathLib.transform(MyMathLib.cubic, ints)) print(i + " ")
		
		println("\nWith Lambda Expressions/Function Literals/Anonymous Functions")
		for (i <- MyMathLib.transform(x => x * x, ints)) print(i + " ")
	}

}

object MyMathLib {
	def transform(f: Int => Int, numbers: List[Int]): List[Int] =
		for (i <- numbers) yield f(i)

	def quadratic(x: Int): Int = x * x

	def cubic(x: Int): Int = x * x * x
}
