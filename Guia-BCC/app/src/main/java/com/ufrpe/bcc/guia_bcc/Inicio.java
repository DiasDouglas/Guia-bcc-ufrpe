package com.ufrpe.bcc.guia_bcc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import adapters.ListaDeDisciplinasAdapter;
import beans.Aluno;
import beans.Disciplina;
import beans.Professor;

public class Inicio extends Fragment {

    private static final String nomeInicial ="Inicio";

    private TextView tvNomeUsuario;


    @Override
    public View onCreateView(LayoutInflater lif, @Nullable ViewGroup container , @Nullable Bundle savedInstanceState){
        View  myView = getLayoutInflater(savedInstanceState).inflate(R.layout.tab_inicio,container,false);


        Aluno aluno = new Aluno("Ismael",getCursos());

        ListView listaDeCurso = (ListView) myView.findViewById(R.id.lvCursosTelaInicial);

        ListaDeDisciplinasAdapter adapter = new ListaDeDisciplinasAdapter(aluno.getDisciplinasCursadas(),this,savedInstanceState);

        listaDeCurso.setAdapter(adapter);

        return myView;
    }


    ///Método de  testes para retornar disciplina cursadas pelo aluno
    public ArrayList<Disciplina> getCursos(){
        ArrayList<Disciplina> lista = new ArrayList<Disciplina>();
        lista.add(new Disciplina("Arquitetura e organização de computadores",new Professor("Andre Aziz"),1.1f));
        lista.add(new Disciplina("Matemática Discreta II",new Professor("Vanilson Burégio"),10.0f));
        lista.add(new Disciplina("Sistemas Distribuidos",new Professor("Fernando Aires"),9.5f));
        lista.add(new Disciplina("Algorítmos e estruturas de dados",new Professor("Luciano"),8.5f));
        lista.add(new Disciplina("Engenharia de software",new Professor("Marcelo Marinho"),4.5f));

        return lista;
    }

}
