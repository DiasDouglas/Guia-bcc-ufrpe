package beans;

import java.util.ArrayList;

/**
 * Created by Ismael on 21/11/2017.
 * Classe básica que representa a entidade aluno
 * contendo o nome do aluno e a lista de disciplinas que
 * o aluno está cursando
 */

public class Aluno {

    private String nomeAluno;
    private ArrayList<Disciplina> disciplinasCursadas;
    private Usuario usuario;

    public Aluno(){}

    public Aluno(String nomeAluno, ArrayList<Disciplina> disciplinasCursadas){
        this.setDisciplinasCursadas(disciplinasCursadas);
        this.setNomeAluno(nomeAluno);
    }

    public void setNomeAluno(String nomeAluno) {
        if(nomeAluno != null)
            this.nomeAluno = nomeAluno;
        else
            throw new NullPointerException("Valor nulo");
    }

    public void setDisciplinasCursadas(ArrayList<Disciplina> disciplinasCursadas) {
        if(disciplinasCursadas != null)
            this.disciplinasCursadas = disciplinasCursadas;
        else
            throw new NullPointerException("Valor nulo");
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Disciplina> getDisciplinasCursadas() {
        return disciplinasCursadas;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
