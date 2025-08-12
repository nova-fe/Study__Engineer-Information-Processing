#include <stdio.h>

int main() {
  int sum = 0;
  int num = 0;

  while (num <= 5)
  {
    sum += num;
    num++;
  }
  
  printf("1부터 5까지의 합은 %d입니다.\n", sum); // ✅실행 => 1부터 5까지의 합은 15입니다. 출력
  return 0;
}