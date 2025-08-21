/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */
public class Ex7 {
  public static void main(String[] args) {
    int[][] Data = {{1,2,3}, {4,5,6}};

    for (int y = 0; y < 2; y++) {
      for (int x = 0; x < 3; x++) {
        System.out.printf("%d", Data[y][x]);
      }
      System.out.println();  // 줄바꿈
    }

    // 실행값
    // 123
    // 456
  }
}
