package InterpreterPattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InterpretadorTeste {

    @Test
    void deveCalcularExpressaoSoma() {
        Operador expressao = new Somar(new Numero(6), new Numero(2));
        assertEquals(8, expressao.interpretar());
    }

    @Test
    void deveCalcularExpressaoSubtracao() {
        Operador expressao = new Subtrair(new Numero(6), new Numero(2));
        assertEquals(4, expressao.interpretar());
    }

    @Test
    void deveCalcularExpressaoMultiplicacao() {
        Operador expressao = new Multiplicar(new Numero(6), new Numero(2));
        assertEquals(12, expressao.interpretar());
    }

    @Test
    void deveCalcularExpressaoDivisao() {
        Operador expressao = new Dividir(new Numero(6), new Numero(2));
        assertEquals(3, expressao.interpretar());
    }

    @Test
    void deveCalcularExpressaoCombinada() {
        Operador expressao = new Somar(
                new Multiplicar(
                        new Dividir(new Numero(10), new Numero(2)),
                        new Numero(3)
                ),
                new Subtrair(new Numero(1), new Numero(4))
        );
        assertEquals(12, expressao.interpretar());
    }
}
