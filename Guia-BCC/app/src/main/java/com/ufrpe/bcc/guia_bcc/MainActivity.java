package com.ufrpe.bcc.guia_bcc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtNomeUsuario;
    EditText edtSenha;
    Button btnEntrar;
    Button btnEsqueciSenha;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNomeUsuario = (EditText) findViewById(R.id.edtNome);
        edtNomeUsuario = (EditText) findViewById(R.id.edtSenha);

        if(savedInstanceState != null){
            /*Os seguintes testes evitam null pointer exception na hora de  setar os textos*/
            if(savedInstanceState.getString("nome") != null)
                edtNomeUsuario.setText(savedInstanceState.getString("nome"));
            if(savedInstanceState.getString("senha") != null)
                edtSenha.setText(savedInstanceState.getString("senha"));
        }




    }

    //Salvando o estado da aplicacaos
    @Override
    public void onSaveInstanceState(Bundle b){
        super.onSaveInstanceState(b);

        if(edtNomeUsuario != null){
            if(edtNomeUsuario.getText().toString() != null)
                b.putString("nome",edtNomeUsuario.getText().toString());
        }
        if(edtSenha != null){
            if(edtSenha.getText().toString() != null)
                b.putString("senha",edtSenha.getText().toString());
        }

    }
}
