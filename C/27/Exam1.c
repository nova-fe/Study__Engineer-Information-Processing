#include <stdio.h>

int main() {
  {
    int what = 10;
  }
  // printf("%d\n", what); // Error!! 블록 안에서 선언된 변수는 블록 밖에서 접근할 수 없음

  return 0;
}