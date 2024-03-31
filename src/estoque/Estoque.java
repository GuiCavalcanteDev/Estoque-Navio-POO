package estoque;

public class Estoque extends Peca{

    private Peca peca;

    private int tamanhoMaximo;
    private int tamanhoMinimo;

    public Estoque(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
    }

    public Estoque() {
	}

	public void adicionarPeca(Peca peca) {
        if (tamanhoMinimo < tamanhoMaximo) {
            this.peca = peca;
            System.out.println("Peça " + peca.getNome() + " adicionada ao estoque.");
        } else {
        	return;
        }
    }

    public void removerPeca(String nomePeca, int quantidade) {
        if (this.peca != null && this.peca.getNome().equals(nomePeca)) {
            if (this.peca.getQuantidade() >= quantidade) {
                this.peca.setQuantidade(this.peca.getQuantidade() - quantidade);
                System.out.println(quantidade + " peça(s) removida(s) do estoque.");
                return;
            } else {
                return;
            }
        }
    }

    }

