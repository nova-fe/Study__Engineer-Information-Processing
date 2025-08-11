#include <stdio.h>

// 시프트 연산자
int main() {
  int num = 5;

  printf("왼쪽으로 2비트 이동한 값: %d\n", num << 2); // 5 * 2^2 = 20
  printf("오른쪽으로 1비트 이동한 값: %d\n", num >> 1); // 5 / 2^1 = 2

  return 0;
}