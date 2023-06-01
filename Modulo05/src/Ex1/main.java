package Ex1;


import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        MenuAlimentos opcao = new MenuAlimentos();
        Scanner ler = new Scanner(System.in);

        try {
            System.out.println("Qual tipo de alimento você deseja adicionar no carrinho\nVERDURA\nLEGUMES\nGRÃOS\nOUTROS");
            String try1 = ler.next();

            if (try1.equalsIgnoreCase("Verdura")) {
                System.out.println(opcao.getVerdura());
                System.out.println();
                System.out.println("Escolha o alimento desejado");
                try1 = ler.next();
                System.out.println("O alimento escolhido foi: "+try1);
                System.out.println();
                try {
                    System.out.println("Digite a quantidade de gramas você deseja adicionar?");
                    double gramas = ler.nextDouble();
                    throw new NumberFormatException("Para verdura, a quantidade deve ser informada com ponto");

                } catch (InputMismatchException erroNumero){
                    System.out.println("Para verdura, a quantidade deve ser informada com ponto");
                    ler.next();
                }

            } else if (try1.equalsIgnoreCase("Legumes")) {
                System.out.println(opcao.getLegumes());
                System.out.println("Escolha o alimento desejado");
                try1 = ler.next();
                System.out.println("O alimento escolhido foi: "+try1);
                System.out.println();

            } else if (try1.equalsIgnoreCase("Grãos")) {
                System.out.println(opcao.getGrãos());
                System.out.println("Escolha o alimento desejado");
                try1 = ler.next();
                System.out.println("O alimento escolhido foi: "+try1);
                System.out.println();

                try {
                    System.out.println("Digite a quantidade de gramas você deseja adicionar?");
                    double gramas = ler.nextDouble();
                    throw new NumberFormatException("Para verdura, a quantidade deve ser informada com ponto");

                } catch (NumberFormatException erroNumero){
                    System.out.println("Erro: "+erroNumero.getMessage());
                    ler.next();
                }

            } else if (try1.equalsIgnoreCase("Outros")) {
            } else {
                throw new IllegalArgumentException("Tipo de alimento inválido");
            }
        } catch (IllegalArgumentException erro1) {
            System.out.println("Erro: "+ erro1.getMessage());
        }

    }

}
