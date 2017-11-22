package com.ufrpe.bcc.guia_bcc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import adapters.ListaDeDisciplinasAdapter;
import beans.Disciplina;
import beans.Professor;

public class Avaliacoes extends Fragment {

    private static final String nomeInicial ="Avaliacoes";


    @Override
    public View onCreateView(LayoutInflater lif, @Nullable ViewGroup container , @Nullable Bundle savedInstanceState){
        View  myView = getLayoutInflater(savedInstanceState).inflate(R.layout.tab_avaliacoes,container,false);

        ListView lvListaDisciplinasGeral = (ListView) myView.findViewById(R.id.lvListaDisciplinasGeral);

        ListaDeDisciplinasAdapter adapterLista = new ListaDeDisciplinasAdapter(getCursos(),this,savedInstanceState);

        lvListaDisciplinasGeral.setAdapter(adapterLista);

        return myView;
    }

    ///Método de  testes para retornar disciplina cursadas pelo aluno
    public ArrayList<Disciplina> getCursos(){
        ArrayList<Disciplina> lista = new ArrayList<Disciplina>();
        lista.add(new Disciplina("Arquitetura e organização de computadores",new Professor("Andre Aziz"),1.1f));
        lista.add(new Disciplina("Matemática Discreta II",new Professor("Vanilson Burégio"),10.0f));
        lista.add(new Disciplina("Sistemas Distribuidos",new Professor("Fernando Aires"),9.5f));
        lista.add(new Disciplina("Algorítmos e estruturas de dados",new Professor("Luciano"),0.0f));
        lista.add(new Disciplina("Engenharia de software",new Professor("Marcelo Marinho"),4.5f));
        lista.add(new Disciplina("Matemática Discreta I",new Professor("Felipe Cordeiro"),1.1f));
        lista.add(new Disciplina("Introdução a programação I",new Professor("Péricles Miranda"),10.0f));
        lista.add(new Disciplina("Introdução a programação II",new Professor("Leandro Marques"),9.5f));
        lista.add(new Disciplina("Redes de computadores",new Professor("Obionor Nóbrega"),8.5f));
        lista.add(new Disciplina("Teoria da computação",new Professor("Adeniltom Silva"),4.5f));
        lista.add(new Disciplina("Projeto e Análise de Algorítmos",new Professor("Jeane"),9.5f));
        lista.add(new Disciplina("Circuitos digitais",new Professor("Abner"),8.5f));
        lista.add(new Disciplina("Teoria da computação",new Professor("Adeniltom Silva"),4.5f));
        lista.add(new Disciplina("Iteligência Artificial",new Professor("Valmir Nogueira"),4.5f));

        return lista;
    }




}
