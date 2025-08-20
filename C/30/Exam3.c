#include <stdio.h>

int main() {
  int array[3]  = {1, 2, 3};
  int *p = array;

  printf("%d\n", *p++); // 1 // 후위 연산자 => *p를 먼저 출력한 뒤에, p를 다음 주소로 이동(++)
  printf("%d\n", *p++); // 2
  printf("%d\n", *p); // 3

  p = array; // p를 다시 array의 첫번째 주소로 초기화

  return 0;
}