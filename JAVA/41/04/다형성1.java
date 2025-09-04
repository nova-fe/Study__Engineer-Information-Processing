/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */
class 학생 {
  public void 공부한다() {
    System.out.println("학생이 공부한다.");
  }
}
class 스폰지밥 extends 학생 {
  void 먹는다() {
    System.out.println("스폰지갑이 먹는다.");
  }
}
class 뚱이 extends 학생 {
  void 아르바이트한다() {
    System.out.println("뚱이가 아르바이트한다.");
  }
}
public class 다형성1 {
  static void 뭐하니(학생 c) {
    c.공부한다();
  }

  public static void main(String[] args) {
    학생 a = new 스폰지밥();
    학생 b = new 뚱이();
    뭐하니(a);  // 학생이 공부한다.
    뭐하니(b);  // 학생이 공부한다.
  }
}
