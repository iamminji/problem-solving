# 기본 입출력

## 입력
### 한 줄 입력

#### read_line 사용
```rust
fn main() {
    let mut buf = String::new();
    stdin().read_line(&mut buf).unwrap();
    // 숫자 입력
    let value = buf.trim().parse::<i32>().unwrap();   
}
```

#### iterator 사용
```rust
use std::io::{BufRead, stdin};

fn main() {
    let stdin = stdin();
    let mut iterator = stdin.lock().lines();

    let value: i32 = iterator
        .next()
        .unwrap()
        .map(|s| s.parse().unwrap())
        .unwrap();
}
```

### 여러 줄 입력