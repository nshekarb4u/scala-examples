package test.advanced

import scala.util.{ Try, Success, Failure }

/**
 * Show cases monads where successful operations can be chained.
 */
object TryMonad {
	def main(args: Array[String]): Unit = {
		
		val l = List(100, 200, 300, 400)
		
		// take an element, divide it by 2, and then square it...
		val m = Try(l(16)).map(_ / 2).map(scala.math.pow(_, 2))

		m match {
			case Success(v) => println(v)
			case Failure(e) => println(e)
		}
	}
}