use std::io::{stdin};

fn main() {
    let mut buf = String::new();
    stdin().read_line(&mut buf).unwrap();

    let value = buf.trim().parse::<i32>().unwrap();

    let result = match value {
        x  if x % 4 == 0 && x % 100 != 0 => 1,
        x if x % 4 == 0 && x % 400 == 0 => 1,
        _ => 0,
    };

    println!("{}", result);
}
