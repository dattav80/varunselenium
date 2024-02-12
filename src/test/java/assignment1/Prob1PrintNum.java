package assignment1;

/**
 * @author Sowmya
 * 1. Write a short program that prints each number from 1 to 100 on a new line.
 */
public class Prob1PrintNum {
    public static void main(String[] args) {
        int i;
        for (i = 0; i <= 100; i++) {
            if (i % 3 == 0 & i % 5 == 0)
                System.out.println("FizzBuzz");//For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
            else {
                if (i % 3 == 0)
                    System.out.println("FIZZ");//For each multiple of 3, print "Fizz" instead of the number.
                else {
                    if (i % 5 == 0)
                        System.out.println(("BUZZ"));//For each multiple of 5, print "Buzz" instead of the number.
                    else
                        System.out.println(i);
                }


            }

        }
    }
}
