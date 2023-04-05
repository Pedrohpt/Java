/*
 3.	Carlos Eduardo fará aniversário no próximo fim de semana. Ele resolveu celebrar com uma festa e convidou algumas pessoas. Para curtir a festa do Carlos é preciso ser maior de 21 anos, ser amigo(a) dele e ter recebido o convite. Desenvolva um algoritmo que verifique estas informações e decida se a pessoa poderá ou não curtir este dia com o Carlos, imprimindo a seguinte saída: “Bem vindo(a) NOME_da_PESSOA, aproveite a festa”. Caso contrário “NOME_da_PESSOA, você é um penetra. Volte para casa”.
 */
public class Atividade3 {
    public static void main(String [] args) {
        String nome = "Pedro";
        int idade = 19;
        String amigo = "sim";
        String convite = "sim";
        
        if(amigo == "sim" && idade >= 21 && convite == "sim"){
            System.out.println("Bem vindo " + nome);
        }
        else {
            System.out.println(nome + " você é um penetra. Volte para casa");
        }

    }
}
