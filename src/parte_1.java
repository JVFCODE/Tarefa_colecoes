import java.util.Arrays;
import java.util.Scanner;

class parte_1 {  // Removido o 'public' aqui

    public static void main(String[] args) {
        // Criação do objeto Scanner para ler dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para digitar os nomes e sexos, separados por vírgula
        System.out.print("Digite os nomes e sexos (nome-sexo) separados por vírgula: ");
        String input = scanner.nextLine();

        // Divide a string de entrada em um array de nomes e sexos, usando a vírgula como separador
        String[] pessoas = input.split(",");

        // Exibe a entrada original e as pessoas após a divisão
        System.out.println("Entrada original: " + input);
        System.out.println("Pessoas após divisão:");
        for (String pessoa : pessoas) {
            System.out.println(pessoa);
        }

        // Ordena o array de pessoas em ordem alfabética
        Arrays.sort(pessoas);

        // Imprime as pessoas ordenadas
        System.out.println("Pessoas ordenadas:");
        for (String pessoa : pessoas) {
            System.out.println(pessoa);
        }

        // Fecha o scanner
        scanner.close();
    }
}
