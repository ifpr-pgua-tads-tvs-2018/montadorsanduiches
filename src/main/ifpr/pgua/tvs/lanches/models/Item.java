package ifpr.pgua.tvs.lanches.models;

public class Item {

    private String descricao;
    private double valor;
    private double peso;

    public Item(String descricao, double valor, double peso) {
        this.descricao = descricao;
        this.valor = valor;
        this.peso = peso;

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
