#include <stdio.h>

int main() {
  int sum = 0;
  int num = 1;

  while (num <= 5)
  {
    if(num % 2 == 0) {
      sum += num;
    }
    num++;
  }
  
  printf("1부터 5까지 짝수의 합은 %d입니다.\n", sum); // ✅실행 => 1부터 5까지의 합은 6입니다. 출력
  return 0;
}