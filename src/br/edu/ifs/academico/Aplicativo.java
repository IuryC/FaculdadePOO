package br.edu.ifs.academico;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) {


        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        ArrayList<Professor> professores = new ArrayList<Professor>();
        ArrayList<Psicologo> psicologos = new ArrayList<Psicologo>();
        ArrayList<Tecnico> tecnicos = new ArrayList<Tecnico>();
        ArrayList<Inspetor> inspetores = new ArrayList<Inspetor>();
        ArrayList<Avaliador> avaliadores = new ArrayList<Avaliador>();

        Scanner sc = new Scanner(System.in);

        Menu menu = new Menu();
        System.out.println(menu.getMenu());

        int opcao = sc.nextInt();

        char sexo;
        String dataNascimento;
        String localNascimento;

        while(opcao != 0){


            switch(opcao){

                case 1:
                    System.out.println("01 - Cadastrar aluno");
                    Aluno aluno = new Aluno();
                    System.out.println("Informe o nome: ");
                    aluno.setNome(sc.next());
                    System.out.println("Informe o sexo: ");
                    sexo = sc.next().charAt(0);
                    aluno.setSexo(sexo);
                    System.out.println("Insira a data de nascimento: ");
                    dataNascimento = sc.next();
                    aluno.setDataNascimento(dataNascimento);
                    System.out.println("Insira o local de nascimento: ");
                    localNascimento = sc.next();
                    aluno.setLocalNascimento(localNascimento);
                    System.out.println("Insira a primeira nota: ");
                    double nota1 = sc.nextDouble();
                    aluno.setNota1(nota1);
                    System.out.println("Insira a segunda nota: ");
                    double nota2 = sc.nextDouble();
                    aluno.setNota2(nota2);
                    System.out.println("Insira a terceira nota: ");
                    double nota3 = sc.nextDouble();
                    aluno.setNota3(nota3);

                    alunos.add(aluno);
                    break;
                case 2:
                    System.out.println("02 - Cadastrar professor");
                    Professor professor = new Professor();
                    System.out.println("Informe o nome: ");
                    professor.setNome(sc.next());
                    System.out.println("Informe o sexo: ");
                    sexo = sc.next().charAt(0);
                    professor.setSexo(sexo);
                    System.out.println("Insira a data de nascimento: ");
                    dataNascimento = sc.next();
                    professor.setDataNascimento(dataNascimento);
                    System.out.println("Insira o local de nascimento: ");
                    localNascimento = sc.next();
                    professor.setLocalNascimento(localNascimento);
                    System.out.println("Insira a formação: ");
                    String formacao = sc.next();
                    professor.setFormacao(formacao);


                   professores.add(professor);
                    break;
                case 3:
                    System.out.println("03 - Cadastrar psicólogo");
                    Psicologo psicologo = new Psicologo();
                    System.out.println("Informe o nome: ");
                    psicologo.setNome(sc.next());
                    System.out.println("Informe o sexo: ");
                    sexo = sc.next().charAt(0);
                    psicologo.setSexo(sexo);
                    System.out.println("Insira a data de nascimento: ");
                    dataNascimento = sc.next();
                    psicologo.setDataNascimento(dataNascimento);
                    System.out.println("Insira o local de nascimento: ");
                    localNascimento = sc.next();
                    psicologo.setLocalNascimento(localNascimento);
                    System.out.println("Insira a carga horaria: ");
                    int carga_horaria = sc.nextInt();
                    psicologo.setCarga_horaria(carga_horaria);
                    System.out.println("Insira o número do conselho: ");
                    int numero_conselho = sc.nextInt();
                    psicologo.setNumero_conselho(numero_conselho);

                    psicologos.add(psicologo);
                    break;
                case 4:
                    System.out.println("04 - Cadastrar técnico");
                    Tecnico tecnico = new Tecnico();
                    System.out.println("Informe o nome: ");
                    tecnico.setNome(sc.next());
                    System.out.println("Informe o sexo: ");
                    sexo = sc.next().charAt(0);
                    tecnico.setSexo(sexo);
                    System.out.println("Insira a data de nascimento: ");
                    dataNascimento = sc.next();
                    tecnico.setDataNascimento(dataNascimento);
                    System.out.println("Insira o local de nascimento: ");
                    localNascimento = sc.next();
                    tecnico.setLocalNascimento(localNascimento);
                    System.out.println("Insira o cargo: ");
                    String cargo = sc.next();
                    tecnico.setCargo(cargo);
                    System.out.println("Insira a empresa: ");
                    String empresa = sc.next();
                    tecnico.setEmpresa(empresa);
                    System.out.println("Insira o número do contrato: ");
                    int num_contrato = sc.nextInt();
                    tecnico.setNum_contrato(num_contrato);

                    tecnicos.add(tecnico);
                    break;

                case 5:
                    System.out.println("04 - Cadastrar Inspetor");
                    Inspetor inspetor = new Inspetor();
                    System.out.println("Informe o nome: ");
                    inspetor.setNome(sc.next());
                    System.out.println("Informe o sexo: ");
                    sexo = sc.next().charAt(0);
                    inspetor.setSexo(sexo);
                    System.out.println("Insira a data de nascimento: ");
                    dataNascimento = sc.next();
                    inspetor.setDataNascimento(dataNascimento);
                    System.out.println("Insira o local de nascimento: ");
                    localNascimento = sc.next();
                    inspetor.setLocalNascimento(localNascimento);
                    System.out.println("Insira a cidade de atuação: ");
                    String cidadeAtuacao = sc.next();
                    inspetor.setCidadeAtuacao(cidadeAtuacao);
                    System.out.println("Insira o nível: ");
                    int nivel = sc.nextInt();
                    inspetor.setNivel(nivel);

                    inspetores.add(inspetor);
                    break;

                case 6:
                    System.out.println("04 - Cadastrar Avaliador");
                    Avaliador avaliador = new Avaliador();
                    System.out.println("Informe o nome: ");
                    avaliador.setNome(sc.next());
                    System.out.println("Informe o sexo: ");
                    sexo = sc.next().charAt(0);
                    avaliador.setSexo(sexo);
                    System.out.println("Insira a data de nascimento: ");
                    dataNascimento = sc.next();
                    avaliador.setDataNascimento(dataNascimento);
                    System.out.println("Insira o local de nascimento: ");
                    localNascimento = sc.next();
                    avaliador.setLocalNascimento(localNascimento);
                    System.out.println("Insira a cidade de atuação: ");
                    String areaAtuacao = sc.next();
                    avaliador.setAreaAtuacao(areaAtuacao);
                    System.out.println("Insira a quantidade de bancas: ");
                    int qtdBancas = sc.nextInt();
                    avaliador.setQtdBancas(qtdBancas);

                    avaliadores.add(avaliador);
                    break;

                case 11:
                    System.out.println("Listar alunos");
                    System.out.println(alunos.toString());
                    break;
                case 12:
                    System.out.println("Listar professores");
                    System.out.println(professores.toString());
                    break;
                case 13:
                    System.out.println("Listar psicologos");
                    System.out.println(psicologos.toString());
                    break;
                case 14:
                    System.out.println("Listar tecnicos");
                    System.out.println(tecnicos.toString());
                    break;
                case 15:
                    System.out.println("Listar Inspetores");
                    System.out.println(inspetores.toString());
                    break;
                case 16:
                    System.out.println("Listar avaliadores");
                    System.out.println(avaliadores.toString());
                    break;
                case 0:
                    break;
            }
            System.out.println(menu.getMenu());
            opcao = sc.nextInt();
        }
        System.out.println("Programa encerrado");
    }
}
