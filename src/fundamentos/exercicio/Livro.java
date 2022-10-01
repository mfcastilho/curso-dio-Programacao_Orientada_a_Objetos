package fundamentos.exercicio;

public class Livro {
    private String titulo;
    private Integer anoDeLancamento;
    private String autor;
    private String genero;

    public Livro(String titulo, Integer anoDeLancamento, String autor, String genero) {
        this.titulo = titulo;
        this.anoDeLancamento = anoDeLancamento;
        this.autor = autor;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "{" +
                "titulo='" + titulo + '\'' +
                ", anoDeLancamento=" + anoDeLancamento +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
