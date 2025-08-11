#include <stdio.h>

int main() {
  int a = -3;

  if(a > 0) {
    printf("a는 양수입니다.");
  } else if(a == 0) {
    printf("a는 0입니다.");
  } else {
    printf("a는 음수입니다."); // ✅실행 => a는 음수입니다. 출력
  }

  return 0;
}