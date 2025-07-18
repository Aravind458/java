public class Day5 {
    public static void main(String[] args) {
        // conditional operators
        int a = -30;
        int b = 30;
        // if (a < b) {
        //     System.out.println("a is less than b");
        // } else if (a == b) {
        //     System.out.println("a equals b");
        // }

        // else {
        //     System.out.println("b is less than a");
        // }
        // switch
        switch (a + b) {
            case 0:
                System.out.println("sum is zero");
                break;
            case 1: System.out.println("sum is one");
                break;
            default: System.out.println("sum is not one or zero");
        }
    }

}

 
