package test.classes

object TestSingleton {
	def validateEmailFormat(email: String): Boolean = {
		var retVal = false
		// code to validate email	
		retVal
	}

	def isServerUp(host: String = "myserver.com", port: Int = 9999): Boolean = {
		var retVal = false
		// code to ping server
		retVal
	}
}

object TestSingletonMain {
	def main(args: Array[String]): Unit = {
		if (TestSingleton.isServerUp())
			TestSingleton.validateEmailFormat("someone@somewhere.com")
		else
			println("Server is down...")
	}
}