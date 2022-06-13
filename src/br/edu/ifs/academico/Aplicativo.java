package br.edu.ifs.academico;

import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) {


        Aluno[] alunos = new Aluno[10];
        Professor[] professores = new Professor[10];
        Psicologo[] psicologos = new Psicologo[10];
        Tecnico[] tecnicos = new Tecnico[10];

        Scanner sc = new Scanner(System.in);

        Menu menu = new Menu();
        System.out.println(menu.getMenu());

        int opcao = sc.nextInt();

        int contAluno = 0;
        int contProf = 0;
        int contPsi = 0;
        int contTec = 0;

        while(opcao != 0){
            switch(opcao){

                case 1:
                    System.out.println("01 - Cadastrar aluno");
                    Aluno aluno = new Aluno();
                    System.out.println("Informe o nome: ");
                    aluno.setNome(sc.next());
                    System.out.println("Informe o sexo: ");
                    char sexo = sc.next().charAt(0);
                    aluno.setSexo(sexo);
                    System.out.println("Insira a data de nascimento: ");
                    String dataNascimento = sc.next();
                    aluno.setDataNascimento(dataNascimento);
                    System.out.println("Insira o local de nascimento: ");
                    String localNascimento = sc.next();
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

                    alunos[contAluno] = aluno;
                    contAluno++;
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


                    professores[contProf] = professor;
                    contProf++;
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

                    psicologos[contPsi] = psicologo;
                    contPsi++;
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

                    tecnicos[contTec] = tecnico;
                    contTec++;
                    break;
                case 11:
                    if(alunos[0]==null){
                        System.out.println("Lista vazia");break;
                    }
                    System.out.println("Listar alunos");
                    for(int i = 0; i < contAluno ;i++){
                        System.out.println(alunos[i].getNome());
                        System.out.println(alunos[i].getSexo());
                        System.out.println(alunos[i].getDataNascimento());
                        System.out.println(alunos[i].getLocalNascimento());
                        System.out.println(alunos[i].getNota1());
                        System.out.println(alunos[i].getNota2());
                        System.out.println(alunos[i].getNota3());

                }
                    break;
                case 12:
                    System.out.println("Listar professores");
                    if(professores[0]==null){
                        System.out.println("Lista vazia");
                        break;
                    }
                    for(int i = 0; i < contProf ;i++){
                        System.out.println(professores[i].getNome());
                        System.out.println(professores[i].getSexo());
                        System.out.println(professores[i].getDataNascimento());
                        System.out.println(professores[i].getLocalNascimento());
                        System.out.println(professores[i].getFormacao());
                    }
                    break;
                case 13:
                    System.out.println("Listar psicologos");
                    if(psicologos[0]==null){
                        System.out.println("Lista vazia");
                        break;
                    }
                    for(int i = 0; i < contPsi ;i++) {
                        System.out.println(psicologos[i].getNome());
                        System.out.println(psicologos[i].getSexo());
                        System.out.println(psicologos[i].getDataNascimento());
                        System.out.println(psicologos[i].getLocalNascimento());
                        System.out.println(psicologos[i].getCarga_horaria());
                        System.out.println(psicologos[i].getNumero_conselho());
                    }
                    break;
                case 14:
                    System.out.println("Listar tecnicos");
                    if(tecnicos[0]==null){
                        System.out.println("Lista vazia");
                        break;
                    }
                    for(int i = 0; i < contTec ;i++) {
                        System.out.println(tecnicos[i].getNome());
                        System.out.println(tecnicos[i].getSexo());
                        System.out.println(tecnicos[i].getDataNascimento());
                        System.out.println(tecnicos[i].getLocalNascimento());
                        System.out.println(tecnicos[i].getCargo());
                        System.out.println(tecnicos[i].getEmpresa());
                        System.out.println(tecnicos[i].getNum_contrato());
                    }
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
