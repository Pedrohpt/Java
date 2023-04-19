class Pessoa {
    String nome;
    double peso;
    double estatura;
    int idade;
    String olhos;
    String cabelos;
    Curso curso;

    void recebeDadosPessoa(String nome, Double peso, Double estatura, int idade, String olhos, String cabelos, Curso curso) {
        this.nome = nome;
        this.peso = peso;
        this.estatura = estatura;
        this.idade = idade;
        this.olhos = olhos;
        this.cabelos = cabelos;
        this.curso = curso;
    }

}