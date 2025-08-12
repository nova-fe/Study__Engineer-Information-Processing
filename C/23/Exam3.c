#include <stdio.h>

int main() {
  // 0번째 반복 완료
  // 1번째 반복 완료
  // 2번째 반복 완료
  for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
      // 0: 0 이 출력됨 \개행
      // 0: 1 이 출력됨 => break를 만나서 for문이 종료됨
      // 1: 0 이 출력됨 \개행
      // 1: 1 이 출력됨 => break를 만나서 for문이 종료됨
      // 2: 0 이 출력됨 \개행
      // 2: 1 이 출력됨 => break를 만나서 for문이 종료됨      
      printf("%d", j);
      if(j == 1) {
        break;
      }
    }
    // for문이 종료되면서 일단 \개행
    printf("\n");
  }

  return 0;
}

// ✅ 실행 결과
// 01
// 01
// 01