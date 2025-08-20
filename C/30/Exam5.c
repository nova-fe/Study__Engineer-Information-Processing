#include <stdio.h>

struct Point {
  int x;
  int y;
};

int main() {
    struct Point loc[2] = {{3, 5}, {-2, 7}};
    struct Point *p;
    p = loc; // loc 배열의 첫 번째 요소를 가리킴

    // p가 가리키는 첫 번째 요소의 x, y 값 출력, -> 로 구조체 멤버 접근
    // p에 가서 x를 찍어봐, p에 가서 y를 찍어봐
    printf("Point1: x=%d, y=%d\n", p -> x, p -> y); // Point1: x=3, y=5

    p++; // 포인터 이동

    printf("Point2: x=%d, y=%d\n", p -> x, p -> y); // Point2: x=-2, y=7

  return 0;
}