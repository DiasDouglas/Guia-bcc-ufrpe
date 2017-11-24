package com.ufrpe.bcc.guia_bcc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import adapters.ListaDeDisciplinasCursadasAdapter;
import beans.DisciplinaCursada;

public class Avaliacoes extends Fragment {

    private static final String nomeInicial ="Avaliacoes";


    @Override
    public View onCreateView(LayoutInflater lif, @Nullable ViewGroup container , @Nullable Bundle savedInstanceState){
        View  myView = getLayoutInflater(savedInstanceState).inflate(R.layout.tab_avaliacoes,container,false);

        ListView lvListaDisciplinasGeral = (ListView) myView.findViewById(R.id.lvListaDisciplinasGeral);

        ListaDeDisciplinasCursadasAdapter adapterLista = new ListaDeDisciplinasCursadasAdapter(getCursos(),this,savedInstanceState);

        lvListaDisciplinasGeral.setAdapter(adapterLista);

        return myView;
    }

    ///Método de  testes para retornar disciplina cursadas pelo aluno
    public ArrayList<DisciplinaCursada> getCursos(){
        ArrayList<DisciplinaCursada> lista = new ArrayList<DisciplinaCursada>();
        lista.add(new DisciplinaCursada("Arquitetura e organização de computadores","Andre Aziz",4,"25/11/2017","26/11/2017", false,"2017.2"));
        lista.add(new DisciplinaCursada("Matemática Discreta II","Vanilson Burégio",25,"25/11/2017","26/11/2017", false,"2017.2"));
        lista.add(new DisciplinaCursada("Sistemas Distribuidos","Fernando Aires",15,"25/11/2017","26/11/2017", false,"2017.2"));
        lista.add(new DisciplinaCursada("Algorítmos e estruturas de dados","Luciano",10,"25/11/2017","26/11/2017", false,"2017.2"));
        lista.add(new DisciplinaCursada("Engenharia de software","Marcelo Marinho",35,"25/11/2017","26/11/2017", false,"2017.2"));
        /*
        deixei com que ele tivesse pagando apenas 5 disciplinas
        lista.add(new DisciplinaCursada("Matemática Discreta I","Felipe Cordeiro",40,1.1f));
        lista.add(new DisciplinaCursada("Introdução a programação I","Péricles Miranda",40,10.0f));
        lista.add(new DisciplinaCursada("Introdução a programação II","Leandro Marques",34,9.5f));
        lista.add(new DisciplinaCursada("Redes de computadores","Obionor Nóbrega",50,8.5f));
        lista.add(new DisciplinaCursada("Teoria da computação","Adeniltom Silva",14,4.5f));
        lista.add(new DisciplinaCursada("Projeto e Análise de Algorítmos","Jeane",16,9.5f));
        lista.add(new DisciplinaCursada("Circuitos digitais","Abner",60,8.5f));
        lista.add(new DisciplinaCursada("Iteligência Artificial","Valmir Nogueira",30,4.5f));*/

        return lista;
    }




}
