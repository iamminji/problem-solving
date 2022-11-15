use std::io::{stdin, BufRead};

fn main() {
    let mut s = String::new();
    stdin().lock().read_line(&mut s).unwrap();
    let values: Vec<i64> = s
        .as_mut_str()
        .split_whitespace()
        .map(|s| s.parse().unwrap())
        .collect();

    println!("{}", (values[0] + values[1]) * (values[0] - values[1]));
}
