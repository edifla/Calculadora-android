package br.com.rafaelalbuquerque.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Handler;
import android.content.Intent;

public class principal extends AppCompatActivity {
        private EditText edt_val1;
        private EditText edt_val2;
        private EditText edt_val3;
        private TextView txt_resultado;
        private Button btn_limpar;
        private Button btn_calcD;
        private Button btn_calcI;
        private Button btn_sair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        edt_val1 = (EditText) findViewById(R.id.edt_val1);
        edt_val2 = (EditText) findViewById(R.id.edt_val2);
        edt_val3 = (EditText) findViewById(R.id.edt_val3);
        txt_resultado = (TextView) findViewById(R.id.txt_resultado);
        btn_limpar = (Button) findViewById(R.id.btn_limpar);
        btn_calcD = (Button) findViewById(R.id.btn_calcD);
        btn_calcI = (Button) findViewById(R.id.btn_calcI);
        btn_sair = (Button) findViewById(R.id.btn_sair);

        btn_calcD.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txt_resultado.setText("Resultado: " +calculoDireto(Double.parseDouble(edt_val1.getText().toString()),Double.parseDouble(edt_val2.getText().toString()),Double.parseDouble(edt_val3.getText().toString())));
            }
        });
        btn_calcI.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txt_resultado.setText("Resultado: " +calculoInverso(Double.parseDouble(edt_val1.getText().toString()),Double.parseDouble(edt_val2.getText().toString()),Double.parseDouble(edt_val3.getText().toString())));
            }
        });
        btn_sair.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent (principal.this, saida.class);
                startActivity(intent);
                finish();
            }
        });
        btn_limpar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
               edt_val1.setText("");
               edt_val2.setText("");
               edt_val3.setText("");
               txt_resultado.setText("");
            }
        });
    }
    public double calculoDireto(double a,double b, double c){
        return (c*b)/a;
    }
    public double calculoInverso(double a,double b, double c){
        return (c*a)/b;
    }
}