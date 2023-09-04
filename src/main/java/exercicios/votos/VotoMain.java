package exercicios.votos;

public class VotoMain{

    static Integer totalEleitores = 1000;
    static Integer votosValidos = 800;
    static Integer votosBrancos = 150;
    static Integer votosNulos = 50;


    public static void main(String[] args) {
        calcularVotosValidos();
        calcularVotosBrancos();
        calcularVotosNulos();
    }

    public static void calcularVotosValidos(){
        System.out.println("Percentual de votos válidos: "+ Voto.calcular(totalEleitores, votosValidos));
    }

    public static void calcularVotosBrancos(){
        System.out.println("Percentual de votos brancos: "+ Voto.calcular(totalEleitores, votosBrancos));
    }

    public static void calcularVotosNulos(){
        System.out.println("Percentual de votos nulos: "+ Voto.calcular(totalEleitores, votosNulos));
    }

}
