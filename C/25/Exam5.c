#include <stdio.h>
void myFunction(int myNumbers[]) {
  myNumbers[2] = 99;
}

int main() {
  int Data[5] = {10, 20, 30, 40, 50};
  myFunction(Data);
  for (int i = 0; i < 5; i++) {
    printf("%d\n", Data[i]);
    // 출력: 10 20 99 40 50
    // Data[2]의 값이 99로 변경됨(같은 주소를 가리키고 있기 때문에, myFunction에서 변경 됐을 때 같이 변경됨)
  }
  return 0;
}