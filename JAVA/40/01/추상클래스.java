/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */
abstract class 부모추상클래스 {
  int x = 3, y = 5;
  public void 보통메서드() {
    System.out.println("보통메서드 입니다.");
  }
  public abstract void 추상메서드();
}

class 자식 extends 부모추상클래스 {
  @Override
  public void 추상메서드() {
    System.out.println("추상메서드라 상속후 오버라이드 했어요.");
  }
}

public class 추상클래스 {
  public static void main(String[] args) {
    자식 child = new 자식();
    System.out.printf("%d %d \n", child.x, child.y);
    child.보통메서드();
    child.추상메서드();

    // 출력: 
    // 3 5 
    // 보통메서드 입니다.
    // 추상메서드라 상속후 오버라이드 했어요.
  }
}
