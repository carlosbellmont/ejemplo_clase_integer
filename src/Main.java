public class Main {

    public static void main(String[] args) {
        Integer int1 = 1;
        Integer int2 = 3;
        Integer resultado = myFunction(int1, int2);
        System.out.println("int1 = " + int1);
        System.out.println("int2 = " + int2);
        System.out.println("resultado = " + resultado);
    }

    private static int myFunction(Integer int1, Integer int2) {
        int1++;
        int2 = int2 * 2;
        return int1 + int2;
    }
}
