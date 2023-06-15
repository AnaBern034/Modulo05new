package Ex1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrordutoTeste extends ProdutoPronto {

    @Test
    public void testarOMaisBarato(){


        Assertions.assertEquals(30,produto1.lógica());




    }

}
