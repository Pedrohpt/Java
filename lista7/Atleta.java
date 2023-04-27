class atleta {
    private int codigo;
    private String nome;
    private int idade;
    private String esporte;
    private String endereco;
    private Patrocinio patrocinio;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    public String getEsporte() {
        return esporte;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setPatrocinio(Patrocinio patrocinio) {
        this.patrocinio = patrocinio;
    }

    public Patrocinio getPatrocinio() {
        return patrocinio;
    }

    public void imprimeDados() {
        System.out.println(
            "Código: " + this.codigo + "\n" + 
            "nome: " + this.nome + "\n" + 
            "Idade: " + this.idade + "\n"+ 
            "Esporte: " + this.esporte + "\n" + 
            "Endereço: " + this.endereco + "\n" +
            "Patrocinador: " + this.patrocinio.getPatrocinador() + "\n" +
            "Duração do patrocinio: "+ this.patrocinio.getDuracao() + " anos" + "\n" + 
            "Valor do patrocinio: "+ this.patrocinio.getValorPatrocinio() + "\n" + 
            "Valor do patrocinio: "+ this.patrocinio.getValorPatrocinioTaxa() + "\n");
    }

}