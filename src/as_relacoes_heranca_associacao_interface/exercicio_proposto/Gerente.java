package as_relacoes_heranca_associacao_interface.exercicio_proposto;

public class Gerente extends Funcionario{

    public Gerente(String nome, Integer idade, String cpf, Double salario) {
        super(nome, idade, cpf, salario);
    }

    //sobrescrita de método
    @Override
    public Double calculaSalariocomComBonus(Double salario){
        Double taxa = 0.2;
        Double valorBonus = salario * taxa;
        return salario + valorBonus;
    }
}
