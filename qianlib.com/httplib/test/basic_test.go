package test

import (
	"httplib/domethod"
	"testing"
)

func Test_get(t *testing.T) {
	domethod.Get("http://www.baidu.com")
}
