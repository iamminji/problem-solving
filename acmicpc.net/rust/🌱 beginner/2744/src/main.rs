use std::io::{stdin};

fn main() {
    let mut buf = String::new();
    stdin().read_line(&mut buf).unwrap();
    let value = buf.trim().parse::<String>().unwrap();

    for s in value.chars() {
        if s.is_lowercase() {
            print!("{}", s.to_uppercase());
        } else {
            print!("{}", s.to_lowercase());
        }
    }
}
