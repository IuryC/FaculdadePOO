package br.edu.ifs.academico;

public class Psicologo extends Pessoa{
    private int carga_horaria;

    public Psicologo(long cpf) {
        super(cpf);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCarga horaria = " + carga_horaria +
                "\nNúmero do conselho = " + numero_conselho;
    }

    private int numero_conselho;

    public int getCarga_horaria() {

        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {

        this.carga_horaria = carga_horaria;
    }

    public int getNumero_conselho(){

        return numero_conselho;
    }
    public void setNumero_conselho(int numero_conselho){

        this.numero_conselho = numero_conselho;
    }
}
