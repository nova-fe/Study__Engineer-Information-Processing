/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */
public class final예제 {
  // final 인자: 읽을 수 있지만 변경은 불가능
  static void printThis(final int number) {
    System.out.println(number);
    // number = 333; // Error!! final 인자는 변경 불가능
  }

  public static void main(String[] args) {
    int 학번 = 999;
    printThis(학번);
    학번 = 111; // 학변 변수는 final로 선언하지 않았으므로 변경 가능
    printThis(학번);
  }
}
