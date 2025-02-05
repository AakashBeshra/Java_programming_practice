// Java Program for Illustration of Static Variables and Functions Program 12
public class IllustrationOfStaticVariablesAndFunctions {
    static int count = 0;  // Initialize the static variable

    // Constructor for the Counter class
    IllustrationOfStaticVariablesAndFunctions() {
        count++;
        System.out.println(count);
    }

    // Static method to get the current count
    static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        IllustrationOfStaticVariablesAndFunctions ob1 = new IllustrationOfStaticVariablesAndFunctions();
        IllustrationOfStaticVariablesAndFunctions ob2 = new IllustrationOfStaticVariablesAndFunctions();
        IllustrationOfStaticVariablesAndFunctions ob3 = new IllustrationOfStaticVariablesAndFunctions();

        System.out.println(ob1.getCount());
        System.out.println(ob2.getCount());
        System.out.println(ob3.getCount());
    }
}
