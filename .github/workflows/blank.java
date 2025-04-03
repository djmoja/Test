public class Casting {
    public static int calculate(int x, int y) {
        int result = 0;

        if (x > 0) {
            if (y > 0) {
                result = x + y;
            } else {
                result = x - y;
            }
        } else {
            result = y * 2;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(calculate(5,5));
    }
}
