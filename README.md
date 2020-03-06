# ktor-sample
ktorを動かす

# prepare
install kotlin, gradle

# init Project
```
$ gradle init --type=kotlin-application
Welcome to Gradle 6.2.2!

Here are the highlights of this release:
 - Dependency checksum and signature verification
 - Shareable read-only dependency cache
 - Documentation links in deprecation messages

For more details see https://docs.gradle.org/6.2.2/release-notes.html

Starting a Gradle Daemon (subsequent builds will be faster)

Select build script DSL:
  1: Groovy
  2: Kotlin
Enter selection (default: Kotlin) [1..2] 2

Project name (default: ktor-sample):
Source package (default: ktor.sample):

BUILD SUCCESSFUL in 21s
2 actionable tasks: 2 executed
```

ここからいい感じのやつを作ることもできる。今回はこっちを使用する
https://ktor.io/quickstart/guides/api.html

# Hello world
```
./gradlew build
./gradlew run
```
access to http://0.0.0.0:8080/


