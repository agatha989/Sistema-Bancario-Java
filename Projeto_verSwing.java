package Package_Trabalhos;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Projeto_verSwing { 
 public static void main (String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome:", "Login", 3);
        if (nome != null && !nome.trim().isEmpty()) {
            JPasswordField senhaField = new JPasswordField(10);
            int resultado = JOptionPane.showConfirmDialog(null, senhaField, "Digite sua senha:", 2, 3);
            if (resultado != 0) {
                JOptionPane.showMessageDialog(null, "Login cancelado.", "Aviso", 1);
            } else {
                String senha = new String(senhaField.getPassword());
                String USUARIO_CORRETO = "ADMIN";
                String SENHA_CORRETA = "1234";
                if (nome.trim().equalsIgnoreCase(USUARIO_CORRETO) && senha.equals(SENHA_CORRETA)) {
                    JOptionPane.showMessageDialog(null, "✅ Login bem-sucedido!\nBem-vindo, " + nome +
                            "!", "Sucesso", 1);
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

                     boolean executando = true;

                    while (executando) {
                        String opcao = JOptionPane.showInputDialog(null, "=== SISTEMA DE FUNCIONÁRIOS ===\nEscolha uma opção:" +
                                "\n1 - " + Func1 + " (Salário Base)\n2 - " + Func2 + " (Salário + Comissão)" +
                                "\n3 - " + Func3 + " (Salário + Bônus)\n0 - Sair\n\nDigite o número da opção:", "Menu de Funcionários", 3);
                        if (opcao != null && !opcao.trim().isEmpty()) {
                            switch (opcao.trim()) {
                                case "1":
                                    JOptionPane.showMessageDialog( null, "✅ FUNCIONÁRIO 1\nNome: " +Func1 +
                                            "\nMatrícula: "+matri1+"\nSalário: R$"+String.format("%.2f", Sal1), Func1, 1);
                                    break;
                                case "2":
                                            JOptionPane.showMessageDialog(null, "✅ FUNCIONÁRIO 2\nNome: "+Func2+
                                            "\nMatrícula: "+matri2+"\nVendas: R$ " + String.format("%.2f", vendas) + " x " + String.format("%.2f", porc) + "\nComissão: R$ " +
                                            String.format("%.2f", vendas * porc) + "\nSalário Total: R$ " + String.format("%.2f", Sal2), "Julia Pinheiro", 1);
                                    break;
                                case "3":
                                    JOptionPane.showMessageDialog(null, "✅ FUNCIONÁRIO 3\nNome: "+Func3+
                                            "\nMatrícula: " +matri3+ "\nBônus de Produtividade: R$ "+String.format("%.2f", Sal3 - Sal1)+"\nSalário Total: R$ "
                                            + String.format("%.2f", Sal3), "Alexandro Queiroz", 1);
                                    break;
                                case "0":
                                    JOptionPane.showMessageDialog(null, "Até logo! \ud83d\udc4b", "Encerrando", 1);
                                    executando = false;
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "⚠️ Opção inválida! Digite 1, 2, 3 ou 0.", "Erro", 0);
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "⚠️ Opção inválida! Digite 1, 2, 3 ou 0.", "Erro", 0);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "⚠️ Usuário ou senha incorretos!", "Erro", 0);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "⚠️ Usuário ou senha incorretos!", "Erro", 0);
        }
    }
}
                                