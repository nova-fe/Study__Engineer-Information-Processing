// 전처리기(preprocessor)
// #으로 시작
// #include: 특정 프로그램 파일을 현재 위치에 첨부하여 하나의 파일처럼 컴파일
// #define: 특정 숫자, 함수, 프로그램 블록을 다른 형태로 변환 지정
#include <stdio.h>
#define num 2

int main() {
  printf("예제 %d번\n", num); // 예제 2번
  // \n: 개행문자

  return 0;
}