package com.gregwoodfill.assert

import org.skyscreamer.jsonassert.JSONAssert


/**
 * Assert that JSON is equal to another JSON without strict checking
 *
 *
 * @see JSONAssert.assertEquals(String, String, Boolean)
 */
infix fun String.shouldEqualJson(expected: String) = JSONAssert.assertEquals(expected, this, false)

infix fun String.`should equal json`(expected: String) = shouldEqualJson(expected)

/**
 * Assert that JSON is equal to another JSON with strict checking
 *
 * @see JSONAssert.assertEquals(String, String, Boolean)
 */
infix fun String.shouldStrictlyEqualJson(expected: String) = JSONAssert.assertEquals(expected, this, true)

infix fun String.`should strictly equal json`(expected: String) = shouldStrictlyEqualJson(expected)


/**
 * Assert that JSON is not strictly equal to another JSON with strict checking
 *
 * @see JSONAssert.assertNotEquals(String, String, Boolean)
 */
infix fun String.shouldNotStrictlyEqualJson(expected: String) = JSONAssert.assertNotEquals(expected, this, true)

infix fun String.`should not strictly equal json`(expected: String) = shouldNotStrictlyEqualJson(expected)


/**
 * Assert that JSON is not equal to another JSON with strict checking
 *
 * @see JSONAssert.assertNotEquals(String, String, Boolean)
 */
infix fun String.shouldNotEqualJson(expected: String) = JSONAssert.assertNotEquals(expected, this, false)

infix fun String.`should not equal json`(expected: String) = shouldNotEqualJson(expected)
