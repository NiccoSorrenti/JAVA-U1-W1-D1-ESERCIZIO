public class es1 {
    public static void main(String[] args) {

        int result = prodotto(2, 10);
        System.out.println(result);

        concatena("ciao ", 10);
    }

    public static int prodotto(int num1, int num2) {
        return num1 * num2;
    }

    public static void concatena(String stringa1, int num1) {
        System.out.println(stringa1 + num1);
    }


}
