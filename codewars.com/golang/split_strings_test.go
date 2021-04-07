package problems

/*
   Test for Split Strings
   https://www.codewars.com/kata/split-strings/train/go
*/

import (
    "reflect"
    "testing"
)

func TestSplitStrings(t *testing.T) {
    
    r := SplitStrings("abd")
    if !reflect.DeepEqual(r, []string{"ab", "d_"}) {
        t.Error("failed")
    }
    
    r2 := SplitStrings("abdefg")
    if !reflect.DeepEqual(r2, []string{"ab", "de", "fg"}) {
        t.Error("failed")
    }
}
