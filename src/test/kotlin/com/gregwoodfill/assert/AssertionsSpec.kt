package com.gregwoodfill.assert

import org.junit.Assert
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on


object AssertionsSpec : Spek({
    given("the shouldEqualJson method") {
        val underTest = """{"firstName": "Bob", "lastName":"Smith"}"""

        on("checking between two fully equal objects") {
            val expected = """{"firstName": "Bob", "lastName":"Smith"}"""
            it("should pass") {
                underTest shouldEqualJson expected
            }
        }
        on("comparing expected with fewer values") {
            val expected = """{"firstName": "Bob"}"""
            underTest shouldEqualJson expected
        }
    }

    given("the `should equal json` method") {
        val underTest = """{"firstName": "Bob", "lastName":"Smith"}"""

        on("checking between two fully equal objects") {
            val expected = """{"firstName": "Bob", "lastName":"Smith"}"""
            it("should pass") {
                underTest `should equal json` expected
            }
        }
        on("comparing expected with fewer values") {
            val expected = """{"firstName": "Bob"}"""
            underTest `should equal json` expected
        }

        on("extra element in the expected") {
            val expected = """{"firstName": "Bob", "foo": "bar"}"""
            it("should fail") {
                try {
                    underTest `should equal json` expected
                } catch (ex: AssertionError) {
                }

            }
        }
    }
    given("the shouldStrictlyEqualJson") {
        on("comparing exact json") {
            val underTest = """{"firstName": "Bob" }"""
            val expected = """{ "firstName": "Bob" }"""
            it("should pass") {
                underTest shouldStrictlyEqualJson expected
            }
        }

        on("comparing json with more keys") {
            val underTest = """{"firstName": "Bob", "lastName": "Smith" }"""
            val expected = """{ "firstName": "Bob" }"""
            it("should fail") {
                try {
                    underTest shouldStrictlyEqualJson expected
                } catch (ex: AssertionError) {

                }
            }
        }
    }

    given("the `should strictly equal json`") {
        on("comparing exact json") {
            val underTest = """{"firstName": "Bob" }"""
            val expected = """{ "firstName": "Bob" }"""
            it("should pass") {
                underTest `should strictly equal json` expected
            }
        }

        on("comparing json with more keys") {
            val underTest = """{"firstName": "Bob", "lastName": "Smith" }"""
            val expected = """{ "firstName": "Bob" }"""
            it("should fail") {
                try {
                    underTest `should strictly equal json` expected
                    Assert.fail()
                } catch (ex: AssertionError) {

                }
            }
        }
    }

    given("the shouldNotEqualJsonMethod") {
        on("comparing fields that don't match value") {
            val underTest = """{"firstName": "Bob" }"""
            val expected = """{ "firstName": "Greg" }"""

            it("should pass") {
                underTest shouldNotEqualJson expected
            }
        }

        on("comparing extra fields in expected") {
            val underTest = """{"firstName": "Bob" }"""
            val expected = """{ "firstName": "Bob", "lastName": "Smith" }"""
            it("should pass") {
                underTest shouldNotEqualJson expected
            }
        }

        on("comparing equal json"){
            val underTest = """{"firstName": "Bob", "lastName": "Smith" }"""
            val expected = """{ "firstName": "Bob", "lastName": "Smith" }"""
            it("should fail"){
                try{
                    underTest shouldNotEqualJson expected
                } catch (ex: AssertionError){

                }
            }
        }
    }

    given("the `should not equal json` method") {
        on("comparing fields that don't match value") {
            val underTest = """{"firstName": "Bob" }"""
            val expected = """{ "firstName": "Greg" }"""

            it("should pass") {
                underTest `should not equal json` expected
            }
        }

        on("comparing extra fields in expected") {
            val underTest = """{"firstName": "Bob" }"""
            val expected = """{ "firstName": "Bob", "lastName": "Smith" }"""
            it("should pass") {
                underTest `should not equal json` expected
            }
        }

        on("comparing equal json"){
            val underTest = """{"firstName": "Bob", "lastName": "Smith" }"""
            val expected = """{ "firstName": "Bob", "lastName": "Smith" }"""
            it("should fail"){
                try{
                    underTest `should not equal json` expected
                } catch (ex: AssertionError){

                }
            }
        }
    }

})