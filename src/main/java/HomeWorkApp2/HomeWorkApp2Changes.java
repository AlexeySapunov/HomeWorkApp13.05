package HomeWorkApp2;


public class HomeWorkApp2Changes {

    public static void main(String[] args) {

        checkSumNumber(10, 5);
        System.out.println(checkSumNumber(5,3));
        boolean b = determineLeapYear(2100);
        System.out.println(b);
        System.out.println(determineLeapYear(2000));
    }

    static boolean checkSumNumber(int a, int b) {

        return (a + b) > 10 && (a + b) <= 20;
    }

    static boolean determineLeapYear(int a) {
        return a % 4 == 0 && a % 400 == 0;
    }
}