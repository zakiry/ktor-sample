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

# 色々追加
sample requests
```
$ curl http://0.0.0.0:8080/date/current

$ curl -H "Content-Type: application/json" -X GET -d '{"diff": 3}' http://0.0.0.0:8080/date/next

$ curl -H "Content-Type: application/json" -X GET -d '{"diff": 3}' http://0.0.0.0:8080/date/nextBusinessDay
```

