package com.ufrpe.bcc.guia_bcc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Inicio extends Fragment {

    private static final String nomeInicial ="Inicio";


    @Override
    public View onCreateView(LayoutInflater lif, @Nullable ViewGroup container , @Nullable Bundle savedInstanceState){
        View  myView = getLayoutInflater(savedInstanceState).inflate(R.layout.tab_inicio,container,false);

        return myView;
    }



}
