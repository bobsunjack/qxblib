package main

import (
	"httplib/domethod"
)

func main() {
	content := domethod.Get("http://www.baidu.com")
	println(content)
}
