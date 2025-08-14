#include <stdio.h>

int main() {
  int array[3] = { 10 };

  for (int i = 0; i < 3; i++)
    printf("%d ", array[i]); // 10 0 0 출력
    // 10 0 0 으로 출력되는 이유:
    // array[0]은 위에서 10으로 초기화되었고, 나머지 요소는 초기화되지 않아 자동으로 '0'이 들어감
  return 0;
}