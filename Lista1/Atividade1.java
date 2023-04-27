/*
1.Conforme vimos em nossa aula introdutória, podemos criar um programa Java utilizando até mesmo o bloco de notas e executar pelo CMD. Basta seguir alguns passos como salvar o arquivo com o mesmo nome da classe, inserir neste arquivo a extensão ( .java ), gerar um ( .class ). Com base nestes conceitos, desenvolva um bloco de código capaz de realizar a soma de dois números inteiros quaisquer. Exibir o resultado no console.
 */
class atividade1{
    public static void main(String [] args) {
        int numero1 = 5;
        int numero2 = 6;
        int resultado = (numero1 + numero2);

        System.out.println(numero1 + " + " + numero2 + " = " + resultado);
        
    }
}
