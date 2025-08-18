#include <stdio.h>
#include <string.h>

// 문자열 비교하기(strcmp)
// strcmp(문자열1, 문자열2)
// 문자열1이 문자열2보다 사전순서로 뒤에 있으면 1, 같으면 0, 앞에 있으면 -1을 리턴

int main() {
  char s1[10] = "AAB";
  char s2[10] = "AAA";
  strcmp(s1, s2); // s1이 s2보다 사전순서로 뒤에 있으므로 1을 리턴

  char s3[10] = "AAA";
  char s4[10] = "AAA";
  strcmp(s3, s4);4; // s3과 s4가 같으므로 0을 리턴

  char s5[10] = "AAA";
  char s6[10] = "AAB";
  strcmp(s5, s6); // s5가 s6보다 사전순ㅅ로 앞에 있으므로 -1을 리턴

  return 0;
}