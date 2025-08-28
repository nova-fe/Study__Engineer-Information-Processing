/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */
public class 붕어빵 {
  // 오버라이딩 전용 메서드 toString()
  @Override
  public String toString() {
    return "기본은 슈크림";
  }

  public static void main(String[] args) {
      붕어빵 붕어 = new 붕어빵();
      System.out.println(붕어);  // toString()이 자동 호출됨("기본은 슈크림" 출력)
  }
}
