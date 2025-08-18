#include <stdio.h>
#include <string.h>

// 문자열 연결하기(strcat)
// strcat(문자열1, 문자열2)
// 문자열1에 문자열2를 뒷부분에 복사하여 연결

int main() {
  char s1[11] = "Hello";
  char s2[6] = "World";
  strcat(s1, s2);
  printf("%s", s1); // HelloWorld
  return 0;
}