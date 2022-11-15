use std::collections::HashSet;
use std::io::{BufRead, stdin};
use std::fmt::Write;

fn main() {
    let stdin = stdin();
    let mut iterator = stdin.lock().lines();

    let mut students: HashSet<i32> = (1..31).collect();

    for _i in 0..28 {
        let value: i32 = iterator.next().unwrap().unwrap().parse().unwrap();
        students.remove(&value);
    }
    let mut output = String::new();

    let mut vector = Vec::new();
    for v in students.iter() {
        vector.push(v);
    }

    vector.sort();
    write!(output, "{}\n{}", vector[0], vector[1]).unwrap();
    println!("{}", output);
}
