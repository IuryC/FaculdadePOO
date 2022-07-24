package br.edu.ifs.academico;

public class Inspetor extends Pessoa {
    private String cidadeAtuacao;
    private int nivel;

    @Override
    public String toString() {
        return "Inspetor{" +
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
