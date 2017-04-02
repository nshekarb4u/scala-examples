package test.classes

/**
 * A class to test Factory pattern
 */
object TestFactory {
	def main(args: Array[String]): Unit = {
		val f: FactoryTrait = Factory("Testing factory pattern...")

		println(f.toString())
	}
}

trait FactoryTrait {
	def someMethod
}

object Factory {
	private class FactoryClass(n: String) extends FactoryTrait {
		private val msg: String = n

		override def toString: String = getClass.getName + " [" + msg + "]"

		override def someMethod = println(toString())
	}

	def apply(n: String): FactoryTrait = {
		new FactoryClass(n)
	}
}
