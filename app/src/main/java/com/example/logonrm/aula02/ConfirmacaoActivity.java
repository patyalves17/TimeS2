package com.example.logonrm.aula02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ConfirmacaoActivity extends AppCompatActivity {

    private TextView tvConfirmacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacao);

        tvConfirmacao = (TextView) findViewById(R.id.tvConfirmacao);

        if(getIntent()!=null){
            String nome=getIntent().getStringExtra("Nome");
            String idade=getIntent().getStringExtra("Idade");
            String time=getIntent().getStringExtra("Time");

            tvConfirmacao.setText(
                    getString(R.string.confirmacao_cadastro,
                    nome, time)
            );
        }

    }
}
