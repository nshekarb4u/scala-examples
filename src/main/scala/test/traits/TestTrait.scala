package test.traits

/**
 * Shows chaining of traits with "with" keyword
 */
trait X {
	override def toString = "X"
}

trait Y {
	override def toString = "Y -> " + super.toString()
}

trait Z {
	override def toString = "Z -> " + super.toString()
}

class A extends X with Y with Z {
	override def toString = "A -> " + super.toString()
}

object TestTraitDriver {
	def main(args: Array[String]): Unit = {
		val a = new A()
		println(a)
	}
}