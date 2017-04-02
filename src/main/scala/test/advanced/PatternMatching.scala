package test.advanced

case class StudentScores(id: Long, name: String, marks: List[Int])

object PatternMatching {
	def main(args: Array[String]): Unit = {

		val httpCode = 404

		httpCode match {
			case 404 => println("Not found")
			case 500 => println("Internal server error")
			case _ => println("Other HTTP errors...")
		}

		val testStore = StudentScores(100L, "Bright Bulb", List(66, 78, 81))
		testStore match {
			case obj: StudentScores => println(s"${obj.name}'s total score is ${obj.marks.sum}")
			case _ => println("Dont send me spooky objects to work with...")
		}
	}
}