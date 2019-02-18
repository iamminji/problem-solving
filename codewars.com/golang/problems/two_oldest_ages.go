package problems

import (
    "fmt"
)

/*
    Two Oldest Ages
    https://www.codewars.com/kata/two-oldest-ages-1/train/go
*/

func TwoOldestAges(ages []int) [2]int {
    
    // 가장 큰 수 두개를 뽑는 문제
    
    for n := range ages {
        fmt.Println(n)
    }
    return [2]int{1, 2}
}
