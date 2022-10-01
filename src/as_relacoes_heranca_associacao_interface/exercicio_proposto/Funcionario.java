package as_relacoes_heranca_associacao_interface.exercicio_proposto;

public class Funcionario {
    String nome;
    Integer idade;
    String cpf;
    Double salario;

    public Funcionario(String nome, Integer idade, String cpf, Double salario) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double calculaSalariocomComBonus(Double salario){
        Double taxa = 0.05;
        Double valorBonus = salario * taxa;
        return salario + valorBonus;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario +
                '}';
    }
}
