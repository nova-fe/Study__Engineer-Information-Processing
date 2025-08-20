#include <stdio.h>

int main() {
  char array[3] = {'a', 'b', 'c'};
  char *p = array;

  printf("%c\n", *p); // a
  printf("%c\n", *(p + 1)); // b
  printf("%c\n", *(p + 2)); // c

  for (int i = 0; i < 3; i++) {
    printf("%c", *(array + i)); // a b c
  }

  return 0;
}