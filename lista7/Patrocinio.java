public class Patrocinio {
    private String patrocinador;
    private int duracao;
    private double ValorPatrocinio;
    private double ValorPatrocinioTaxa;
    private double Taxa;
    
    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setValorPatrocinio(double valorPatrocinio) {
        this.ValorPatrocinio = valorPatrocinio;
    }

    public double getValorPatrocinio() {
        return ValorPatrocinio;
    }
    
    public void setValorPatrocinioTaxa(double valorPatrocinioTaxa) {
        this.ValorPatrocinioTaxa = valorPatrocinioTaxa;
    }

    public double getValorPatrocinioTaxa() {
        return ValorPatrocinioTaxa;
    }

    public void setTaxa(double taxa) {
        this.Taxa = taxa;
    }

    public double getTaxa() {
        return Taxa;
    }

    public void TaxaPatrocinio(){
        this.ValorPatrocinioTaxa = (this.ValorPatrocinio + ((this.ValorPatrocinio * this.Taxa) / 100));
    }
}
