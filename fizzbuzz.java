
/**
 * Write a description of class fizzbuzz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class fizzbuzz 
{
    public static void main(String args[]) {
        int fizz = 0;
        int buzz = 0;
        for (int a = 1; a <=100; a++) {
            fizz++;
            buzz++;
            if (fizz == 3 && buzz == 5) {
                System.out.println("FizzBuzz");
                fizz = 0;
                buzz = 0;
            } 
            else if (fizz == 3) {
                System.out.println("Fizz");
                fizz = 0;
            }
            else if (buzz == 5) {
                System.out.println("Buzz");
                buzz = 0;
            }
            else {
                System.out.println(a);
            }
        }
    }
}