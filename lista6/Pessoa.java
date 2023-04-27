class Pessoa {
    private String nome;
    private double peso;
    private double estatura;
    private int idade;
    private String olhos;
    private String cabelos;
    private Curso curso;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPeso(){
        return this.peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getEstatura(){
        return this.estatura;
    }

    public void setEstatura(double estatura){
        this.estatura = estatura;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getOlhos(){
        return this.olhos;
    }

    public void setOlhos(String olhos){
        this.olhos = olhos;
    }

    public String getCabelos(){
        return this.cabelos;
    }

    public void setCabelos(String cabelos){
        this.cabelos = cabelos;
    }

    public Curso getCurso(){
        return this.curso;
    }

    public void setCurso(Curso curso){
        this.curso = curso;
    }

    // void recebeDadosPessoa(String nome, Double peso, Double estatura, int idade, String olhos, String cabelos, Curso curso) {
    //     this.nome = nome;
    //     this.peso = peso;
    //     this.estatura = estatura;
    //     this.idade = idade;
    //     this.olhos = olhos;
    //     this.cabelos = cabelos;
    //     this.curso = curso;
    // }

}