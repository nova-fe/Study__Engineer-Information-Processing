#include <stdio.h>

void swap(int a, int b) {
  int temp; // a 값을 저장해두기 위한 임시 변수
  temp = a;
  a = b;
  b = temp;
  // 스왑에 성공했지만 정작 x와 y를 바뀌지 않았음 => 이런 이유 때문에 포인터를 사용
}

int main() {
  int x = 5;
  int y = 3;
  printf("x = %d, y = %d\n", x, y); // 5, 3
  swap(x, y);
  printf("x = %d, y = %d\n", x, y); // 5, 3 ❌값이 안 바뀜

  return 0;
}