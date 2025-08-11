#include <stdio.h>

// 비교 연산자
int main() {
  int a = 5;
  int b = 10;

  prinf("a > b: %d\n", a > b);  // a > b: 0 (false)
  prinf("a < b: %d\n", a < b);  // a < b: 1 (true)
  prinf("a >= b: %d\n", a >= b);  // a >= b: 0 (false)
  prinf("a <= b: %d\n", a <= b);  // a <= b: 1 (true)
  prinf("a == b: %d\n", a == b);  // a == b: 0 (false)
  prinf("a != b: %d\n", a != b);  // a != b: 1 (true)

  return 0;
}