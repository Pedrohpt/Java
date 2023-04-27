public class definePessoa {
    public static void main(String[] args) {

        Curso curso = new Curso();

        Pessoa pedro = new Pessoa();
        Pessoa pedro2 = new Pessoa();
        Pessoa pedro3 = new Pessoa();
        Pessoa pedro4 = new Pessoa();
        Pessoa pedro5 = new Pessoa();

        // curso.recebeDadosCurso(4532, "Técnico em Informática", "Nalysson", 3);

        // pedro.recebeDadosPessoa("Pedro", 85.0, 1.85, 19, "castanhos", "castanhos", curso);
        // pedro2.recebeDadosPessoa("Pedro2", 86.0, 1.86, 20, "castanhos", "castanhos", curso);
        // pedro3.recebeDadosPessoa("Pedro3", 87.0, 1.87, 21, "castanhos", "castanhos", curso);
        // pedro4.recebeDadosPessoa("Pedro4", 88.0, 1.88, 22, "castanhos", "castanhos", curso);
        // pedro5.recebeDadosPessoa("Pedro5", 89.0, 1.89, 23, "castanhos", "castanhos", curso);

        curso.setIdCurso(4532);
        curso.setNomeCurso("Tecnico em Informatica");
        curso.setNomeProfessor("Nalysson");
        curso.setCargaHoraria(3);

        pedro.setNome("Pedro");
        pedro.setPeso(85.0);
        pedro.setEstatura(1.85);
        pedro.setIdade(19);
        pedro.setOlhos("castanhos");
        pedro.setCabelos("castanhos");
        pedro.setCurso(curso);

        pedro2.setNome("Pedro2");
        pedro2.setPeso(86.0);
        pedro2.setEstatura(1.86);
        pedro2.setIdade(20);
        pedro2.setOlhos("castanhos");
        pedro2.setCabelos("castanhos");
        pedro2.setCurso(curso);

        pedro3.setNome("Pedro3");
        pedro3.setPeso(87.0);
        pedro3.setEstatura(1.87);
        pedro3.setIdade(21);
        pedro3.setOlhos("castanhos");
        pedro3.setCabelos("castanhos");
        pedro3.setCurso(curso);

        pedro4.setNome("Pedro4");
        pedro4.setPeso(88.0);
        pedro4.setEstatura(1.88);
        pedro4.setIdade(22);
        pedro4.setOlhos("castanhos");
        pedro4.setCabelos("castanhos");
        pedro4.setCurso(curso);

        pedro5.setNome("Pedro5");
        pedro5.setPeso(89.0);
        pedro5.setEstatura(1.89);
        pedro5.setIdade(23);
        pedro5.setOlhos("castanhos");
        pedro5.setCabelos("castanhos");
        pedro5.setCurso(curso);

        System.out.println("Olá, meu nome é: " + pedro.getNome() + "." + " Tenho " + pedro.getIdade() + " anos, " + pedro.getEstatura()
                + " mts, " + "e peso " + pedro.getPeso() + " kg");

        System.out.println("O aluno(a) " + pedro.getNome() + " esta matriculado(a) no curso cujo " + pedro.getCurso().getIdCurso()
                + " " + pedro.getCurso().getNomeCurso() + " com carga horária de " + pedro.getCurso().getCargaHoraria() + "hs" + "\n");


        System.out.println("Olá, meu nome é: " + pedro2.getNome() + "." + " Tenho " + pedro2.getIdade() + " anos, " + pedro2.getEstatura()
                + " mts, " + "e peso " + pedro2.getPeso() + " kg");

        System.out.println("O aluno(a) " + pedro2.getNome() + " esta matriculado(a) no curso cujo " + pedro2.getCurso().getIdCurso()
                + " " + pedro2.getCurso().getNomeCurso() + " com carga horária de " + pedro2.getCurso().getCargaHoraria() + "hs" + "\n");


        System.out.println("Olá, meu nome é: " + pedro3.getNome() + "." + " Tenho " + pedro3.getIdade() + " anos, " + pedro3.getEstatura()
                + " mts, " + "e peso " + pedro3.getPeso() + " kg");

        System.out.println("O aluno(a) " + pedro3.getNome() + " esta matriculado(a) no curso cujo " + pedro3.getCurso().getIdCurso()
                + " " + pedro3.getCurso().getNomeCurso() + " com carga horária de " + pedro3.getCurso().getCargaHoraria() + "hs" + "\n");

                
        System.out.println("Olá, meu nome é: " + pedro4.getNome() + "." + " Tenho " + pedro4.getIdade() + " anos, "
                + pedro4.getEstatura() + " mts, " + "e peso " + pedro4.getPeso() + " kg");

        System.out.println("O aluno(a) " + pedro4.getNome() + " esta matriculado(a) no curso cujo " + pedro4.getCurso().getIdCurso()
                + " " + pedro4.getCurso().getNomeCurso() + " com carga horária de " + pedro4.getCurso().getCargaHoraria() + "hs" + "\n");


        System.out.println("Olá, meu nome é: " + pedro5.getNome() + "." + " Tenho " + pedro5.getIdade() + " anos, " + pedro5.getEstatura()
                + " mts, " + "e peso " + pedro5.getPeso() + " kg");

        System.out.println("O aluno(a) " + pedro5.getNome() + " esta matriculado(a) no curso cujo " + pedro5.getCurso().getIdCurso()
                + " " + pedro5.getCurso().getNomeCurso() + " com carga horária de " + pedro5.getCurso().getCargaHoraria() + "hs");
    }
}
