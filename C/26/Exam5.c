#include <stdio.h>
#include <string.h>

// 문자열 뒤집기(strrev)
// strrev(문자열) 문자열을 거꾸로 뒤집는 함수

int main() {
  char s1[6] = "Hello";
  strrev(s1); // s1을 거꾸로 뒤집음
  printf("%s", s1); // olleH
  return 0;
}