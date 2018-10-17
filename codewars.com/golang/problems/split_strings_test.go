/*
   Test for Split Strings
   https://www.codewars.com/kata/split-strings/train/go
*/

package problems

import (
	"../problems"
	"reflect"
	"testing"
)

func TestSplitStrings(t *testing.T) {

	r := problems.SplitStrings("abd")
	if !reflect.DeepEqual(r, []string{"ab", "d_"}) {
		t.Error("failed")
	}

	r2 := problems.SplitStrings("abdefg")
	if !reflect.DeepEqual(r2, []string{"ab", "de", "fg"}) {
		t.Error("failed")
	}
}
