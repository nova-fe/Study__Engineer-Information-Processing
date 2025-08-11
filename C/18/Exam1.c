// 전처리기(preprocessor)
// #으로 시작
// #include: 특정 프로그램 파일을 현재 위치에 첨부하여 하나의 파일처럼 컴파일
// #define: 특정 숫자, 함수, 프로그램 블록을 다른 형태로 변환 지정
#include <stdio.h>

void main()
{
  // printf: 여기서 f는 포맷. 즉, 서식 있는 출력
  printf("해커스 정보처리기사");  // 해커스 정보처리기사
  
  char what = 'a';  // char(1byte) 문자 1개(따옴표 1개)
  printf("%c", what); // a (%c: 단일문자)

  int num = 5;  // int(4byte) 십진 정수
  printf("%d", num);  // 5 (%d: 십진 정수)

  float score = 4.3; // float(4byte) 부동 소수점 숫자
  printf("%f", score);  // 4.300000 (%f: 부동 소수점 숫자)
  printf("%.2f", score); // 4.30

  char where[10] = "Hackers"; // 변수명[10] [배열 크이긔 갯수만큼 입력(글자갯수+1) 이유: 마지막에 \n이 들어감]
  printf("%s", where);  // Hackers (%s: 문자열)

  return;
}