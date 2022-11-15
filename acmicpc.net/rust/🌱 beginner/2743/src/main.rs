use std::io::{stdin, BufRead};

fn main() {
    let stdin = stdin();
    let mut iterator = stdin.lock().lines();
    let str = iterator
        .next()
        .unwrap()
        .unwrap();

    println!("{}", str.chars().count());
}
