#include <stdio.h>

int main() {
  int score = 80;
  // 만약 break가 없다면
  switch (score / 10) {
    case 9:
      printf("A등급입니다.\n");
    case 8:
      printf("B등급입니다.\n"); // ✅실행 => B등급입니다. 출력
    // ********** break가 없어서 아래 case들이 전부 실행됨 **********
    case 7:
      printf("C등급입니다.\n"); // ✅실행 => C등급입니다. 출력 (break가 없어서 계속 실행됨)
    case 6:
      printf("D등급입니다.\n"); // ✅실행 => D등급입니다. 출력 (break가 없어서 계속 실행됨)
    default:
      printf("F등급입니다.\n"); // ✅실행 => F등급입니다. 출력 (break가 없어서 계속 실행됨)
  }
  return 0;
}