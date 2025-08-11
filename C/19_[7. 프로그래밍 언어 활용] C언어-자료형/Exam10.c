#include <stdio.h>

int main() {
  int a = 3.3; // ERROR
  double b = 3.3;
  float c = 2.2F;
  printf("b: %lf\n", b); // b: 3.300000 (double은 %lf로 출력)
  printf("c: %f\n", c); // c: 2.200000 (float은 %f로 출력)
  printf("c: %.2f\n", c); // c: 2.20 (소수점 이하 2자리까지 출력)

  return 0;
}