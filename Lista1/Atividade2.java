/*
 2.	Desenvolva um novo bloco de código capaz de verificar a idade de uma determinada pessoa.  Caso a idade seja maior ou igual a 18 anos, imprima a seguinte saída: “Acesso Liberado”. Caso contrário, “Volte para Casa”. Utilize o console para visualizar a saída.
 */
class Atividade2{
    public static void main(String [] args) {
        int idade = 15;

        if(idade >= 18) {
            System.out.println("Acesso liberado");
        }

        else {
            System.out.println("Volte para Casa");
        }
        
    }
}
