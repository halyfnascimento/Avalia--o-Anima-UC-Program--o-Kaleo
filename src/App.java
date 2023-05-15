
/*Aluno: Kaleo Halyf do Nascimento Pinto
 * RA:1272316291
 * Nome do Programa: Calculo de Hidatração.
 * Linguagem De Programação: Java
 */
import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        // Declaração de Variaveis e Scanner.
        String nome;
        double peso;
        double aguaIngerida;
        double aguaIdeal;
        double aguaAingerir;

        Scanner teclado = new Scanner(System.in);

        // Entradas.
        System.out.println("Informe seu Nome.");
        nome = teclado.next();
        System.out.println("Informe seu peso em KG.");
        peso = teclado.nextDouble();
        System.out.println("Informe a quantidade de agua que voce ingere por dia.");
        aguaIngerida = teclado.nextDouble();
        System.out.println("");
        teclado.close();

        // Processamento.
        aguaIdeal = Math.ceil(peso * 35) / 1000;
        aguaIdeal = Math.ceil(aguaIdeal);
        aguaAingerir = Math.ceil(aguaIdeal - aguaIngerida);

        // Saida
        System.out.println("Informações do Funcionário");
        System.out.println("Nome:" + nome);
        System.out.println("Peso:" + peso + " KG");
        System.out.println("Agua Ingerida:" + aguaIngerida + " Litros");
        System.out.println("Quantidade ideal a ser ingerida:" + aguaIdeal + " Litros");

        if (aguaIngerida >= aguaIdeal) {
            System.out.println("Parabéns, você atingiu a meta de hidratação diária.");

        } else {
            System.out.println("");
            System.out.printf("Continue focado em se hidratar por hoje, ainda faltam [%2f] litros! Você consegue!",
                    aguaAingerir);
        }
    }
}
