#include <stdio.h>

int main() {
  char input = 'B';
  switch (input) {
    case 'A':
      printf("input의 값은 A입니다.");
      break;
    case 'B':
      printf("input의 값은 B입니다."); // ✅실행 => input의 값은 B입니다. 출력
      break;
    default:
      printf("input의 값은 A도 B도 아닙니다.");
      break;
  }

  return 0;
}