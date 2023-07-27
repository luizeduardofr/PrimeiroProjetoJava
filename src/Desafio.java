import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Luiz Eduardo";
        String tipoConta = "Corrente";
        double saldo = 1600.00;
        int opcao = 0;

        System.out.println("\n*******************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("\n*******************************\n");

        String menu = """
                      ** Digite sua opção **
                      1 - Consultar Saldo
                      2 - Transferir Valor
                      3 - Receber Valor
                      4 - Sair
                      
                      """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("\nSeu saldo é : " + saldo);
            } else if (opcao == 2) {
                System.out.println("\nQual o valor que deseja transferir: ");
                double valor = leitura.nextDouble();

                if (valor > saldo) {
                    System.out.println("\nNão há saldo suficiente! ");
                } else {
                    saldo -= valor;
                    System.out.println("\nSaldo Atualizado: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("\nValor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("\nSaldo Atualizado: " + saldo);
            } else if (opcao != 4){
                System.out.println("\nMensagem inválida!! ");
            }
        }
    }
}
