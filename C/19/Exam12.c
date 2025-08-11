#include <stdio.h>

int main() {
  int isEven = 1; // c는 true를 1로 표현
  printf("%d\n", isEven) ;  // 1 (true는 1로 출력됨)
  printf("%d\n", 2 > 1); // 1 (2 > 1은 true이므로 1로 출력됨)
  printf("%d\n", 8% 2 == 1); // 0 (8 % 2 == 1은 false이므로 0으로 출력됨)
  
  return 0;
}