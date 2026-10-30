package Package_Trabalhos;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Projeto_verSwing { 
 public static void main (String[] args) {
        
    String NAME = JOptionPane.showInputDialog(null, "Enter your name:", "Login", 3);
        
        if (NAME != null && !NAME.trim().isEmpty()) {
            JPasswordField senhaField = new JPasswordField(10);
            int resultado = JOptionPane.showConfirmDialog(null, senhaField, "Enter your password:", 2, 3);
            if (resultado != 0) {
                JOptionPane.showMessageDialog(null, "Login canceled.", "Warning", 1);
            } else {
                String password = new String(senhaField.getPassword());
                String CORRECT_USER = "ADMIN";
                String CORRECT_PASSWORD = "1234";
                if (NAME.trim().equalsIgnoreCase(CORRECT_USER) && password.equals(CORRECT_PASSWORD)) {
                    JOptionPane.showMessageDialog(null, "✅ Login successful!\nWelcome, " + NAME +
                            "!", "Success", 1);
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
                        String opcao = JOptionPane.showInputDialog(null, "=== EMPLOYEE MANAGEMENT SYSTEM ===\nChoose an option:" +
                                "\n1 - " + Func1 + " (Base Salary)\n2 - " + Func2 + " (Salary + Commission)" +
                                "\n3 - " + Func3 + " (Salary + Bonus)\n0 - Exit\n\nEnter the option number:", "Employee Menu", 3);
                        if (opcao != null && !opcao.trim().isEmpty()) {
                            switch (opcao.trim()) {
                                case "1":
                                    JOptionPane.showMessageDialog( null, "✅ STANDARD EMPLOYEE\nName: " +Func1 +
                                            "\nEmployee ID: "+matri1+"\nSalary: R$"+String.format("%.2f", Sal1), Func1, 1);
                                    break;
                                case "2":
                                            JOptionPane.showMessageDialog(null, "✅ COMMISSION EMPLOYEE\nName: "+Func2+
                                            "\nEmployee ID: "+matri2+"\nSales: R$ " + String.format("%.2f", vendas) + " x " + String.format("%.2f", porc) + "\nCommission: R$ " +
                                            String.format("%.2f", vendas * porc) + "\nTotal Salary: R$ " + String.format("%.2f", Sal2), "Julia Pinheiro", 1);
                                    break;
                                case "3":
                                    JOptionPane.showMessageDialog(null, "✅ PRODUCTION EMPLOYEE\nName: "+Func3+
                                            "\nEmployee ID: " +matri3+ "\nProductivity Bonus: R$ "+String.format("%.2f", Sal3 - Sal1)+"\nTotal Salary: R$ "
                                            + String.format("%.2f", Sal3), "Alexandro Queiroz", 1);
                                    break;
                                case "0":
                                    JOptionPane.showMessageDialog(null, "See you later! \ud83d\udc4b", "Ending", 1);
                                    executando = false;
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "⚠️ Invalid option! Please enter 1, 2, 3 or 0.", "Error", 0);
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "⚠️ Invalid option! Please enter 1, 2, 3 or 0.", "Error", 0);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "⚠️ Invalid username or password!", "Error", 0);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "⚠️ Invalid username or password!", "Error", 0);
        }
    }
}
                                