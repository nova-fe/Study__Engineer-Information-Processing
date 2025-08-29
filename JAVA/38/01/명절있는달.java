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
}
public class 명절있는달 extends 매달 {
  int 보너스 = 5000;
  
  public static void main(String[] args) {
    명절있는달 추석 = new 명절있는달();
    System.out.println(추석.월급);  // 10000
    System.out.println(추석.보너스);  // 5000

    매달 삼월 = new 매달();
    System.out.println(삼월.월급);  // 10000
    // System.out.println(삼월.보너스);  // 오류
  }
}
