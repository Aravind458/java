public class ConditionalExample {
    public static void main(String[] args) {
        int score = 75;

        System.out.println("Your score is " + score);

        if (score >= 90) {
            System.out.println("Grade: A - Excellent!");
        } else if (score >= 80) {
            System.out.println("Grade: B - Very Good!");
        } else if (score >= 70) {
            System.out.println("Grade: C - Good.");
        } else if (score >= 60) {
            System.out.println("Grade: D - Satisfactory.");
        } else {
            System.out.println("Grade: F - Needs Improvement.");
        }
    }
}