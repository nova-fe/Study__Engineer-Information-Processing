/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */
class 가구 {
  public void whatIsIt() {
    System.out.println("저는 가구입니다");
  }
}

class 책상 extends 가구 {
  @Override // 부모 메서드 재정의
  public void whatIsIt() {
    System.out.println("저는 책상이에요");
  }

  public void whatIsIt부모() {
    super.whatIsIt(); // 부모 메서드 호출 (super 키워드 사용) 
  }
}
public class 부모메서드호출 {
  public static void main(String[] args) {
      책상 desk = new 책상();
      desk.whatIsIt();
      desk.whatIsIt부모();

      // 출력: 
      // 저는 책상이에요
      // 저는 가구입니다
  }
}
