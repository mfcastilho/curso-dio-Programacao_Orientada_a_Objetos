package as_relacoes_heranca_associacao_interface.associacao;

public class Aluno {
    String nome;
    Integer idade;
    String periodo;
    Integer sala;
    Disciplina disciplina;

    public Aluno(String nome, Integer idade, String periodo, Integer sala, Disciplina disciplina) {
        this.nome = nome;
        this.idade = idade;
        this.periodo = periodo;
        this.sala = sala;
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Integer getSala() {
        return sala;
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
