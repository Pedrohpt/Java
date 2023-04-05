/*
 5.	Desenvolva um algoritmo capaz de armazenar o nome, peso e estatura de uma determinada pessoa. Calcule e imprima IMC desta pessoa. 
IMC = peso / altura ².
*/
public class Atividade5 {
    public static void main(String[] args) {
        String nome = "Pedro";
        double peso = 80;
        double altura = 1.85;
        double resultado = (peso / (altura * altura));
        
        System.out.printf(nome + " Seu IMC é: %.2f", resultado);

        
        
        
    }
}
