#include <stdio.h>

int main() {
  int array[2][3] = {{1,4,2}, {3,6,8}}; // 2행 3열의 다차원 배열 선언 및 초기화

  for(int i = 0; i < 3; i++) {
    printf("%d", array[0][i]); 
    // 출력값: 1 4 2
  }

  return 0;
}