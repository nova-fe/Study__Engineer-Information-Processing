#include <stdio.h>
#include <string.h>

typedef struct {
  int id;
  char name[20];
  double score;
} Student;

int main() {
  Student s[2];

  s[0].id = 111;
  strcpy(s[0].name, "철수");
  s[0].score = 4.3;

  s[1].id = 222;
  strcpy(s[1].name, "영희");
  s[1].score = 4.9;

  return 0;
}