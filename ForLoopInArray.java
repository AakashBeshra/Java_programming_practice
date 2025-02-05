// Write a Java Program to initialize an array with the help of a for loop program 19
public class ForLoopInArray {
  public static void main(String[] args) {
    int[] arr = new int[5];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
    }

    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}