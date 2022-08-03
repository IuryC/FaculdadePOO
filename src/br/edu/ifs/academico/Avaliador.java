package br.edu.ifs.academico;

public class Avaliador extends Pessoa {
    private int qtdBancas;
    private String areaAtuacao;

    public Avaliador(long cpf) {
        super(cpf);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nQuantidade de bancas = " + qtdBancas +
                "\nÁrea de atuação = " + areaAtuacao;
    }

    public int getQtdBancas() {
        return qtdBancas;
    }

    public void setQtdBancas(int qtdBancas) {
        this.qtdBancas = qtdBancas;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
}
