package ifpr.pgua.tvs.lanches.builders;

import ifpr.pgua.tvs.lanches.models.Item;

public class ItemBuilder {

    private Item item;

    private ItemBuilder(){}


    public static ItemBuilder umItem(){
        ItemBuilder builder = new ItemBuilder();

        builder.item = new Item("Item",2.0,0.1);

        return builder;
    }


    public ItemBuilder comDescricao(String descricao){
        item.setDescricao(descricao);

        return this;
    }

    public Item agora(){
        return item;
    }

}
