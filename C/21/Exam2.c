#include <stdio.h>

int main() {
  int a = 0;

  if(a > 0) {
    printf("a는 양수입니다.");
  } else if(a == 0) {
    printf("a는 0입니다."); // ✅실행 => a는 0입니다. 출력
  } else {
    printf("a는 음수입니다.");
  }

  return 0;
}