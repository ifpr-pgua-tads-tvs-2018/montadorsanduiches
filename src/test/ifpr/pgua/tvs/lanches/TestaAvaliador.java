package ifpr.pgua.tvs.lanches;

import ifpr.pgua.tvs.lanches.controler.Avaliador;
import ifpr.pgua.tvs.lanches.models.Item;
import ifpr.pgua.tvs.lanches.models.Sanduiche;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestaAvaliador {

    @Test
    public void sanduicheComPao_DeveRetornarTrue(){

        //cenario
        Item pao = new Item("Pao",2.0,0.2);
        Item queijo = new Item("Queijo",2.5,0.3);
        Item presunto = new Item("Presunto",3.2,0.25);

        Sanduiche sanduiche = new Sanduiche();
        sanduiche.adiciona(pao);
        sanduiche.adiciona(queijo);
        sanduiche.adiciona(presunto);

        Avaliador avaliador = new Avaliador();

        //ação
        boolean resultado = avaliador.avalia(sanduiche);

        //verificação
        Assertions.assertEquals(true,resultado);
    }

    @Test
    public void sanduicheComDoisPaes_DeveRetornarFalse(){

        //cenario
        Item pao1 = new Item("Pao",2.0,0.2);
        Item pao2 = new Item("Pao",2.0,0.2);
        Item queijo = new Item("Queijo",2.5,0.3);
        Item presunto = new Item("Presunto",3.2,0.25);

        Sanduiche sanduiche = new Sanduiche();
        sanduiche.adiciona(pao1);
        sanduiche.adiciona(queijo);
        sanduiche.adiciona(pao2);
        sanduiche.adiciona(presunto);

        Avaliador avaliador = new Avaliador();

        //ação
        boolean resultado = avaliador.avalia(sanduiche);

        //verificação
        Assertions.assertEquals(false,resultado);
    }
}
