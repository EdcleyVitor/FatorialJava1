import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número para calcular o fatorial: ");
        int numeroOriginal = scanner.nextInt();
        int n = numeroOriginal;
        long fatorial = 1;
        
        // Se o número for negativo, o fatorial não é definido para inteiros comuns
        if (n < 0) {
            System.out.println("Não existe fatorial de número negativo.");
        } else {
            System.out.print(n + "! = ");
            
            if (n == 0 || n == 1) {
                System.out.print("1 = 1");
            } else {
                // Usamos um laço para calcular e mostrar a sequência
                for (int i = 1; i <= n; i++) {
                    fatorial *= i;
                    
                    System.out.print(i);
                    
                    // Adiciona o símbolo de multiplicação se não for o último número
                    if (i < n) {
                        System.out.print(" * ");
                    }
                }
                System.out.print(" = " + fatorial);
            }
        }
        
        System.out.println(); // Quebra de linha final

        System.out.println("Deseja Calcular o resultado outro valor s/n? ");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("s")) {
                System.out.print("1(+),2(-),3(*),4(/): ");
                int operacao = scanner.nextInt();
                if (operacao == 1){
                    System.out.println("Soma");
                    System.out.print("Digite o valor: ");
                    int valor = scanner.nextInt();

                    System.out.println("Resultado: " + (fatorial + valor));
                }
                else if (operacao == 2){
                    System.out.println("Subtração");
                    System.out.print("Digite o valor: ");
                    int valor = scanner.nextInt();

                    System.out.println("Resultado: " + (fatorial - valor));
                }
                else if (operacao == 3){
                    System.out.println("Multiplicação");
                    System.out.print("Digite o valor: ");
                    int valor = scanner.nextInt();

                    System.out.println("Resultado: " + (fatorial * valor));
                }
                else if (operacao == 4){
                    System.out.println("Divisão");
                    System.out.print("Digite o valor: ");
                    int valor = scanner.nextInt();

                    if (valor != 0) {
                        System.out.println("Resultado: " + (fatorial / valor));
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
                }
                else {
                    System.out.println("Operação inválida.");
                }
                System.out.println("Deseja repetir o systema s/n? ");
                resposta = scanner.next();
                if (resposta.equalsIgnoreCase("s")) {
                    main(args); // Chama o método main novamente para reiniciar o programa
                }
            } else {
                System.out.println("Programa encerrado.");
                scanner.close();
            }
            
    }
}
