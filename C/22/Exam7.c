#include <stdio.h>

int main() {
  int sum = 0;

  for (int num = 1; num <= 5; num++) {
    sum += num;
  }

  printf("1부터 5까지의 합은 %d입니다.\n", sum);
  return 0;
}