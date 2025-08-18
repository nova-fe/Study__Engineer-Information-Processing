#include <stdio.h>

void increaseNumber() {
  // 1) static 지역변수 num1이 1로 초기화
  // 2) static 지역변수는 한번 초기화 되면 이후에 함수 호출 시 값의 초기화를 무시하기 때문에, 1로 초기화되지 않음
  static int num1 = 1;
  // 1) num1의 값 출력 // 1
  // 2) num1의 값 출력 // 2
  printf("%d\n", num1);
  // 1) num1의 값은 1이 증가하여 2가 됨
  // 2) num1의 값은 1이 증가하여 3이 됨
  num1++;
  // 1) 함수가 끝나고 num1은 메모리에 남아있음(2으로)
  // 2) 함수가 끝나고 num1은 메모리에 남아있음(3으로)
}

int main() {
  increaseNumber(); // 1
  increaseNumber(); // 2
  // printf("%d\n", num1); // 컴파일 에러 발생: num1은 main 함수의 지역변수이므로 접근할 수 없음
  return 0;
}