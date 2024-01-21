import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o coeficiente a:");
        Float coefA = Float.valueOf(scanner.nextLine());
        System.out.println("Digite o coeficiente b:");
        Float coefB = Float.valueOf(scanner.nextLine());
        System.out.println("Digite o coeficiente c:");
        Float coefC = Float.valueOf(scanner.nextLine());
        x1(coefA,coefB,coefC);
        x2(coefA,coefB,coefC);
        delta(coefA,coefB,coefC);
    }

    private static void delta(Float coefA, Float coefB, Float coefC) {
        double delta = Math.pow(-coefB,2) * -4 * coefA * coefC;
        if(delta < 0){
            System.out.println("Esta equacao nao possui raizes reais");
        }
    }

    private static void x1(Float coefA, Float coefB, Float coefC) {

        double x1 = (-coefB + Math.sqrt(Math.pow(coefB,2) - 4 * coefA * coefC)) / (2 * coefA);
        System.out.println("X1 = " +x1);
    }
    private static void x2(Float coefA, Float coefB, Float coefC) {
        double x2 = (-coefB - Math.sqrt(Math.pow(coefB,2) - 4 * coefA * coefC)) / (2 * coefA);
        System.out.println("X2 = " +x2);
    }


}

/**
 * Problema "baskara"
 * Fazer um programa para ler os três coeficientes de uma equação do segundo grau. Usando a fórmula
 * de Baskara, calcular e mostrar os valores das raízes x1 e x2 da equação com quatro casas decimais,
 * conforme exemplo. Se a equação não possuir raízes reais, mostrar uma mensagem.
 * Exemplo 1:
 * Coeficiente a: 1
 * Coeficiente b: 0
 * Coeficiente c: -9
 * X1 = 3.0000
 * X2 = -3.0000
 * Exemplo 2:
 * Coeficiente a: 2
 * Coeficiente b: -4.5
 * Coeficiente c: 1.7
 * X1 = 1.7697
 * X2 = 0.4803
 * Exemplo 3:
 * Coeficiente a: 1
 * Coeficiente b: 3
 * Coeficiente c: 4
 * Esta equacao nao possui raizes reais
 *
 */