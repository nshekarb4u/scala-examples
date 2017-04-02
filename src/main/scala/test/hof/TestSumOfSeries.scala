package test.hof

object TestSumOfSeries {

	def main(args: Array[String]): Unit = {
		println("Sum of natural numbers from 1 to 5: " + sumOfSeries(linear, 1, 5))
		println("Sum of natural squares from 1 to 3: " + sumOfSeries(quadratic, 1, 3))

		println("\n*** Function literals/Anonymous functions/Lambda expressions ***")
		println("Sum of natural numbers from 1 to 5: " + sumOfSeries(x => x, 1, 5))
		println("Sum of natural squares from 1 to 3: " + sumOfSeries(x => x * x, 1, 3))
	}

	def sumOfSeries(f: Int => Int, x: Int, y: Int): Int = {
		if (x > y) 0
		else f(x) + sumOfSeries(f, x + 1, y)
	}

	def quadratic(x: Int): Int = x * x

	def linear(x: Int): Int = x
}