#include <stdio.h>

int main() {
  char str1[2][8] = {"Hello", "Hackers"};
  
  printf("%s\n", str1[0]);  // Hello
  printf("%s\n", str1[1]);  // Hackers
  printf("%s\n", str1 + 1); // Hello  => 1층으로 이동
  printf("%s\n", str1[1]+ 2); // ckers => 1층에서 2칸 오른쪽으로 이동
  printf("%s\n", str1[0] + 2);  // llo => 0층에서 2칸 오른쪽으로 이동
}