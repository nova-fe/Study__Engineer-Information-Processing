/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */
public class BungeoBBangTl2 {
  final int price = 1000; // final이 붙으면 상수가 됨, 즉 변경 불가
  
  public static void main(String[] args) {
    BungeoBBangTl2 Bungeo1 = new BungeoBBangTl2();  // BungeoBBangT2의 주소값을 Bungeo1에 저장
    // Bungeo1.price = 2000;  // Error!! final이 붙은 변수는 변경 불가
    System.out.println(Bungeo1.price); // 2000
  }
}
