public class App {
    public static void main(String[] args) throws Exception {
        int[] numero = new int[12];
        int[] cuadrado = new int[12];
        int[] cubo = new int[12];
        int n = 12;

        for (int i = 0; i < n; i++) {
            System.out.printf("%4d |", numero[i] = (int)(Math.random()*101));
            System.out.printf(" %5d |", cuadrado[i] = numero[i] * numero[i]);
            System.out.printf("%8d\n", cubo[i] = cuadrado[i] * numero[i]);
        }
    }
}
