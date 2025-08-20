#include <stdio.h>

int main() {
  // &: 포인터
  // int *p : 포인터 변수
  // p = &a; // 변수 a의 주소를 p에 저장
  // *p : 주소에 있는 '값'을 가져다줌

  int a = 5;
  printf("&a = %p\n", &a);  // 주소값
  
  int *p;
  p = &a;
  printf("p = %p\n", p);  // 주소값
  printf("*p = %d\n", *p);  // 주소값의 '값' (5)

  
  return 0;
}