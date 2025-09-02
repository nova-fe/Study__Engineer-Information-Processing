/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */
final class where {
  final String hereIam;
  where() {
    hereIam = "정보처리기사";
  }
}

// class now extends where {} // Error!! final 클래스는 상속 불가능

public class Hackers {
  public static void main(String[] args) {
    where w = new where();
    System.out.println(w.hereIam);  // 정보처리기사
  }
}
