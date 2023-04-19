class Curso {
    int idCurso;
    String nomeCurso;
    String nomeProfessor;
    int cargaHoraria;

    void recebeDadosCurso(int idCurso, String nomeCurso, String nomeProfessor, int cargaHoraria) {
        this.idCurso = idCurso;
        this.nomeCurso = nomeCurso;
        this.nomeProfessor = nomeProfessor;
        this.cargaHoraria = cargaHoraria;
    }
}
