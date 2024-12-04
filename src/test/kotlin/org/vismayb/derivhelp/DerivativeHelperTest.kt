package org.vismayb.derivhelp

import org.junit.jupiter.api.Test
import org.vismayb.derivhelp.DerivativeHelper.powerRule
import kotlin.test.*

class DerivativeHelperTest {
    @Test
    fun testTermEquals() {
        assertEquals(Term(), Term())
    }

    @Test
    fun testPowerRule() {
        assertEquals("30x^4 - 16x^3 + 24x^2", powerRule("6x^5 - 4x^4 + 8x^3"))
        assertEquals("30x^5 + 15x^4 - 14", powerRule("5x^6 + 3x^5 - 7x^2"))
    }
}