package Package_Trabalhos;
import java.util.Locale;
import java.util.Scanner;

public class ProjetoTrabalho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Nomes dos Funcionarios
        String Func1 = "Eduardo Rodriguez";
        String Func2 = "Julia Pinheiro";
        String Func3 = "Alexandro Queiroz";

        //Matriculas
        int matri1 = 68979425;
        int matri2 = 98725280;
        int matri3 = 55379164;

        //Bônus e porcetagem
        double porc = 0.48;
        double vendas = 2500.00;
        double valpec = 150.99;
        int quant = 25;

        //Salários
        double Sal1 = 2000.00;
        double Sal2 = (vendas * porc) + Sal1;
        double Sal3 = (valpec * quant) + Sal1;

        //OUTROS
        String nome;
        String senha;
        String opcao;
        String USUARIO_CORRETO = "ADMIN";
        String SENHA_CORRETA = "1234";

        //PROGRAMA DO PROJETO

        System.out.println("====================");
        System.out.println("===    LOGIN     ===");
        System.out.println("====================");

        do {
            System.out.print("Usuário: ");
            nome = sc.nextLine().trim().toUpperCase(Locale.ROOT);

            System.out.print("Senha: ");
            senha = sc.nextLine().trim();

            if (nome.equals(USUARIO_CORRETO) && senha.equals(SENHA_CORRETA)) {
                System.out.println("\n=======================");
                System.out.println("= Login bem-sucedido! =");
                System.out.println("===== Bem-vindo! ======");
                System.out.println("=======================");

                System.out.println("\n===============================");
                System.out.println("=== SISTEMA DE FUNCIONÁRIOS ===");
                System.out.println("===============================");

                do {System.out.println("\nEscolha uma opção:");
                    System.out.println("1 - " + Func1);
                    System.out.println("2 - " + Func2);
                    System.out.println("3 - " + Func3);
                    System.out.println("0 - Sair do sistema");
                    System.out.print("\nDigite o número da opção: ");

                    opcao = sc.nextLine().trim();

                    switch (opcao) {
                        case "1":
                            System.out.println("\n\n================================");
                            System.out.println("====== FUNCIONÁRIO PADRÃO ======");
                            System.out.println("================================");
                            System.out.println("\nNOME: " + Func1 + "\nMATRICULA:" + matri1 + "\nSALÁRIO: " + Sal1);
                            System.out.println("\n================================");

                            break;
                        case "2":
                            System.out.println("\n\n=====================================");
                            System.out.println("====== FUNCIONÁRIO DE COMISSÃO ======");
                            System.out.println("=====================================");
                            System.out.println("\nNOME: " + Func2 + "\nMATRICULA:" + matri2 + "\nVENDAS: " + vendas + "\nPORCETAGEM: "+ porc + "\nSALÁRIO: " + Sal2);
                            System.out.println("\n=====================================");

                            break;
                        case "3":
                            System.out.println("\n\n====================================");
                            System.out.println("====== FUNCIONÁRIO DE PRODUÇÃO ======");
                            System.out.println("====================================");
                            System.out.println("\nNOME: " + Func3 + "\nMATRICULA: " + matri3 + "\nBÔNUS POR PRODUTIVIDADE: " + valpec + " X " + quant + "\nSALÁRIO: " + Sal3);
                            System.out.println("\n====================================");

                            break;
                        case "0":
                            System.out.println("\n\n=============================");
                            System.out.println("========= ATÉ LOGO! =========");
                            System.out.println("====== ENCERRANDO. . . ======");
                            System.out.println("=============================");
                            break;
                        default:
                            System.out.println("\n\n==============================");
                            System.out.println("======= OPÇÃO INVÁLIDA =======");
                            System.out.println("==============================");
                            break;
                    }
                } while (!opcao.equals("0"));

            } else {
                System.out.println("\n================================");
                System.out.println("======== ACESSO NEGADO =========");
                System.out.println("=== NOME OU SENHA INCORRETOS ===");
                System.out.println("================================\n");
            }
        } while (!nome.equals(USUARIO_CORRETO) || !senha.equals(SENHA_CORRETA));

        sc.close();
    }
}