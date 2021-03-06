package puzzles;

import java.util.Scanner;

public class AppleAndOrange {

  static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

    int larry = 0, rob = 0;
    for (int apple : apples) {
      if ((a + apple) >= s && (a + apple) <= t) {
        larry++;
      }
    }
    for (int orange : oranges) {
      if ((b + orange) >= s && (b + orange) <= t) {
        rob++;
      }
    }
    System.out.println(larry + "\n" + rob);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int s = in.nextInt();
    int t = in.nextInt();
    int a = in.nextInt();
    int b = in.nextInt();
    int m = in.nextInt();
    int n = in.nextInt();
    int[] apple = new int[m];
    for (int apple_i = 0; apple_i < m; apple_i++) {
      apple[apple_i] = in.nextInt();
    }
    int[] orange = new int[n];
    for (int orange_i = 0; orange_i < n; orange_i++) {
      orange[orange_i] = in.nextInt();
    }
    countApplesAndOranges(s, t, a, b, apple, orange);
    in.close();
  }

}
