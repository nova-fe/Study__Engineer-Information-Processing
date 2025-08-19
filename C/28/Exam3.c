#include <stdio.h>
#include <string.h>

struct student {
  int id;
  char name[20];
  double score;
};

int main() {
  struct student s1;
  s1.id = 111;
  strcpy(s1.name, "철수");
  s1.score = 4.3;

  struct student s2;
  s2 = s1; // s2에 s1의 값을 복사 (초기화된 값도 함께 복사됨)
  return 0;
}