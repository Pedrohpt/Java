class Curso {
    private int idCurso;
    private String nomeCurso;
    private String nomeProfessor;
    private int cargaHoraria;

    public int getIdCurso(){
        return this.idCurso;
    }

    public void setIdCurso(int idCurso){
        this.idCurso = idCurso;
    }

    public String getNomeCurso(){
        return this.nomeCurso;
    }

    public void setNomeCurso(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }

    public String getNomeProfessor(String nomeProfessor){
        return this.nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor){
        this.nomeProfessor = nomeProfessor;
    }

    public int getCargaHoraria(){
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    // void recebeDadosCurso(int idCurso, String nomeCurso, String nomeProfessor, int cargaHoraria) {
    //     this.idCurso = idCurso;
    //     this.nomeCurso = nomeCurso;
    //     this.nomeProfessor = nomeProfessor;
    //     this.cargaHoraria = cargaHoraria;
    // }
}
