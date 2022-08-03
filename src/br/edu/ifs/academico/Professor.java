package br.edu.ifs.academico;

public class Professor extends Pessoa {
    private String formacao;

    public Professor(long cpf) {
        super(cpf);
    }

    @Override
    public String toString() {
        return super.toString() + "Professor{" +
                "formacao='" + formacao + '\'' +
                '}';
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
