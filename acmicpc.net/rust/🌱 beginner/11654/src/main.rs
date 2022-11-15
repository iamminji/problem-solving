use std::io::{self, BufRead};


fn main() {
    let stdin = io::stdin();
    let mut iterator = stdin.lock().lines();
    let c: Vec<char> = iterator.next()
        .unwrap()
        .unwrap()
        .chars().collect();
    println!("{}", c[0] as i32);
}
