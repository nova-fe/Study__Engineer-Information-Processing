#include <stdio.h>
#include <string.h>

// 문자열 길이 구하기(strlen)
// strlen(문자열)을 사용하면 해당 문자열의 길이를 리턴

int main() {
  char hangul[] = "해커스"; // * 한글: 2바이트
  printf("%d\n", strlen(hangul)); // 출력: 6 (문자열의 길이, 한글이기때문에 )
  printf("%d\n", sizeof(hangul)); // 출력: 7 (문자열의 크기, 마지막에 NULL 문자 포함)

  return 0;
}