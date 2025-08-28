/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */
public class static_vs_nonstatic {
  // static
  static void myStaticMethod() {
    System.out.println("부르면 바로 나오는 함수 호출");
  }

  // non-static
  void myNonStaticMethod() {
    System.out.println("객체를 만들고 불러주세요");
  }

  public static void main(String[] args) {
    myStaticMethod(); // static 메서드는 객체 생성 없이 바로 호출 가능

    // myNonStaticMethod(); // Error: non-static 메서드는 객체 생성 후에 호출 가능
    static_vs_nonstatic myObj = new static_vs_nonstatic(); // 객체 생성
    myObj.myNonStaticMethod(); // non-static 메서드 호출
  }
} 
