import java.util.Scanner;

public class ControleTrocoPadaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        System.out.print("Digite o valor pago: ");
        double valorPago = scanner.nextDouble();

        // Validação
        if (valorPago < valorCompra) {
            System.out.println("Valor insuficiente para realizar suas compras!");
        } else {
            double troco = valorPago - valorCompra;

            System.out.println("\nCliente: " + nome);
            System.out.println("Valor da compra: R$ " + valorCompra);
            System.out.println("Valor pago: R$ " + valorPago);
            System.out.println("Troco: R$ " + troco);

            int restante = (int) troco;

            int[] notas = {200, 100, 50, 20, 10, 5, 2, 1};

            System.out.println("Notas:");

            for (int nota : notas) {
                int quantidade = restante / nota;
                if (quantidade > 0) {
                    System.out.println(quantidade + "x R$" + nota);
                    restante = restante % nota;
                }
            }
        }

        scanner.close();
    }
}