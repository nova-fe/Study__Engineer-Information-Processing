#include <stdio.h>

int main() {
  int array[3] = {1,2,3};
  int *p = array;

  // &array[0] // 첫번째 주소
  // *p // 첫번째 주소의 값(array[0])
  // &arrap[1]  // 두번째 주소
  // *(p + 1) // 두번째 주소의 값(array[1])
  // &array[2] // 세번째 주소
  // *(p + 2) // 세번째 주소의 값(array[2])

  return 0;
}