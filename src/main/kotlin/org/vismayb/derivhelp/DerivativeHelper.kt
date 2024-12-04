package org.vismayb.derivhelp

object DerivativeHelper {
    fun powerRule(function: String, degree: Int = 1): String {
        if (degree != 1) throw IllegalArgumentException("Degree must be 1.")

        val differentiated = StringBuilder()
        val terms: Array<String> = function
            .trim()
            .split(" ")
            .toTypedArray()

        for (term in terms) {
            if (term == "+" || term == "-") {
                differentiated.append(term).append(" ")
                continue
            }

            val coefficient: Int = term.substring(0, term.indexOf("x")).toInt()
            val exponent: Int = term.substring(term.indexOf("^") + 1).toInt()

            if(exponent - 1 == 1) {
                differentiated.append("${coefficient * exponent} ")
            } else {
                differentiated.append("${coefficient * exponent}x^${exponent - 1} ")
            }
        }

        return differentiated.toString().trim()
    }
}
