import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("please Enter marks of student" + (i + 1));
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i] + " ");
        }


    }
}
