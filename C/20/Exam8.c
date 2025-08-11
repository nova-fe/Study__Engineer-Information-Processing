#include <stdio.h>

// 논리 연산자
int main() {
  int a = 5;
  int b = 10;
  int c = 3;

  printf("%d\n", (a < b) && (b < c)); // 0 (false)
  printf("%d\n", (a < b) || (b < c)); // 1 (true)
  printf("%d\n", !(a == b)); // 1 (true)
  return 0;
}