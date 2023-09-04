package exercicios.fatorial;

public interface Fatorial {
    static int fatorial(int numero) {
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
