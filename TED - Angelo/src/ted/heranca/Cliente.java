package ted.heranca;

public class Cliente extends Pessoa {
    private String profissao;

    public Cliente() {
    }

    public Cliente(String profissao) {
        this.profissao = profissao;
    }

    public Cliente(String endereco, String telefone, String profissao) {
        super(endereco, telefone);
        this.profissao = profissao;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
