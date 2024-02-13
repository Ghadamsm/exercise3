import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


//        1.Write a program that prints the numbers from 1 to 100 such that:
//  If the number is a multiple of 3, you need to print "Fizz" instead of that number.
//  If the number is a multiple of 5, you need to print "Buzz" instead of that number.
//  If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.



//        for (int i = 1; i <= 100 ; i++) {
//
//
//            if (i%3==0){
//
//                 if ((i%3==0)&&(i%5==0)){
//
//                    System.out.println("FizzBuzz");
//                   }
//                 else {
//                    System.out.println("Fizz");
//                   }
//
//            }
//            else if (i%5==0) {
//                System.out.println("Buzz");
//            }
//            else {
//                System.out.println(i);
//            }
//
//        }










//        2.Write a Java program to reverse a string.
//  Test Data: Input a string: The quick brown fox Expected Output: Reverse string: xof nworb kciuq ehT



//        System.out.println("Input a string : ");
//        String word = s.nextLine();
//
//        StringBuilder rev = new StringBuilder(word);
//
//        rev.reverse();
//        String reversed = rev.toString();
//
//        System.out.println("Reverse string : " + reversed );










//        3.Write a program to find the factorial value of any number entered through the keyboard.




//           System.out.println("enter a number : ");
//           int num = s.nextInt();
//           int total = 1 ;
//
//
//        for (int i = 1; i <= num; i++) {
//              total  *= i ;
//                System.out.println(total);
//        }










//        4.Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another.



//        System.out.println("enter tow number : " );
//        int num1 = s.nextInt();
//        int num2 = s.nextInt();
//        int result =1 ;
//
//        for (int i = 1; i <= num2 ; i++) {
//            result *= num1 ;
//
//        }
//        System.out.println("the result is : " + result);










//        5.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.



//        System.out.println("enter a set of numbers or -1 to quit " );
//        int num = s.nextInt();
//        int evens = 0 ;
//        int odds = 0 ;
//
//
//        while (num != -1){
//
//            if (num % 2 == 0){
//                evens += num ;
//
//
//            }else {
//                odds += num ;
//
//            }
//
//            num = s.nextInt();
//
//        }
//        System.out.println("sum of the even number : " + evens);
//        System.out.println("sum of the odd number : " + odds);










//        6.Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.



//        System.out.println("please enter a number ");
//        int prime = s.nextInt();
//
//
//
//         if (prime >= 1){
//             if ((1== prime /prime) && ( 1 == prime %2)){
//                 System.out.println(prime + " is prime");
//
//                  } else {
//                 System.out.println( prime + " not prime number");
//             }
//
//         } else {
//             System.out.println( "please enter a valid number !");
//         }
//
//








//        7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
//        another for loop to print the days (Days 1 -7) for each week.
//        Expected Output:
//        Week 1
//        Day1
//        Day2
//        Day3
//        Day4
//        Day5
//        Day6
//        Day7
//        Week 2
//        Day1
//        Day2



//        for (int i = 1; i <= 4 ; i++) {
//
//            System.out.println("Week " + i);
//
//            for (int j = 1; j <= 7 ; j++) {
//
//                System.out.println("Day " + j);
//
//            }
//        }










//        8.Write a program that's check if the word is a palindrome or not. hint: A string is said to be a palindrome if it is the same if we start reading it from
//  left to right or right to left



//كانت هذي النقطة غير واضحه لي و شفت شرح عليها باليوتيوب
//
//        System.out.println("enter a word : ");
//        String word = s.nextLine();
//
//        if (isPalindrome(word)){
//            System.out.println(word + " is a palindrome");
//
//        }else {
//            System.out.println(word + " is not a palindrome");
//        }
 }
//
//    private static boolean isPalindrome(String word) {
//        int left = 0 ;
//        int right = word.length() - 1 ;
//
//
//        while (left < right){
//             if (word.charAt(left) != word.charAt(right) ) {
//                 return false ;
//             }
//             left ++;
//             right -- ;
//        }
//        return true ;

    }

