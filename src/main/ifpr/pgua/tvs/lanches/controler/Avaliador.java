package ifpr.pgua.tvs.lanches.controler;

import ifpr.pgua.tvs.lanches.models.Item;
import ifpr.pgua.tvs.lanches.models.Sanduiche;

public class Avaliador {

    private double valorMaiorItem=Double.MIN_VALUE;
    private Item maiorItem;

    public void avalia(Sanduiche sanduiche){

        for(Item item:sanduiche.getItems()){
            if(item.getValor() > valorMaiorItem){
                maiorItem = item;
                valorMaiorItem = item.getValor();
            }
        }
    }
}
