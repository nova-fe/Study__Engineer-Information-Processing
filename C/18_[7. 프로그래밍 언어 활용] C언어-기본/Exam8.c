#include <stdio.h>

int main(){
  int age;
  double weight;

  printf("나이를 입력하세요: ");
  scanf("%d", &age);

  printf("몸무게를 입력하세요: ");
  scanf("%lf", &weight);

  print("%d세인 김땡땡님은 몸무게가 %.2fkg입니다.\n", age, weight);

  return 0;
}