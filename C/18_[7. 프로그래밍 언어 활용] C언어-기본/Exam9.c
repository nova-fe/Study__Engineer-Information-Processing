#include <stdint.h>

// 입력
// getchar(): 한 문자를 입력받음
// gets(): 문자열을 입력받음
// 출력
// putchar(): 인수로 주어진 한 문자를 화면에 출력
// puts(): 인수로 주어진 문자열을 화면에 출력 후, 커서를 다음줄 앞으로 이동

int main(){
  puts("문자를 입력하세요");
  char a = getchar(); // 문자열 한개를 입력
  putchar(a); // h (위에서 h를 입력했을 경우)
}