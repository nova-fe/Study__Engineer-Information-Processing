/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */
public class Ex2 {
  int price;

  public Ex2(int price) {
    // this: 만들어진 객체
    this.price = price;
  }

  public static void main(String[] args) {
    Ex2 myObj = new Ex2(1000);
    System.out.println(myObj.price);  // 1000
  }
}
