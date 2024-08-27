public class Main {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }

    private static boolean hasTeen(int num1, int num2, int num3){
        if ((num1 >= 9 && num1 <= 13) || (num2 > 9 && num2 <= 13) || (num3 >= 9 && num3 <= 13)) {
            return false;
        }
        return true;
    }
}

