# Kotlin Lerning

[![Kotlin](https://koenig-media.raywenderlich.com/uploads/2016/07/Kotlin-feature-250x250.png)](https://kotlinlang.org/)

Examples an exercises of Android development using Kotlin Programming language

## Language Features

  - OO Language
  - 100 % interoperable with Java, so can use existing Libraries and frameworks.
  - Statically typed
  - Runs over JVM
  - Is concise, uses lambda expressions and create POJO in just one line of code
  - Is save, restricts programmer from nullable operations
  - Is versatile, allows to build Android applications, J2EE applications, Node.js applications, Web applications
  - It's open source
  - Supported by [IntelliJ](https://www.jetbrains.com/idea/) and [Android Studio](https://developer.android.com/studio/index.html) (JetBrains are the creators, duh)
    - Kotlin is shipped with IntelliJ IDEA since 15
  - Supports immutability. You can declare fixed values
  - Supports functional constructs
  - Does not include Checked Exception (inheritance from Exception but not a subclass of RuntimeException)

## Android Studio Installation

  - Open settings `⌘,`
  - Go to "Plug Ins"
  - Search for "kotlin" and install "Kotlin language support"

  You can configure updates and other stuff from "Tools" > "Kotlin"

## Kotlin Koans

  - Clone Koans from [github](https://github.com/Kotlin/kotlin-koans )
  - Read instructions from [official Kotlin](https://kotlinlang.org/docs/tutorials/koans.html)
  - To use in Android Studio:
    - Import as gradle project
    - each time you want to run a test, firs run in console `./gradlew test`

## Command line compiler

  - On MAC OS X Use [Homebrew](https://brew.sh/):
    - `brew update`
    - `brew unlink kotlin` to remove old installations
    - `brew install kotlin`
    - `kotlinc -version` to test installation
    - `kotlinc -help` if need help

  - To run interactive mode
    - `kotlinc-jvm`
    - `kotlinc`

  - To compile and run a .kt file:
    - `kotlinc Hello.kt -include-runtime -d Hello.jar` to compile. `-d` indicates the output `-include-runtime` indicates we want a .jar
    - `java -jar Hello.jar` to run program

  - To run Scripts:
    - `kotlinc -script script_sample.kts /` runs the sample script and list all folders on root folder

### Some important language notes
- `when` statement does'nt need a break
- `List<type>, Set<type>, Map<type>` is used for immutable (read only) lists, sets, maps
- `MutableList<type>, Set<type>, Map<type>` is used for mutable lists, sets, maps
- `for` loop use ranges and can print with index reference
``
for (i in 1..12){
    println("$i is my index, cool eh\n")
}
``
and reverse
``
for (i in 12 downTo 1 <step 1 is default, so step is optional> step 2){
    println("$i is my index, cool eh\n")
}
``

### Useful about arrays and collections
- `array = arrayOf(element1, element2)` create array (immutable)
- `array.joinToString()` print array
- `array = mutableListOf(element1, element2)` create array (mutable) `mutableSetOf`, `mutableMapOf`
- `mutableMap = mutableMapOf(1 to "Cam", 2 to "Al")`

License
----

MIT


**Free Software, Hell Yeah!**
