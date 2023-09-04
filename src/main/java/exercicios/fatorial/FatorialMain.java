package exercicios.fatorial;

public class FatorialMain {

    static int numeroInicial = 0;
    static int numeroFinal = 6;

    public static void main(String[] args) {
        for (int i = numeroInicial; i <= numeroFinal; i++) {
            if (i >= 0) {
                System.out.println("Fatorial de " + i + "! = " + Fatorial.fatorial(i));
            }
        }
    }

}