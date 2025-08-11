#include <stdio.h>

// 증가 및 감소 연산자
int main() {
  int num = 5;
  printf("초기값: %d\n", num); // 초기값: 5

  printf("후위 증가: %d\n", num++); // 후위 증가: 5
  printf("전위 증가: %d\n", ++num); // 전위 증가: 7

  num = 5; // num을 다시 5로 초기화
  printf("후위 감소: %d\n", num--); // 후위 감소: 5
  printf("전위 감소: %d\n", --num); // 전위 감소: 3
  return 0;
}