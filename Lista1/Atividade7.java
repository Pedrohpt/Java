/* 
7.	Com base nos conceitos relacionados ao processo avaliativo do Senac, sendo: Apto (A), Não Apto (NA) e Parcialmente Apto (PA). Desenvolva um algoritmo capaz de imprimir se um determinado aluno(a) está aprovado(apto), de recuperação (parcialmente apto) ou reprovado (não apto) em uma determinada UC.
*/
public class atividade7 {
    public static void main(String[] args) {
        String nome = "Pedro";
        String nota = "A";

        if (nota == "A") {
            System.out.println(nome + ", você foi aprovado(a).");
        } else if (nota == "PA") {
            System.out.println(nome + ", você está de recuperação.");
        } else {
            System.out.println(nome + ", você está reprovao(a).");
        }

    }
}
