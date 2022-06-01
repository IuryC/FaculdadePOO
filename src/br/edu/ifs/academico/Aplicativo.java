package br.edu.ifs.academico;

import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu menu = new Menu();
        System.out.println(menu.getMenu());

        int opcao = sc.nextInt();

        while(opcao != 0){
            switch(opcao){
                case 1:
                    System.out.println("01 - Cadastrar aluno");
                    break;
                case 2:
                    System.out.println("02 - Cadastrar professor");
                    break;
                case 3:
                    System.out.println("03 - Cadastrar psicólogo");
                    break;
                case 4:
                    System.out.println("04 - Cadastrar técnico");
                    break;

            }
        }
    }
}
