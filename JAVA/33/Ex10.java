/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DESKTOP
 */
public class Ex10 {
  public static void main(String[] args) {
    int[][] Data = {{1,2,3}, {4,5}, {6}, {8,9,10,11}};
    for (int y = 0; y < Data.length; y++) {
      for (int x = 0; x < Data[y].length; x++) {
        System.out.printf("%d ", Data[y][x]);
      }
      System.out.println();  // 줄바꿈
    }
    
    // 출력값
    /**
     * 
        1 2 3 
        4 5
        6
        8 9 10 11
     */
  }
}
