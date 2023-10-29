import tech.marcellaacrg.entity.Funcionario;
import tech.marcellaacrg.entity.Pessoa;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");


        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        System.out.println(pessoa.cadastrar("Marcella Araújo", "17/07/1985","Walda Cruz Cordeiro, 1 ", "83998022155"));
        System.out.println("Idade: " + pessoa.obterIdade(17,07,1985) + " anos");
        System.out.println("Aumento salarial de 30%: R$ " + funcionario.reajustarSalario(5000));
        System.out.println("Novo cargo: " + funcionario.promover("Gerente"));





          /*int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Em que ano estamos?"));
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Em que ano você nasceu?"));
        int idade = anoAtual-anoNascimento;
        JOptionPane.showMessageDialog(null,"Voce tem:" + idade);*/

    }

}