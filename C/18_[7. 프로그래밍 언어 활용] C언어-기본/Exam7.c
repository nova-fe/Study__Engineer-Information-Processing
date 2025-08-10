#include <stdio.h>

int main(){
  int number;
  printf("정수를 입력하세요");
  // scanf: 키보드로 입력받은 문자열에서 지정된 포맷으로 데이터를 읽는 함수
  // &: 주소를 기리킴
  scanf("%d", &number); // 입력을 받을 수 있음, number가 있는 주소에 가서 입력받은 값을 넣음
  printf("입력된 정수: %d/n", number);  // 입력된 정수: 9(scanf를 통해 입력한 값)
  return 0;
}