use std::io::{BufRead, stdin};
use std::fmt::Write;

fn main() {
    let stdin = stdin();
    let mut iterator = stdin.lock().lines();

    let cases: Vec<i32> = iterator
        .next()
        .unwrap()
        .unwrap()
        .as_mut_str()
        .split_whitespace()
        .map(|s| s.parse().unwrap())
        .collect();

    let values: Vec<i32> = iterator
        .next()
        .unwrap()
        .unwrap()
        .as_mut_str()
        .split_whitespace()
        .map(|s| s.parse().unwrap())
        .collect();

    let mut output = String::new();
    for i in 0..cases[0] {
        if values[i as usize]  < cases[1] {
            write!(output, "{} ", values[i as usize]).unwrap();
        }
    }
    println!("{}", output);
}