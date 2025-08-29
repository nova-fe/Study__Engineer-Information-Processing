/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */

class 부모 {
  int age = 50;
}

class 자식 extends 부모 {
  // 오버라이딩
  int age = 25;

  void howOldRu() {
    System.out.println(age);  // 25
    System.out.println(this.age); // 25
    System.out.println(super.age);  // 50(super는 부모의 주소를 가리킴)
  }
}
public class 예제1 {
  public static void main(String[] args) {
    자식 child = new 자식();
    child.howOldRu();
  } 
}
