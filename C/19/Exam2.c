#include <stdio.h>

int main() {
  printf("%d\n", 1 + 2);  // 3
  printf("%.1f\n", 2.5 + 3.2); // 5.7 (1f: 소수점 이하 1자리까지 출력)
  printf("%c\n", '12'); // '1' (c: 1개의 글자만 출력)
  printf("%s\n", "12"); // "12" (s: 문자열 출력)
  return 0;
}