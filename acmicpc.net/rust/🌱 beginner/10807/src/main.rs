use std::io::{BufRead, stdin};
use std::fmt::Write;


fn main() {
    let stdin = stdin();
    let mut iterator = stdin.lock().lines();

    let cases: i32 = iterator.next().unwrap().unwrap().parse().unwrap();
    let values: Vec<i32> = iterator
        .next()
        .unwrap()
        .unwrap()
        .split_whitespace()
        .map(|s| s.parse().unwrap())
        .collect();
    let diff:i32 = iterator.next().unwrap().unwrap().parse().unwrap();

    let mut result = 0;
    let mut output = String::new();
    for i in 0..cases {
        if values[i as usize] == diff {
            result += 1;
        }
    }

    write!(output, "{}", result).unwrap();
    println!("{}", output);
}
