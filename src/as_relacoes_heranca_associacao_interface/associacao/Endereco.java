package as_relacoes_heranca_associacao_interface.associacao;

public class Endereco {

    String logradouro;
    Integer numero;
    String cidade;
    String estado;
    String pais;

    public Endereco(String logradouro, Integer numero, String cidade, String estado, String pais) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
