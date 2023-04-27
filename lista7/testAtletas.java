public class testAtletas {
    public static void main(String[] args) {
        atleta caio = new atleta();
        atleta joana = new atleta();

        Patrocinio redBull = new Patrocinio();
        Patrocinio nissan = new Patrocinio();


        redBull.setPatrocinador("Red Bull");
        redBull.setDuracao(3);
        redBull.setTaxa(15);
        redBull.setValorPatrocinio(200500.00);

        nissan.setPatrocinador("Nissan");
        nissan.setDuracao(4);
        nissan.setTaxa(10);
        nissan.setValorPatrocinio(120300.00);


        caio.setCodigo(1241);
        caio.setNome("Caio");
        caio.setIdade(23);
        caio.setEsporte("Muay Thai");
        caio.setEndereco("Norte de Minas");
        caio.setPatrocinio(nissan);

        joana.setCodigo(3464);
        joana.setNome("Joana");
        joana.setIdade(24);
        joana.setEsporte("Surf");
        joana.setEndereco("litoral norte de São Paulo");
        joana.setPatrocinio(redBull);

        
        redBull.TaxaPatrocinio();
        nissan.TaxaPatrocinio();

        caio.imprimeDados();
        joana.imprimeDados();
    }
}
