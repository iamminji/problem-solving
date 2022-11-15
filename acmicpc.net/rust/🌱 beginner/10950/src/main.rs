use std::io::{self, BufRead};

fn main() {
    let stdin = io::stdin();
    let mut iterator = stdin.lock().lines();
    let mut cases: i32 = iterator.next().unwrap().unwrap().parse().unwrap();

    while cases > 0 {
        cases -= 1;
        let mut nums = iterator.next().unwrap().unwrap();
        let values: Vec<i32> = nums
            .as_mut_str()
            .split_whitespace()
            .map(|s| s.parse().unwrap())
            .collect();
        println!("{}", values[0] + values[1]);
    }
}
