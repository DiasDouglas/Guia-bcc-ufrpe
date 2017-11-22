package beans;

/**
 * Created by Ismael on 21/11/2017.
 * Classe básica representando o professor que leciona o curso
 */

public class Professor {

    private String nomeProfessor;
    private float notaProfessor;/*Foi escolhido float pois ocupa menos espaço na memória
                              e o range das notas não será muito grande, o calculo geral da
                              nota de cada curso será definido posteriormente*/

    public Professor(String nomeProfessor){

    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public void setNotaProfessor(float notaProfessor) {
        //Definindo um range específico para a nota do professor(Isso poderá ser modificado depois)
        if(notaProfessor >= 0 && notaProfessor <= 10){
            this.notaProfessor = notaProfessor;
        }
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public float getNotaProfessor() {
        return notaProfessor;
    }
}
