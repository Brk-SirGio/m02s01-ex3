import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo (em segundos) que o veículo levou para percorrer 1 metro: ");
        double tempo = scanner.nextDouble();

        // Distância entre as placas
        double distancia = 1.0; // em metros

        // Calcula a velocidade média (em metros por segundo)
        double velocidadeMedia = calcularVelocidadeMedia(distancia, tempo);

        // Exibe a velocidade média
        System.out.printf("A velocidade média do veículo é %.2f metros por segundo.%n", velocidadeMedia);

        // Fecha o scanner
        scanner.close();
    }

    // Método para calcular a velocidade média
    public static double calcularVelocidadeMedia(double distancia, double tempo) {
        // Validação se o tempo é maior que zero para evitar divisão por zero
        if (tempo <= 0) {
            throw new IllegalArgumentException("O tempo deve ser maior que zero.");
        }

        return distancia / tempo;
    }}