#include <stdio.h>

int main() {
  int a = 2147483648; // int의 최대값을 넘어가는 숫자
  long long b = 2147483648; // long long은 int의 최대값을 넘어가는 숫자를 저장할 수 있음
  printf("a: %d\n", a); // a: -2147483648 (int의 범위를 넘어가면 음수로 출력됨)
  printf("b: %lld\n", b); // b: 2147483648 (long long은 정상적으로 출력됨)
  return 0;
}