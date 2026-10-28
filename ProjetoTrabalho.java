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
            System.out.print("User: ");
            nome = sc.nextLine().trim().toUpperCase(Locale.ROOT);

            System.out.print("Password: ");
            senha = sc.nextLine().trim();

            if (nome.equals(USUARIO_CORRETO) && senha.equals(SENHA_CORRETA)) {
                System.out.println("\n=======================");
                System.out.println("===== Login Done! =====");
                System.out.println("====== Welcome! =======");
                System.out.println("=======================");

                System.out.println("\n==================================");
                System.out.println("=== EMPLOYEE MANAGEMENT SYSTEM ===");
                System.out.println("==================================");

                do {System.out.println("\nChoose an option:");
                    System.out.println("1 - " + Func1);
                    System.out.println("2 - " + Func2);
                    System.out.println("3 - " + Func3);
                    System.out.println("0 - Exit the system");
                    System.out.print("\nChoose the option number: ");

                    opcao = sc.nextLine().trim();

                    switch (opcao) {
                        case "1":
                            System.out.println("\n\n================================");
                            System.out.println("====== STANDARD EMPLOYEE =======");
                            System.out.println("================================");
                            System.out.println("\nNAME: " + Func1 + "\nEMPLOYEE ID: " + matri1 + "\nSALARY: " + Sal1);
                            System.out.println("\n================================");

                            break;
                        case "2":
                            System.out.println("\n\n=====================================");
                            System.out.println("======== COMMISSION EMPLOYEE ========");
                            System.out.println("=====================================");
                            System.out.println("\nNAME: " + Func2 + "\nEMPLOYEE ID: " + matri2 + "\nSALES: " + vendas + "\nCOMMISSION RATE: "+ porc + "\nSALARY: " + Sal2);
                            System.out.println("\n=====================================");

                            break;
                        case "3":
                            System.out.println("\n\n====================================");
                            System.out.println("======== PRODUCTION EMPLOYEE =======");
                            System.out.println("====================================");
                            System.out.println("\nNAME: " + Func3 + "\nEMPLOYEE ID: " + matri3 + "\nPRODUCTION BONUS: " + valpec + " X " + quant + "\nSALARY: " + Sal3);
                            System.out.println("\n====================================");

                            break;
                        case "0":
                            System.out.println("\n\n=================================");
                            System.out.println("========= SEE YOU SOON! =========");
                            System.out.println("========= Ending . . . ==========");
                            System.out.println("=================================");
                            break;
                        default:
                            System.out.println("\n\n==============================");
                            System.out.println("======= INVALID OPTION =======");
                            System.out.println("==============================");
                            break;
                    }
                } while (!opcao.equals("0"));

            } else {
                System.out.println("\n==================================");
                System.out.println("========= ACESSO NEGADO ==========");
                System.out.println("=== NAME OR PASSWORD INCORRECT ===");
                System.out.println("==================================\n");
            }
        } while (!nome.equals(USUARIO_CORRETO) || !senha.equals(SENHA_CORRETA));

        sc.close();
    }
}