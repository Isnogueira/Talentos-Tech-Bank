package dia1;

import java.util.Scanner;

public class Exercicios {

    public static Scanner ler() {
        Scanner in = new Scanner(System.in);

        return in;
    }

    public static void exercicio01() {

        short y = 99;
        short z = 11;
        short coringa;

        System.out.println("Valor de y antes da troca: " + y);
        System.out.println("Valor de z antes da troca: " + z);
        System.out.println("--------------------------------");

        coringa = y;
        y = z;
        z = coringa;

        System.out.println("Valor de y depois da troca: " + y);
        System.out.println("Valor de z depois da troca: " + z);
    }

    public static void exercicio02(){

        System.out.println("Digite um número: ");

        int num = ler().nextInt();

        System.out.println(num <= 0 ? "Número inválido!" : "O antecessor do número " + num + " é o " + --num + ".");

        ler().close();
    }

    public static void exercicio03(){

        System.out.println("Digite o valor da base do retângulo:");
        float base = ler().nextFloat();

        System.out.println("Digite o valor da altura do retângulo: ");
        float altura = ler().nextFloat();

        float area = base * altura;

        System.out.println("A área do triangulo de base " + base + " e altura " + altura + " é " + area + ".");

        ler().close();
    }

    public  static void exercicio04(){

        System.out.println("Informe o total de votos:");
        int totalVotos = ler().nextInt();

        System.out.println("Informe os votos válidos:");
        int votosValidos = ler().nextInt();

        System.out.println("Informe os votos em branco:");
        int votosEmBranco = ler().nextInt();

        System.out.println("Informe os votos nulos: ");
        int votosNulos = ler().nextInt();

        System.out.println("A quantidade de votos é: " + totalVotos);
        System.out.println("A quantidade de votos brancos é: " + votosEmBranco);
        System.out.println("A quantidade de votos nulos é: " + votosNulos);
        System.out.println("A quantidade de votos válidos é: " + votosValidos);

        double percentualVotosEmBranco;
        double percentualVotosNulos;
        double percentualVotosValidos;

        percentualVotosEmBranco = votosEmBranco * 100 / totalVotos;
        percentualVotosNulos = votosNulos * 100 / totalVotos;
        percentualVotosValidos = votosValidos * 100 / totalVotos;

        System.out.println("=========================================");
        System.out.println("Percentual de votos em branco: " + percentualVotosEmBranco + "%");
        System.out.println("Percentual de votos nulos: " + percentualVotosNulos + "%");
        System.out.println("Percentual de votos válidos: " + percentualVotosValidos + "%");


    }

    public static void main(String[] args) {
        exercicio01();
        System.out.println("=================================================");
        exercicio02();
        System.out.println("=================================================");
        exercicio03();
        System.out.println("=================================================");
        exercicio04();
    }
}
