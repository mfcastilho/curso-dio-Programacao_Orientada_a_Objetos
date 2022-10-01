package as_relacoes_heranca_associacao_interface.exercicio_proposto;

public class Vendedor extends Funcionario{
    public Vendedor(String nome, Integer idade, String cpf, Double salario) {
        super(nome, idade, cpf, salario);
    }

    //sobrescrita de método
    public Double calculaSalariocomComBonus(Double salario){
        Double taxa = 0.1;
        Double valorBonus = salario * taxa;
        return salario + valorBonus;
    }
}
