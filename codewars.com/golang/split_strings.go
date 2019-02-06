/*
   Split Strings
   https://www.codewars.com/kata/split-strings/train/go
*/

package problems

import (
	"strings"
)

func SplitStrings(str string) []string {

	var cnt = 0
	var result []string
	var stringBuilder = new(strings.Builder)

	for _, s := range str {

		if cnt == 2 {
			cnt = 0
			result = append(result, stringBuilder.String())
			stringBuilder = new(strings.Builder)

		}
		stringBuilder.WriteString(string(s))
		cnt += 1
	}

	if len(str)%2 != 0 {
		stringBuilder.WriteString("_")
	}
	result = append(result, stringBuilder.String())

	return result
}
