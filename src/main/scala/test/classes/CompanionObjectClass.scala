package test.classes

/**
 * Companion objects needs to be in the same source file.
 * Companion objects and classes have access to each others members.
 */
class Instances (private val msg: String) {
	Instances.instanceCount += 1
	println(msg)
}

object Instances {
	private var instanceCount: Int = 0

	def getInstanceCount: Int = { instanceCount }
}

object Main {
	def main(args: Array[String]): Unit = {
		
		for (i <- 1 to 10) new Instances(s"test message $i")

		println(">>> Number of instance created = " + Instances.getInstanceCount)
	}
}