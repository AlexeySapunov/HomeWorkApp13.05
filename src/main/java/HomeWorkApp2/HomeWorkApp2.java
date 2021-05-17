package HomeWorkApp2;



public class HomeWorkApp2 {

    public static void main(String[] args) {

        checkSumNumber(5,10);
        positiveOrNegativeNumber(6);
        checkPositiveOrNegativeNumber(-9);
        numberOfLines("Java",10);
        boolean b = determineLeapYear(1986);
        System.out.println(b);
    }

    static boolean checkSumNumber(int a,int b) {

        return (a + b) > 10 | (a + b) <= 20;
    }

    static void positiveOrNegativeNumber(int a) {

        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    static boolean checkPositiveOrNegativeNumber(int a) {

        return a >= 0;
    }

    static void numberOfLines(String s,int i) {

        for (int j = 0; j <= i; j++) {
            System.out.println(s);
        }
    }

    static boolean determineLeapYear(int a) {

        if (a % 4 == 0 && a % 400 == 0) {
            return true;
        } else if (a % 100 == 0) {
            return false;
        }
        return false;
    }
}
