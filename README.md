# kotlin-json-assert
[Kluent](https://github.com/MarkusAmshove/Kluent) style assertions for JSON

Kotlin wrapper of [JSONAssert](https://github.com/skyscreamer/JSONassert)

## Usage
```kotlin
// strict checking is off by default
 """{"firstName": "Bob", "lastName":"Smith"}""".whenJson() `should equal` """{ "firstName": "Bob" }"""
 """{"firstName": "Bob", "lastName":"Smith"}""".whenJson() shouldEqual """{ "firstName": "Bob" }"""
"{}".whenJson() shouldNotEqual """{"firstName":"Bob"}"""

// strict checking can be applied with `should strictly equal`
"""{"firstName": "Bob"}""".whenJson() `should strictly equal` """{ "firstName": "Bob" }"""
"""{"firstName": "Bob"}""".whenJson() shouldStrictlyEqual """{ "firstName": "Bob" }"""

// inverse operations are availble with:
`should not equal`
shouldNotEqual
`should not strictly equal`
shouldNotStrictlyEqual
 ```