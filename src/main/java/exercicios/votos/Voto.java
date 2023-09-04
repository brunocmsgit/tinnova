package exercicios.votos;

import java.math.BigDecimal;

public interface Voto {

    static BigDecimal calcular(Integer totalEleitores, Integer votos) {
        return new BigDecimal(Math.divideExact(Math.multiplyExact(votos, 100), totalEleitores));
    }

}
