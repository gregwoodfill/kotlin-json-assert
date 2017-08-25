package com.gregwoodfill.assert

import org.skyscreamer.jsonassert.JSONAssert

class JsonRep(val strValue: String)

/**
 * Convert String to dummy object that gives us a way to fluently provide assertEquals on json.
 *
 * "{}".whenJson() shouldEqual "{ }"
 */
fun String.whenJson(): JsonRep = JsonRep(strValue = this)

/**
 * Assert that JSON is equal to another JSON without strict checking
 *
 *
 * @see JSONAssert.assertEquals(String, String, Boolean)
 */
infix fun JsonRep.shouldEqual(expected:String) = JSONAssert.assertEquals(expected, this.strValue, false)
infix fun JsonRep.`should equal`(expected:String) = shouldEqual(expected)

/**
 * Assert that JSON is equal to another JSON with strict checking
 *
 * @see JSONAssert.assertEquals(String, String, Boolean)
 */
infix fun JsonRep.shouldStrictlyEqual(expected:String) = JSONAssert.assertEquals(expected, this.strValue, true)
infix fun JsonRep.`should strictly equal`(expected:String) = shouldStrictlyEqual(expected)


/**
 * Assert that JSON is not strictly equal to another JSON with strict checking
 *
 * @see JSONAssert.assertNotEquals(String, String, Boolean)
 */
infix fun JsonRep.shouldNotStrictlyEqual(expected:String) = JSONAssert.assertNotEquals(expected, this.strValue, true)
infix fun JsonRep.`should not strictly equal`(expected:String) = shouldNotStrictlyEqual(expected)


/**
 * Assert that JSON is not equal to another JSON with strict checking
 *
 * @see JSONAssert.assertNotEquals(String, String, Boolean)
 */
infix fun JsonRep.shouldNotEqual(expected:String) = JSONAssert.assertNotEquals(expected, this.strValue, false)
infix fun JsonRep.`should not equal`(expected:String) = shouldNotEqual(expected)