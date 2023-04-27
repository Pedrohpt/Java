/*
 6.	Desenvolva um algoritmo que verifique se um determinado número é igual a cem. Caso seja maior, imprima: “Número muito grande”.
*/
public class atividade6{
    public static void main(String[] args) {
        int numero = 100;

        if(numero == 100) {
            System.out.println("100");

        }
        else if(numero > 100){
            System.out.println("Número muito grande");

        }
        else{
            System.out.println("Número muito pequeno");

        }
    }
}
