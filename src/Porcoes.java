import java.util.Scanner;
   /* Os meses de Junho e Julho são tradicionalmente conhecidos por todo Brasil por suas festas típicas,
   e para o grupo de amigos da Marlene não é diferente, toda segunda quinzena do mês de Julho ela e seus amigos
   se reunem para tradicional mandiocada! Na festiva sempre se reúnem na casa da Marlene, o Chico, o Beto, o
   Bernardo, a Marina e a Iara. E como não poderia ser diferente o prato principal dessa reunião é a mandioca.
   Cada um deles come de uma a dez porções de mandioca e eles sempre avisam a Marlene com antecedência a respeito
   de quantas porções irão comer nesse dia. O tamanho da porção de cada um é diferente, mas sempre são os mesmos.
   As porções são as seguintes (em gramas):
    O Chico come 300
    O Bento come 1500
    O Bernardo come 600
    A Marina 1000
   A Iara come 150
   Marlene por sua vez sempre come 225 gramas de mandioca. Cansado de todo ano ter que calcular quanta mandioca
   preparar ela te desafiou para escrever um programa que informe quanta mandioca deve ser preparada em gramas.*/
   public class Porcoes {
    public static final int[] porcoes = { 300, 1500, 600, 1000, 150 };

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int somaGramas = 0;

        for (int porcao : porcoes) {
            somaGramas += (porcao * leitor.nextInt());
        }

        System.out.println(somaGramas + 225);

//        int chico = (leitor.nextInt()* 300);
//        int bento = (leitor.nextInt()* 1500);
//        int bernardo = (leitor.nextInt()* 600);
//        int marina = (leitor.nextInt()* 1000);
//        int iara = (leitor.nextInt()* 150);
//        System.out.println(chico + bento + bernardo + marina + iara + 225);
    }
}
