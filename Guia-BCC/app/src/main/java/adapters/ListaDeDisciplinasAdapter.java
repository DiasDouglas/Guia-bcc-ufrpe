package adapters;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ufrpe.bcc.guia_bcc.R;

import java.util.List;

import beans.Disciplina;

/**
 * Created by Ismael on 21/11/2017.
 * Adapter para itens de listagem de disciplina
 */

public class ListaDeDisciplinasAdapter extends BaseAdapter {

    private List<Disciplina> listaDisciplinas;
    private Fragment act;
    private Bundle savedInstanceState;

    public ListaDeDisciplinasAdapter(List<Disciplina> listaDisciplinas, Fragment act,Bundle savedInstanceState ){
        this.listaDisciplinas = listaDisciplinas;
        this.savedInstanceState = savedInstanceState;
        this.act = act;
    }

    @Override
    public int getCount() {
        return listaDisciplinas.size();
    }

    @Override
    public Object getItem(int position) {
        return listaDisciplinas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /*Implementando conceitos aprendidos na aula sobre list views*/
        //Implementacoes quanto a o convertView ainda serão levados em consideração
        //O formato foi diferente pois estou lidando com um  Fragment e não com uma activity
        View myView =  act.getLayoutInflater(savedInstanceState).inflate(R.layout.item_lista_disciplina,parent,false);

        Disciplina disc = listaDisciplinas.get(position);

        TextView tvNomeDisciplina = (TextView) myView.findViewById(R.id.tvNomeDisciplina);
        TextView tvNomeProfessor = (TextView) myView.findViewById(R.id.tvNomeProfessor);
        TextView tvNotaDisciplina = (TextView) myView.findViewById(R.id.tvNotaDisciplina);

        tvNomeDisciplina.setText(disc.getNomeDisciplina());
        tvNomeProfessor.setText(disc.getProfessorDisciplina().getNomeProfessor());
        tvNotaDisciplina.setText(String.valueOf(disc.getNotaCurso()));

        return myView;
    }
}

