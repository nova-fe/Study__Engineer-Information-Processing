// 전처리기(preprocessor)
// #으로 시작
// #include: 특정 프로그램 파일을 현재 위치에 첨부하여 하나의 파일처럼 컴파일
// #define: 특정 숫자, 함수, 프로그램 블록을 다른 형태로 변환 지정
#include <stdio.h>
// 두 수를 더하는 매크로 정의
#define ADD(a,b)(a+b)

int main() {
  int num1 = 5;
  int num2 = 3;
  int result = ADD(num1, num2);
  printf("두 수의 합은: %d\n", result); // 두 수의 합은: 8
  return 0;
}