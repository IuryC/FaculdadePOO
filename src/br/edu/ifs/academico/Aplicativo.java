package br.edu.ifs.academico;

import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        String nome = sc.next();
        aluno.setNome(nome);
        System.out.println(aluno.getNome());

        String dataNascimento = sc.next();
        aluno.setDataNascimento(dataNascimento);
        System.out.println(aluno.getDataNascimento());

        String localNascimento = sc.next();
        aluno.setLocalNascimento(localNascimento);
        System.out.println(aluno.getLocalNascimento());

        char sexo = sc.next().charAt(0);
        aluno.setSexo(sexo);
        System.out.println(aluno.getSexo());

    }
}
