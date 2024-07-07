package task2;

public class SpecialSequence {
    public static long calculateNthTerm(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 3;
        }

        long previousTerm = 3;
        for (int i = 4; i <= n; i++) {
            if (i % 2 == 0) {
                previousTerm = previousTerm * 2;
            } else {
                previousTerm = previousTerm * 3;
            }
        }

        return previousTerm;
    }

    public static void main(String[] args) {
        System.out.println("Term 1: " + calculateNthTerm(1));
        System.out.println("Term 2: " + calculateNthTerm(2));
        System.out.println("Term 3: " + calculateNthTerm(3));
        System.out.println("Term 4: " + calculateNthTerm(4));
        System.out.println("Term 5: " + calculateNthTerm(5));
        System.out.println("Term 6: " + calculateNthTerm(6));
        System.out.println("Term 7: " + calculateNthTerm(7));
        System.out.println("Term 8: " + calculateNthTerm(8));
    }
}
