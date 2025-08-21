/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */

import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("이름을 입력하세요");
      String name = sc.next();

      System.out.println("나이를 입력하세요");
      int age = sc.nextInt();

      System.out.println("몸무게를 입력하세요");
      double weight = sc.nextDouble();

      System.out.println("싱글 여부를 입력하세요 (true/false)");
      boolean single = sc.nextBoolean();
      sc.nextLine(); // 엔터키를 읽고 버린다 

      System.out.println("주소를 입력하세요");
      String addr = sc.nextLine();

      System.out.printf("%d세인 %s는 몸무게가 %.2fkg이고 %s에 거주중이다.", age, name, weight, addr);
  }  
}
