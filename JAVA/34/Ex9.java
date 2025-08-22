/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */
public class Ex9 {
  // 메서드 오버로딩
  // : 매개변수의 개수나 타입이 다르면 같은 이름의 메서드를 여러 개 정의할 수 있다.
  static void display(int a) {
    System.out.println(a);
  }

  static void display(int a, int b) {
    System.out.println(a + ", " + b);
  }

  public static void main(String[] args) {
    display(1); // 1
    display(1, 4);  // 1, 4
  }
}
