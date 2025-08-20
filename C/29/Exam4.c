#include <stdio.h>

void swap(int *a, int *b) {
  int temp; // a 값을 저장해두기 위한 임시 변수
  temp = *a;  // 포인터를 통해 a주소의 값을 가져옴
  *a = *b;  // 포인터를 통해 b주소의 값을 'a주소의 값'에 저장 => a는 x이므로 x의 값이 바뀜
  *b = temp;  // temp에 저장된 a주소의 값을 'b주소의 값'에 저장 => b는 y이므로 y의 값이 바뀜
}

int main() {
  int x = 5;
  int y = 3;
  printf("x = %d, y = %d\n", x, y); // 5, 3
  swap(&x, &y); // x와 y의 '주소'를 넘김
  printf("x = %d, y = %d\n", x, y); // 3, 5
  return 0;
}