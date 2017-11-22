package beans;

/**
 * Created by Ismael on 21/11/2017.
 * Classe básica que representa o Disciplina em que o aluno está matriculado
 */

public class Disciplina {

    private String nomeDisciplina;
    private Professor professorDisciplina;
    private String semestreAtual;//Considerando opções de mudar para algum objeto da biblioteca Java.time
    private float notaCurso;/*Foi escolhido float pois ocupa menos espaço na memória
                              e o range das notas não será muito grande, o calculo geral da
                              nota de cada curso será definido posteriormente*/

    public Disciplina(){}

    public Disciplina(String nomeDisciplina, Professor professorDisciplina, float notaCurso){
        this.setNomeDisciplina(nomeDisciplina);
        this.setProfessorDisciplina(professorDisciplina);
        this.setNotaCurso(notaCurso);
    }

    public void setNomeDisciplina(String nomeDisciplina) {
         if(nomeDisciplina != null)
            this.nomeDisciplina = nomeDisciplina;
         else
             throw new NullPointerException("Valor nulo");
    }

    public void setProfessorDisciplina(Professor professorDisciplina) {
        this.professorDisciplina = professorDisciplina;
    }

    public void setNotaCurso(float notaCurso){
        //Definindo um range específico para a nota do Disciplina(Isso poderá ser modificado depois)
        if(notaCurso >= 0 && notaCurso <= 10)
            this.notaCurso = notaCurso;
        else
            throw new IllegalArgumentException("Valo fora do intervalo");
    }

    public void setSemestreAtual(String semestreAtual) {
         if(semestreAtual != null)
            this.semestreAtual = semestreAtual;
        else
             throw new NullPointerException("Valor nulo");
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public Professor getProfessorDisciplina() {
        return professorDisciplina;
    }

    public float getNotaCurso() {
        return notaCurso;
    }

    public String getSemestreAtual() {
        return semestreAtual;
    }
}
