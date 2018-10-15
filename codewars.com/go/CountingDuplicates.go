package main

func duplicate_count(s1 string) int {

    var dict = make(map[int32]int)

    for _, char := range s1 {
        if char >= 97 {
            char -= 32
        }
        dict[char] += 1
    }

    var cnt = 0
    for _, v := range dict {
        if v >= 2 {
            cnt += 1
        }
    }
    return cnt
}

