import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = -1;
        double numero1;
        double numero2;
        double resultado;

        System.out.println("====================================");
        System.out.println("          CALCULADORA JAVA");
        System.out.println("====================================");

        // O programa continua funcionando até o usuário escolher a opção 0.
        while (opcao != 0) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Potência");
            System.out.println("6 - Raiz quadrada");
            System.out.println("7 - Porcentagem");
            System.out.println("8 - Média de dois números");
            System.out.println("0 - Sair");
            System.out.print("\nDigite a opção: ");

            // Verifica se o usuário digitou um número inteiro.
            if (teclado.hasNextInt()) {
                opcao = teclado.nextInt();
            } else {
                System.out.println("\nDigite somente o número da opção!");
                teclado.next();
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    numero1 = teclado.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    numero2 = teclado.nextDouble();

                    resultado = numero1 + numero2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 2:
                    System.out.print("Digite o primeiro número: ");
                    numero1 = teclado.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    numero2 = teclado.nextDouble();

                    resultado = numero1 - numero2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 3:
                    System.out.print("Digite o primeiro número: ");
                    numero1 = teclado.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    numero2 = teclado.nextDouble();

                    resultado = numero1 * numero2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 4:
                    System.out.print("Digite o primeiro número: ");
                    numero1 = teclado.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    numero2 = teclado.nextDouble();

                    // Não existe divisão por zero.
                    if (numero2 == 0) {
                        System.out.println("Erro: não é possível dividir por zero.");
                    } else {
                        resultado = numero1 / numero2;
                        System.out.println("Resultado: " + resultado);
                    }
                    break;

                case 5:
                    System.out.print("Digite a base: ");
                    numero1 = teclado.nextDouble();
                    System.out.print("Digite o expoente: ");
                    numero2 = teclado.nextDouble();

                    resultado = Math.pow(numero1, numero2);
                    System.out.println("Resultado: " + resultado);
                    break;

                case 6:
                    System.out.print("Digite um número: ");
                    numero1 = teclado.nextDouble();

                    if (numero1 < 0) {
                        System.out.println("Erro: não existe raiz real de número negativo.");
                    } else {
                        resultado = Math.sqrt(numero1);
                        System.out.println("Resultado: " + resultado);
                    }
                    break;

                case 7:
                    System.out.print("Digite a porcentagem: ");
                    numero1 = teclado.nextDouble();
                    System.out.print("Digite o valor total: ");
                    numero2 = teclado.nextDouble();

                    resultado = (numero1 / 100) * numero2;
                    System.out.println(numero1 + "% de " + numero2 + " = " + resultado);
                    break;

                case 8:
                    System.out.print("Digite o primeiro número: ");
                    numero1 = teclado.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    numero2 = teclado.nextDouble();

                    resultado = (numero1 + numero2) / 2;
                    System.out.println("Média: " + resultado);
                    break;

                case 0:
                    System.out.println("\nCalculadora encerrada!");
                    break;

                default:
                    System.out.println("\nOpção inválida!");
            }
        }

        teclado.close();
    }
}
