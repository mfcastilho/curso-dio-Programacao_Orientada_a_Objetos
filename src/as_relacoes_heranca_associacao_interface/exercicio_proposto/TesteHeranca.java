package as_relacoes_heranca_associacao_interface.exercicio_proposto;

public class TesteHeranca {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Carlos", 34, "65486543556", 12800d);
        Funcionario vendedor = (Funcionario) new Vendedor("Manuela", 23, "4658336556", 3750d);
        Funcionario faxineiro = new Faxineiro("Josesbaldo", 67, "875688575656", 1470d);



        System.out.println(gerente);
        System.out.println(gerente.calculaSalariocomComBonus(gerente.getSalario()));
    }
}
