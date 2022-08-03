package br.edu.ifs.academico;

public class Tecnico extends Pessoa {
    private String cargo;
    private String empresa;

    public Tecnico(long cpf) {
        super(cpf);
    }

    @Override
    public String toString() {
        return super.toString() + "Tecnico{" +
                "cargo='" + cargo + '\'' +
                ", empresa='" + empresa + '\'' +
                ", num_contrato=" + num_contrato +
                '}';
    }

    private int num_contrato;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getNum_contrato() {
        return num_contrato;
    }

    public void setNum_contrato(int num_contrato) {
        this.num_contrato = num_contrato;
    }
}
