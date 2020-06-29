package ifpr.pgua.tvs.lanches;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExemploAssertivas {

    @Test
    public void paraTestarIgualdade(){

        //definição das variáveis

        int resultado = 10;
        int esperado = 10;

        //verificação

        Assertions.assertEquals(esperado,resultado);

    }

    @Test
    public void paraTestarIgualdadeDouble(){
        //definição das variáveis

        double resultado = 10.0;
        double esperado = 10.0;

        //verificação

        Assertions.assertEquals(esperado,resultado,0.0001);
    }

    @Test
    public void paraVerificarNulo(){

        //definição das variáveis

        Object objetoNulo = null;
        Object objetoNaoNulo = new Object();
        //verificação

        Assertions.assertNull(objetoNulo);

        Assertions.assertNotNull(objetoNaoNulo);


    }

    @Test
    public void paraVerificarIgualdadeObjetos(){

        //definição das variáveis

        Object objeto1 = new Object();
        Object objeto2 = objeto1;
        Object objeto3 = new Object();

        //verificação

        Assertions.assertSame(objeto1,objeto2);

        Assertions.assertNotSame(objeto1,objeto3);


    }


}
