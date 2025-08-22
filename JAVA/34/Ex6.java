/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */
public class Ex6 {
  static void passwordCheck(String password) {
    if ("1234".equals(password)) {
      return; // 비밀번호가 맞으면 메서드 종료
    }
    System.out.println("비밀번호가 틀렸습니다.");
  }

  public static void main(String[] args) {
    System.out.println("비밀번호를 입력하세요");
    passwordCheck("1234");
    System.out.println("비밀번호가 일치합니다.");
  }
}
