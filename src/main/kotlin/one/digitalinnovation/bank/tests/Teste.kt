package one.digitalinnovation.bank.tests

fun main(args: Array<String>) {
	/*for (x in IntProgression.fromClosedRange(1, readLine()!!.toInt(), 1).filter { it % 2 != 0 }) {
		println(x)
	}*/

	var r = 1
	for (i in 1..readLine()!!.toInt()) {

		println("${i} ${i * i} ${i * i * i}")

		r += i
	}

}