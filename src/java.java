import java.util.Arrays;
import java.util.Scanner;

class OrdenarNomes {

    public static void main(String[] args) {
        // Criação do objeto Scanner para ler dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para digitar os nomes separados por vírgula
        System.out.print("Digite os nomes separados por vírgula: ");
        String input = scanner.nextLine();

        // Verifica se a entrada está vazia
        if (input.trim().isEmpty()) {
            System.out.println("Nenhum nome foi inserido.");
            scanner.close();
            return;
        }

        // Divide a string de entrada em um array de nomes, usando a vírgula como separador
        String[] nomes = input.split(",");

        // Exibe a entrada original e os nomes após a divisão
        System.out.println("Entrada original: " + input);
        System.out.println("Nomes após divisão:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Remove espaços extras que possam estar nos nomes
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = nomes[i].trim();
        }

        // Ordena o array de nomes em ordem alfabética
        Arrays.sort(nomes);

        // Imprime os nomes ordenados
        System.out.println("Nomes ordenados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Fecha o scanner
        scanner.close();
    }
}
