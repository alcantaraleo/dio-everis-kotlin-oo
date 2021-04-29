package one.digitalinnovation.bank

class Authenticator {

	companion object {
		fun authenticate(someone: Authentication) {
			if (someone.login()) {
				println("Authenticated")
			} else {
				println("Access denied")
			}
		}
	}

}