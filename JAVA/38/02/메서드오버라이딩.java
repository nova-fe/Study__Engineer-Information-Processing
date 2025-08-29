/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author DESKTOP
 */
class 매달 {
  int 월급 = 10000;
  int 수령액() {
    return this.월급;
  }
} 

class 명절있는달 extends 매달 {
  int 보너스 = 5000;
  
  @Override
  int 수령액() {
    return this.월급 + this.보너스;
  }
}

public class 메서드오버라이딩 {
  public static void main(String[] args) {
    명절있는달 추석 = new 명절있는달();
    System.out.printf("추석 월급: %d\n", 추석.수령액());  // 150000

    매달 삼월 = new 매달();
    System.out.printf("삼월 월급: %d\n", 삼월.수령액());  // 10000
  }
}
