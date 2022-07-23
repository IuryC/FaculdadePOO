package br.edu.ifs.academico;

public class Pessoa {
    private String nome;
    private char sexo;
    private String localNascimento;
    private String dataNascimento;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo=" + sexo +
                ", localNascimento='" + localNascimento + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public char getsexo(){
        return this.getSexo();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
