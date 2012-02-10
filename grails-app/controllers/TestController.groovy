class TestController {
	def edit = {
		session.myval = "Something in the Session!"
		throw new Exception("EditException ${System.currentTimeMillis()}")
	}
}