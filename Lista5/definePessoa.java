public class definePessoa {
    public static void main(String[] args) {

        Curso curso = new Curso();

        Pessoa pedro = new Pessoa();
        Pessoa pedro2 = new Pessoa();
        Pessoa pedro3 = new Pessoa();
        Pessoa pedro4 = new Pessoa();
        Pessoa pedro5 = new Pessoa();

        curso.recebeDadosCurso(4532, "Técnico em Informática", "Nalysson", 3);

        pedro.recebeDadosPessoa("Pedro", 85.0, 1.85, 19, "castanhos", "castanhos", curso);
        pedro2.recebeDadosPessoa("Pedro2", 86.0, 1.86, 20, "castanhos", "castanhos", curso);
        pedro3.recebeDadosPessoa("Pedro3", 87.0, 1.87, 21, "castanhos", "castanhos", curso);
        pedro4.recebeDadosPessoa("Pedro4", 88.0, 1.88, 22, "castanhos", "castanhos", curso);
        pedro5.recebeDadosPessoa("Pedro5", 89.0, 1.89, 23, "castanhos", "castanhos", curso);

        System.out.println("Olá, meu nome é: " + pedro.nome + "." + " Tenho " + pedro.idade + " anos, " + pedro.estatura
                + " mts, " + "e peso " + pedro.peso + " kg");

        System.out.println("O aluno(a) " + pedro.nome + " esta matriculado(a) no curso cujo " + pedro.curso.idCurso
                + " " + pedro.curso.nomeCurso + " com carga horária de " + pedro.curso.cargaHoraria + "hs" + "\n");


        System.out.println("Olá, meu nome é: " + pedro2.nome + "." + " Tenho " + pedro2.idade + " anos, " + pedro2.estatura
                + " mts, " + "e peso " + pedro2.peso + " kg");

        System.out.println("O aluno(a) " + pedro2.nome + " esta matriculado(a) no curso cujo " + pedro2.curso.idCurso
                + " " + pedro2.curso.nomeCurso + " com carga horária de " + pedro2.curso.cargaHoraria + "hs" + "\n");


        System.out.println("Olá, meu nome é: " + pedro3.nome + "." + " Tenho " + pedro3.idade + " anos, " + pedro3.estatura
                + " mts, " + "e peso " + pedro3.peso + " kg");

        System.out.println("O aluno(a) " + pedro3.nome + " esta matriculado(a) no curso cujo " + pedro3.curso.idCurso
                + " " + pedro3.curso.nomeCurso + " com carga horária de " + pedro3.curso.cargaHoraria + "hs" + "\n");

                
        System.out.println("Olá, meu nome é: " + pedro4.nome + "." + " Tenho " + pedro4.idade + " anos, "
                + pedro4.estatura + " mts, " + "e peso " + pedro4.peso + " kg");

        System.out.println("O aluno(a) " + pedro4.nome + " esta matriculado(a) no curso cujo " + pedro4.curso.idCurso
                + " " + pedro4.curso.nomeCurso + " com carga horária de " + pedro4.curso.cargaHoraria + "hs" + "\n");


        System.out.println("Olá, meu nome é: " + pedro5.nome + "." + " Tenho " + pedro5.idade + " anos, " + pedro5.estatura
                + " mts, " + "e peso " + pedro5.peso + " kg");

        System.out.println("O aluno(a) " + pedro5.nome + " esta matriculado(a) no curso cujo " + pedro5.curso.idCurso
                + " " + pedro5.curso.nomeCurso + " com carga horária de " + pedro5.curso.cargaHoraria + "hs");
    }
}
