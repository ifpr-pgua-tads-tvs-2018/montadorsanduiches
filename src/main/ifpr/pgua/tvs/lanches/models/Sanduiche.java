package ifpr.pgua.tvs.lanches.models;

import java.util.ArrayList;
import java.util.List;

public class Sanduiche {

    private double valorFinal;
    private List<Item> items;

    public Sanduiche(){
        items = new ArrayList<>();
    }

    public void adiciona(Item item){
        items.add(item);
        valorFinal += item.getValor();
    }

    public void remove(Item item){
        items.remove(item);
        valorFinal -= item.getValor();
    }

    public List<Item> getItems(){
        return items;
    }

    public double getValorFinal(){
        return valorFinal;
    }




}
