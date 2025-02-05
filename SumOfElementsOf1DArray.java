// Java Program for addition of elements in the array Program 14
public class SumOfElementsOf1DArray {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all elements of an array: " + sum);
    }
}
