// Illustration of multiple exception handling
class MultipleExceptionHandling {
    public static void main(String[] args) {
        int a = 4, b = 0;
        int[] arr = {4, 5, 6, 7};
        String[] s = {"Mango", "Orange", "Banana"};
        int c = 0;

        try {
            c = a / b;
            System.out.println(s[10]);
            System.out.println(arr[8]);
        }
        catch (ArithmeticException e1) {
            System.out.println("ArithmeticException caught:");
            e1.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("ArrayIndexOutOfBoundsException caught:");
            e2.printStackTrace();
        }
        finally {
            System.out.println("Memory is allocated");
            System.out.println("This block must be executed");
        }
        
        System.out.println("c = " + c);
        System.out.println("s[0] = " + s[0]);
        System.out.println("arr[2] = " + arr[2]);
    } // main
} // class
