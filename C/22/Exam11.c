#include <stdio.h>

// 2중 for문
int main() {
  // [1] 첫 for문 시작
  // [4] 다음 for문 시작
  for(int i = 0; i < 3; i++)
  {
    // [2] 이 for 문이 다 끝난 후
    for (int j = 0; j < 3; j++)\
    {
      printf("* ");
    }
    // [3] 이 \n 을 끊고
    printf("\n");
  }
  return 0;
}