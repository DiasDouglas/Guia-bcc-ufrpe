package adapters;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import beans.Disciplina;

/**
 * Created by Ismael on 21/11/2017.
 * Adapter para itens de listagem de disciplina
 */

public class ListaDeDisciplinasAdapter extends BaseAdapter {

    private List<Disciplina> listaDisciplinas;
    private Activity act;


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




        return null;
    }
}

