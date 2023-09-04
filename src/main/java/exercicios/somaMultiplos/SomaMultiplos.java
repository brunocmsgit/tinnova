package exercicios.somaMultiplos;

public interface SomaMultiplos {

    static int somarMultiplos(int numero) {
        int soma = 0;
        for (int i = 1; i < numero; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i;
            }
        }
        return soma;
    }

}
