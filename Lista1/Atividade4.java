/* 
4.	O pai de Carlos Eduardo, o senhor João fará 100 anos em Abril de 2023. Desenvolva um algoritmo capaz de imprimir na tela a seguinte mensagem:
“Parabéns senhor João pelo aniversário de nº 1”
...
*/
public class atividade4 {
    public static void main(String[] args) {
        int idade = 100;
        int i = 0;

        while (i < idade) {
            System.out.println("Parabéns senhor João pelo aniversário de nº" + (i+1));
            i++;
        }

    }
}
