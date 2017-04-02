package test.classes

/**
 * Example of an immutable class.
 * 
 * Note: Scala Cookbook - Alvin Alexander
 * If a field is declared as a var, Scala generates both getter and setter methods for that field.
 * If the field is a val, Scala generates only a getter method for it.
 * If a field doesn’t have a var or val modifier, Scala gets conservative, and doesn’t generate a getter 
 * or setter method for the field.
 * Additionally, var and val fields can be modified with the private keyword, which prevents getters 
 * and setters from being generated.
 */
class TestClass(val name: String, val age: Int) {
	// Auxillary constructor
	def this(age: Int) {
		this("John Doe", age)
	}
}

object TestClassDriver {
	def main(args: Array[String]) {
		var p: TestClass = new TestClass("Prithviraj Bose", 18)

		println(p.name + "/" + p.age)

		p = new TestClass(100)
		println(p.name + "/" + p.age)

	}
}
