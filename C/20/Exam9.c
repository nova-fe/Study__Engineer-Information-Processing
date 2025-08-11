#include <stdio.h>

// 삼항연산자
int main() {
  int a = 5;
  int b = 10;
  int max;

  max = (a > b) ? a : b;
  printf("%d\n", max); // 10

  return 0;
}