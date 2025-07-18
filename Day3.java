// import java.util.Scanner;
// public class Day3 {
//     public static void main(String[] args) {
//         //Basic imput and output
//         int a = 10;
//         char c = 'v';
//         int p;
//         System.out.println(a);
//         System.out.println(c);
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         p = sc.nextInt();
//         System.out.println("You entered the number is:"+p);
//     }   
// }

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        int l;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the l &b Values: ");
        l = sc.nextInt();
        b = sc.nextInt();
        System.out.println(l*b);
    }
}