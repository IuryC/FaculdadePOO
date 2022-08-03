package br.edu.ifs.academico;

public class AlunoAssistido extends Pessoa{

    private String necessidadeParticular;
    private double bolsa;
    private String dataInicioAssistencia;
    private String dataFimAssistencia;
    private String assistente;

    @Override
    public String toString() {
        return super.toString() + "AlunoAssistido{" +
                "necessidadeParticular='" + necessidadeParticular + '\'' +
                ", bolsa=" + bolsa +
                ", dataInicioAssistencia='" + dataInicioAssistencia + '\'' +
                ", dataFimAssistencia='" + dataFimAssistencia + '\'' +
                ", assistente='" + assistente + '\'' +
                '}';
    }

    public AlunoAssistido(long cpf) {
        super(cpf);
    }

    public String getDataInicioAssistencia() {
        return dataInicioAssistencia;
    }

    public void setDataInicioAssistencia(String dataInicioAssistencia) {
        this.dataInicioAssistencia = dataInicioAssistencia;
    }

    public String getDataFimAssistencia() {
        return dataFimAssistencia;
    }

    public void setDataFimAssistencia(String dataFimAssistencia) {
        this.dataFimAssistencia = dataFimAssistencia;
    }

    public String getAssistente() {
        return assistente;
    }

    public void setAssistente(String assistente) {
        this.assistente = assistente;
    }

    public String getNecessidadeParticular() {
        return necessidadeParticular;
    }

    public void setNecessidadeParticular(String necessidadeParticular) {
        this.necessidadeParticular = necessidadeParticular;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}
