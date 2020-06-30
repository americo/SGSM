package produto;

public class Produto {

    private String nome;
    private String tipo;
    private float preco;
    private int quantidade;
    private int produto_ID;

    public Produto(String nome, String tipo, float preco, int quantidade, int produto_ID) {
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
        this.quantidade = quantidade;
        this.produto_ID = produto_ID;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getProduto_ID() {
        return produto_ID;
    }

    public void setProduto_ID(int produto_ID) {
        this.produto_ID = produto_ID;
    }


    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", produto_ID=" + produto_ID +
                '}';
    }
}
