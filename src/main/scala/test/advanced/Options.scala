package test.advanced

object Options {
  
	def test(value: Int): Option[String] = {
		
		if (value > 10)
			return Some("Value is greater than 10")
		
		None
	}
	
	def main(args: Array[String]): Unit = {
	  
		test(100) match {
			case Some(str) => println(str)
			case None => println("Value must have been less than/equal to 10...")
		}

		test(-100) match {
			case Some(str) => println(str)
			case None => println("Value must have been less than/equal to 10...")
		}
	}
}