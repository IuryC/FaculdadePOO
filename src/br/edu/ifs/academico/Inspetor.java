package br.edu.ifs.academico;

public class Inspetor extends Pessoa {
    private String cidadeAtuacao;
    private int nivel;

    public Inspetor(long cpf) {
        super(cpf);
    }

    @Override
    public String toString() {
        return super.toString() + "Inspetor{" +
                "cidadeAtuacao='" + getCidadeAtuacao() + '\'' +
                ", nivel=" + getNivel() +
                '}';
    }

    public String getCidadeAtuacao() {
        return cidadeAtuacao;
    }

    public void setCidadeAtuacao(String cidadeAtuacao) {
        this.cidadeAtuacao = cidadeAtuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
