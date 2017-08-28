# kotlin-json-assert
[Kluent](https://github.com/MarkusAmshove/Kluent) style assertions for JSON

Kotlin wrapper of [JSONAssert](https://github.com/skyscreamer/JSONassert)

## Usage
```kotlin
// strict checking is off by default
 """{"firstName": "Bob", "lastName":"Smith"}""" `should equal json` """{ "firstName": "Bob" }"""
 """{"firstName": "Bob", "lastName":"Smith"}""" shouldEqualJson """{ "firstName": "Bob" }"""
"{}" shouldNotEqualJson """{"firstName":"Bob"}"""
"{}" `should not equal json` """{"firstName":"Bob"}"""

// strict checking can be applied with `should strictly equal`
"""{"firstName": "Bob"}""" `should strictly equal json` """{ "firstName": "Bob" }"""
"""{"firstName": "Bob"}""" shouldStrictlyEqualJson """{ "firstName": "Bob" }"""

// inverse operations are available with:
`should not equal json`
shouldNotEqualJson
`should not strictly equal json`
shouldNotStrictlyEqualJson
 ```
