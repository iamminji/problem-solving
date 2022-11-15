use std::io::{BufRead, stdin};
use std::fmt::Write;

fn main() {
    let stdin = stdin();
    let mut iterator = stdin.lock().lines();

    let values: Vec<i64> = iterator
        .next()
        .unwrap()
        .unwrap()
        .split_whitespace()
        .map(|s| s.parse().unwrap())
        .collect();

    let mut output = String::new();
    write!(output, "{}", values[0] + values[1] + values[2]).unwrap();
    println!("{}", output);
}
