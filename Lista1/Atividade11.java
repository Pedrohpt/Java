/*
 11.	Desenvolva um bloco de código que leia um determinado número e verifique se ele é maior, igual ou menor do que zero. Imprima o resultado.
*/
public class atividade11 {
    public static void main(String[] args) {
        int numero = 12523;

        if(numero == 0) {
            System.out.println("O número " + numero + " é igual que 0");
        } 
        else if (numero > 0) {
            System.out.println("O número " + numero + " é maior que 0");
        } 
        else {
            System.out.println("O número " + numero + " é menor que 0");
        }
    }
    
}
