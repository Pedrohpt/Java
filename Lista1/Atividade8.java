/*
8.	Utilizando o casting, faça com que um salário de R$3.890,78 seja armazenado em uma variável do tipo inteiro.
*/
public class Atividade8 {
    public static void main(String[] args) {
        double salario = 3890.78;
        int salarioInt = (int) salario;

        System.out.println("R$" + salario);
        System.out.println("R$" + salarioInt);

    }
        
}
