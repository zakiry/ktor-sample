# ktor-sample
ktorを動かす

# prepare
install kotlin, gradle

# init Project
```
$ gradle init --type=kotlin-application
```

ここからいい感じのやつを作ることもできる。今回はこっちを使用する
https://ktor.io/quickstart/guides/api.html

# Hello world
```
./gradlew build
./gradlew run
```
access
```
$ curl http://0.0.0.0:8080/json/jackson
{
  "hello" : "world"
}
```
