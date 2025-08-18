#include <stdio.h>
#include <string.h>

// 문자열 복사하기(strcpy)
// strcpy(대상문자열, 원본문자열) 문자열은 다른 배열이나 포인터(메모리)로 복사

int main() {
  char s1[10] = "Hello";
  char s2[10];
  
  strcpy(s2, s1); // s1의 내용을 s2로 복사
  s2[0] = 'A';

  printf("%s\n", s1); // Hello
  printf("%s", s2); // Aello

  return 0;
}