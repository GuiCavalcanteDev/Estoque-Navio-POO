package estoque;

public class Peca {

    private String nome;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 1 || quantidade > 20) {
            System.out.println("A quantidade deve estar entre 1 e 20.");
        } else {
            this.quantidade = quantidade;
        }
    }


    }
