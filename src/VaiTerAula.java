/*Igor é professor de programação, e com a chegada do Natal, tempos de festas e viagens, em sua sala está
ocorrendo muitos imprevistos, tanto em número de alunos quanto com problemas nos computadores por conta das
férias do estagiário da TI. Jazon é um aluno muito dedicado e deseja ajudar seu professor, porém ainda é um
aspirante na programação, por isso pediu sua ajuda para contabilizar o número de computadores que estarão
funcionando em um dia específico desse mês natalino, e se é suficiente para o número total de alunos. Se o número
de computadores funcionais for insuficiente para o total de alunos, não haverá aula.
O aluno também falou alguns detalhes:
 Igor, o professor, sempre utiliza um dos computadores.
 Caio é muito desastrado e queimou um número X de computadores.
 Existe um número Y de computadores que não possuem compilador instalado.*/

import java.util.Scanner;

public class VaiTerAula {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numAlunos = leitor.nextInt();
        int numPc = leitor.nextInt();
        int qtsPcsQuebrados = leitor.nextInt();
        int qtsPcsSemComp = leitor.nextInt();
        int pcsFuncionais = numPc - qtsPcsSemComp - qtsPcsQuebrados - 1;
        if (numAlunos <= pcsFuncionais) {

            System.out.println("Igor feliz!");

        } else {
            if (qtsPcsQuebrados > (qtsPcsSemComp/2))
                System.out.println( "Caio, a culpa eh sua!" );
            else
                System.out.println( "Igor bolado!" );
        }
    }
}
