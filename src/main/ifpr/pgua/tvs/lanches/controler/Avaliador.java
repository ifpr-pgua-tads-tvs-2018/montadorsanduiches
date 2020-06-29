package ifpr.pgua.tvs.lanches.controler;

import ifpr.pgua.tvs.lanches.models.Item;
import ifpr.pgua.tvs.lanches.models.Sanduiche;

public class Avaliador {

    public boolean avalia(Sanduiche sanduiche){

        int contPaes = 0;

        for(Item item:sanduiche.getItems()){
            if(item.getDescricao().equals("Pao")){
                contPaes +=1;
            }
        }

        if(contPaes > 1){
            return false;
        }

        return true;
    }
}
