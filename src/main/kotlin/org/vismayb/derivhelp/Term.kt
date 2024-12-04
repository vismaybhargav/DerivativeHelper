package org.vismayb.derivhelp

class Term(val coefficient: Double = 0.0, val exponent: Double = 1.0) {
    override fun equals(other: Any?): Boolean {
        return other is Term && (coefficient == other.coefficient && exponent == other.exponent)
    }

    override fun hashCode(): Int {
        var result = coefficient.hashCode()
        result = 31 * result + exponent.hashCode()
        return result
    }

    override fun toString(): String {
        return "${coefficient}x^${exponent}"
    }
}