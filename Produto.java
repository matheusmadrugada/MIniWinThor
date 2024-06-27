public class Produto {

    private int codigo;
    private double   precodecompra,precodevenda;
    private String descricao,estatosdoproduto;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return this.codigo;
    }
    public void setPrecodecompra(double precodecompra) {
        this.precodecompra = precodecompra;
    }
    public double getPrecodecompra() {
        return this.precodecompra;
    }
    public void setPrecodevenda(double precodevenda) {
        this.precodevenda = precodevenda;
    }
    public double getPrecodevenda() {
        return this.precodevenda;
    }
public void setDescricao(String descricao) {
        this.descricao = descricao;
}
public String getDescricao() {
        return this.descricao;
}
public void setEstatosdoproduto(String estatosdoproduto) {
        this.estatosdoproduto = estatosdoproduto;

}
public String getEstatosdoproduto() {
        return this.estatosdoproduto;

}


    }

