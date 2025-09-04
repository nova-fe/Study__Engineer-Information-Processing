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
  
  public class 다형성1 {
    public static void main(String[] args) {
        학생 a = new 스폰지밥();
        a.공부한다();  // 학생이 공부한다.
      // 학생.먹는다();  // Error! 학생 클래스에는 먹는다() 메서드가 없음
  }
}
