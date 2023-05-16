package ted.heranca;

public class Funcionario extends Pessoa{
    private String cargo;

    public Funcionario(){
    }

    public Funcionario(String cargo) {
        this.cargo = cargo;
    }

    public Funcionario(String endereco, String telefone, String cargo) {
        super(endereco, telefone);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
