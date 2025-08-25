/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */
class 붕어빵틀 {
  String 속;
  public 붕어빵틀(String inside) {
    this.속 = inside;
    System.out.println("이 붕어빵에는 " + 속 + "이 들어갑니다.");
  }
} 

public class Ex5 {
  public static void main(String[] args) {
      붕어빵틀 붕어빵1 = new 붕어빵틀("슈크림");  // 이 붕어빵에는 슈크림이 들어갑니다.
      붕어빵틀 붕어빵2 = new 붕어빵틀("팥");  // 이 붕어빵에는 팥이 들어갑니다.
  }
}
