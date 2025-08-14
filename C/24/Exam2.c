#include <stdio.h>

int main() {
  char myString[4] = {'a', 'b', 'c'};

  printf("%c\n", myString[1]); // 'b' 출력
  printf("%s\n", myString); // 'abc' 출력
  printf("%s\n", myString + 1); // 'bc' 출력 => 이유: 문자열의 시작 '주소를 1칸 뒤로 옮겨서' 출력
  // %s: 문자열을 출력할 때 사용(딜리미터(null)까지 출력해라)

  return 0;
}