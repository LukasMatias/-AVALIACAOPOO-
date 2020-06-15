package gerenciadorcarrodealuguel;

import java.util.Scanner;

/**
 *
 * @author lukas
 */
public class GerenciadorCarroDeAluguel {

    private static Operacao op = new Operacao();
    

    public static void main(String[] args) {
        boolean sair = false;
        while (!sair) {
            System.out.println("1 - Cadastrar um veiculo");
            System.out.println("2 - Vender um carro");
            System.out.println("3 - retirada do carro");
            System.out.println("4 - devolução do carro");
            System.out.println("5 - Sair do sistema");
            System.out.println("Escolha a opção desejada:");
            Scanner s = new Scanner(System.in);
            int opcao = s.nextInt();

            switch (opcao) {
                case 1:
                    op.cadastrar();
                    break;
                case 2:
                    op.venda();
                    break;
                case 3:
                    op.listarCarros();
                    break;
                case 4:
                    op.devolverCarro();
                    break;
                case 5:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

 
    public static void retirarCarro() {
        
                 
         
    }

    public static void devolverCarro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
