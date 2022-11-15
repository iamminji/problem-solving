use std::io::{BufRead, stdin};


fn main() {
    let stdin = stdin();
    let mut iterator = stdin.lock().lines();

    let value: i32 = iterator
        .next()
        .unwrap()
        .map(|s| s.parse().unwrap())
        .unwrap();

    if value >= 90 {
        println!("A");
    } else if value >= 80 {
        println!("B");
    } else if value >= 70 {
        println!("C");
    } else if value >= 60 {
        println!("D");
    } else {
        println!("F");
    }
}
