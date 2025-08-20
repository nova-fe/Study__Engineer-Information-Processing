#include <stdio.h>

int main() {
  // &: 포인터
  // int *p : 포인터 변수
  // p = &a; // 변수 a의 주소를 p에 저장
  // *p : 주소에 있는 '값'을 가져다줌

  int a = 5;
  printf("a = %d\n", a);
  printf("a 주소: %p", &a); // 변수 a의 주소를 출력

  // a = 5
  // &a = 주소

  return 0;
}