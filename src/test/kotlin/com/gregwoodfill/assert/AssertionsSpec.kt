package com.gregwoodfill.assert

import org.junit.Test

class AssertionsSpec {

    @Test
    fun `json equals other with additional fields`() {
        val underTest = """{"firstName": "Bob", "lastName":"Smith"}"""
        val expected = """{ "firstName": "Bob" }"""

        underTest shouldEqualJson expected
        underTest `should equal json` expected
    }

    @Test
    fun `json equals other with exact match`() {
        val underTest = """{"firstName": "Bob" }"""
        val expected = """{ "firstName": "Bob" }"""

        underTest shouldEqualJson expected
        underTest `should equal json` expected
    }

    @Test
    fun `json strictly equals`() {
        val underTest = """{"firstName": "Bob" }"""
        val expected = """{ "firstName": "Bob" }"""

        underTest shouldStrictlyEqualJson expected
        underTest `should strictly equal json` expected
    }


    @Test
    fun `json strictly not equals`() {
        val underTest = """{"firstName": "Bob", "lastName": "Smith" }"""
        val expected = """{ "firstName": "Bob" }"""

        underTest shouldNotStrictlyEqualJson expected
        underTest `should not strictly equal json` expected
    }

    @Test
    fun `json should not equal - value diff`() {
        val underTest = """{"firstName": "BobZ" }"""
        val expected = """{ "firstName": "Bob" }"""

        underTest shouldNotEqualJson expected
        underTest `should not equal json` expected
    }

    @Test
    fun `json should not equal - key difference`() {
        val underTest = """{"firstNameZ": "Bob" }"""
        val expected = """{ "firstName": "Bob" }"""

        underTest shouldNotEqualJson expected
        underTest `should not equal json` expected
    }
}