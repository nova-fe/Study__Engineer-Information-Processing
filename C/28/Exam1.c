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

  printf("%d\n", s1.id);  // 111
  printf("%s\n", s1.name); // 철수
  printf("%.1f\n", s1.score); // 4.3
  return 0;
}