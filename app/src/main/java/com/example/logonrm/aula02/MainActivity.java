package com.example.logonrm.aula02;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout tilNome;
    private TextInputLayout tilIdade;
    private Spinner spTimes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tilNome=(TextInputLayout) findViewById(R.id.tilNome);
        tilIdade=(TextInputLayout) findViewById(R.id.tilIdade);
        spTimes=(Spinner) findViewById(R.id.spTimes);

    }

    public void cadastrar(View v){
        Intent intencaoConfirmar=new Intent(this, ConfirmacaoActivity.class);
        intencaoConfirmar.putExtra("Nome",tilNome.getEditText().getText().toString());
        intencaoConfirmar.putExtra("Idade",tilIdade.getEditText().getText().toString());
        intencaoConfirmar.putExtra("Time",spTimes.getSelectedItem().toString());

        startActivity(intencaoConfirmar);
    }
}
