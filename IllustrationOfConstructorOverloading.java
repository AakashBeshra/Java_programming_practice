// Write a Java Program for illustration of Constructor Overloading Program 21

class IllustrationOfConstructorOverloading
{
    IllustrationOfConstructorOverloading()
    {
        System.out.println("This is the default constructor");
    }
    IllustrationOfConstructorOverloading(int a)
    {
        System.out.println("This is the one parameter constructor");
    }
    IllustrationOfConstructorOverloading(int a, int b)
    {
        System.out.println("This is the two parameter constructor");
    }
    IllustrationOfConstructorOverloading(int a, int b, int c)
    {
        System.out.println("This is the three parameter constructor");
    }
    IllustrationOfConstructorOverloading(int a, int b, int c, int d)
    {
        System.out.println("This is the four parameter constructor");
    }
    public static void main(String[] args)
    {
        IllustrationOfConstructorOverloading obj = new IllustrationOfConstructorOverloading();
        IllustrationOfConstructorOverloading obj1 = new IllustrationOfConstructorOverloading(10);
        IllustrationOfConstructorOverloading obj2 = new IllustrationOfConstructorOverloading(10,20);
        IllustrationOfConstructorOverloading obj3 = new IllustrationOfConstructorOverloading(10,20,30);
        IllustrationOfConstructorOverloading obj4 = new IllustrationOfConstructorOverloading(10,20,30,40);
    }
}


// Output:
// This is the default constructor
// This is the one parameter constructor
// This is the two parameter constructor
// This is the three parameter constructor
// This is the four parameter constructor
