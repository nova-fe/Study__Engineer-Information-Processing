#include <stdio.h>

int main() {
  int array[2][3] = {{1,4,2}, {3,6,8}}; // 2행 3열의 다차원 배열 선언 및 초기화

  for (int y = 0; y <2; y ++) {
    for(int x = 0; x < 3; x++) {
      printf("%d", array[y][x]); 
      // 출력값: 
      // 1 4 2 
      // 3 6 8
    }
    printf("\n");
  }


  return 0;
}