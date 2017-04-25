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

## Android Studio Installation

  - Open settings `⌘,`
  - Go to "Plug Ins"
  - Search for "kotlin" and install "Kotlin language support"

  You can configure updates and other stuff from "Tools" > "Kotlin"

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
    - `kotlinc HelloWorld.kt -include-runtime -d HelloWorld.jar` to compile. `-d` indicates the output `-include-runtime` indicates we want a .jar
    - `java -jar HelloWorld.jar` to run program

  - To run Scripts:
    - `kotlinc -script script_sample.kts /` runs the sample script and list all folders on root folder


License
----

MIT


**Free Software, Hell Yeah!**
