#include <stdio.h>

int main() {
  int array[3] = {1, 2, 3};
  int *p = array;
  printf("%p\n", p);  // array의 주소(첫번째 주소)
  printf("%p\n", *p); // 1
  printf("%p\n", *(p + 1)); // 2
  printf("%p\n", *(p + 2)); // 3

  for (int i = 0; i < 3; i++) {
    printf("%d", *(array + i)); // 1 2 3
  }
  return 0;
}