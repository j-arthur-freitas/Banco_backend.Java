import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroDigitado = 0;
        double saldoAtual = -1;
        double adicionarSaldo = 0;
        double diminuirSaldo = 0;



        System.out.print("Digite seu nome completo: ");
        String nome = input.nextLine();

        while (true){
            System.out.print("Digite seu CPF (apenas  números): ");
            String cpf = input.nextLine();
            if (cpf.length() == 11 && cpf.matches("\\d+")){
                break;
            }
            else {
                System.out.println("Seu CPF está incorreto, tente novamente: ");
            }
        }
        while (saldoAtual < 0 || saldoAtual > 1000000) {
            System.out.print("Digite seu saldo (entre 0 e 1.000.000): ");
            saldoAtual = input.nextDouble();

            if (saldoAtual < 0 || saldoAtual > 1000000) {
                System.out.println("Erro! O valor deve ser entre 0 e 1.000.000.");
            }
        }
        System.out.println("**********************************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("Nome:   " +nome);
        System.out.println("Saldo inicial:  R$"+saldoAtual);
        System.out.println("********************************** ");
        System.out.println("Operações\n");

        while (numeroDigitado != 4){
            System.out.println(" 1- Consultar saldos");
            System.out.println(" 2- Receber valor");
            System.out.println(" 3- Transferir valor");
            System.out.println(" 4- Sair");

            System.out.println("\nDigite o NÚMERO da opção desejada: ");
            numeroDigitado = input.nextInt();
            if (numeroDigitado < 1 || numeroDigitado > 4){
                System.out.println("Digite uma opção válida!");
            }

            if (numeroDigitado == 1){
                System.out.println("**********************************");
                System.out.println("Saldo atual:  "+saldoAtual);
                System.out.println("********************************** ");
            }
            if (numeroDigitado == 2){
                System.out.println("Digite o valor que deve receber: ");
                adicionarSaldo = input.nextDouble();
                saldoAtual += adicionarSaldo;
                System.out.println("O seu novo saldo é: R$" +saldoAtual);

            }
            if (numeroDigitado == 3){
                System.out.println("Digite o valor que deve transferir: ");
                diminuirSaldo = input.nextDouble();
                saldoAtual -= diminuirSaldo;


                if (diminuirSaldo > saldoAtual){
                    System.out.println("Seu saldo não é suficiente para á tranferência!");
                } else {
                    System.out.println("O seu novo saldo é: R$" + saldoAtual);
                }


            }


        }


    }
}



