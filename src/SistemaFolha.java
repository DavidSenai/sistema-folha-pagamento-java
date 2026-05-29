import java.util.ArrayList;
import java.util.Scanner;

public class SistemaFolha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        int opcao;

        do {

            System.out.println("1 - Funcionário Padrão");
            System.out.println("2 - Funcionário Comissionado");
            System.out.println("3 - Funcionário Produção");
            System.out.println("4 - Gerar Folha de Pagamento");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Matrícula: ");
                    int registro = sc.nextInt();

                    funcionarios.add(new Funcionario(registro, nome));
                    break;

                case 2:

                    System.out.print("Nome: ");
                    nome = sc.nextLine();

                    System.out.print("Matrícula: ");
                    registro = sc.nextInt();

                    double vendas;
                    do {
                        System.out.print("Informe valor das vendas: ");
                        vendas = sc.nextDouble();
                        if (vendas < 0)
                            System.out.println("Valor inválido!");
                    } while (vendas < 0);

                    double percentual;
                    do {
                        System.out.print("Informe comissão percentual: ");
                        percentual = sc.nextDouble();
                        if (percentual < 0)
                            System.out.println("Valor inválido!");
                    } while (percentual < 0);

                    funcionarios.add(new FuncionarioComissionado(registro, nome, vendas, percentual));
                    break;

                case 3:

                    System.out.print("Nome: ");
                    nome = sc.nextLine();

                    System.out.print("Matrícula: ");
                    registro = sc.nextInt();

                    int quantidade;
                    do {
                        System.out.print("Informe qtde de peças: ");
                        quantidade = sc.nextInt();
                        if (quantidade < 0)
                            System.out.println("Valor inválido!");
                    } while (quantidade < 0);

                    double valorPeca;
                    do {
                        System.out.print("Informe valor da peça: ");
                        valorPeca = sc.nextDouble();
                        if (valorPeca < 0)
                            System.out.println("Valor inválido!");
                    } while (valorPeca < 0);

                    funcionarios.add(new FuncionarioProducao(registro, nome, quantidade, valorPeca));
                    break;

                case 4:

                    System.out.println("Total de pessoas cadastradas: " + funcionarios.size());

                    for (Funcionario f : funcionarios) {
                        System.out.println("---------------------");
                        f.mostrarDados();
                    }

                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);

        sc.close();
    }
}