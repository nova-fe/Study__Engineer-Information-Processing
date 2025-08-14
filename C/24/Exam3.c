#include <stdio.h>

int main() {
  char str1[4] = "abc";
  char str2[4] = {'d', 'e', 'f'};

  printf("%c\n", str1[1]); // 'b' 출력
  printf("%c\n", str2[2]); // 'c' 출력

  printf("%s\n", str1); // 'abc' 출력
  printf("%s\n", str2); // 'def' 출력

  return 0;
}