package pooa20172.iff.br.trabalho01_2017_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String nome = (String) intent.getSerializableExtra("nome");
        String valorhora = (String) intent.getSerializableExtra("valorhora");
        String horastrabalhadas = (String) intent.getSerializableExtra("horastrabalhadas");
        float v_hora = Float.parseFloat(valorhora);
        float h_trabalhadas = Float.parseFloat(horastrabalhadas);
        float salario_bruto = v_hora * h_trabalhadas;
        double IR = salario_bruto*0.11;
        double INSS =  salario_bruto*0.08;
        double Sindicato = salario_bruto*0.05;
        double S_Liquido = salario_bruto-(IR+INSS+Sindicato);
        TextView tView_Nome = (TextView) findViewById(R.id.tView_Nome);
        tView_Nome.setText("Nome: "+ nome+"");
        TextView tView_IR = (TextView) findViewById(R.id.tView_IR);
        tView_IR.setText("IR: "+IR+"");
        TextView tView_INSS = (TextView) findViewById(R.id.tView_INSS);
        tView_INSS.setText("INSS: "+INSS+"");
        TextView tView_Sindicato = (TextView) findViewById(R.id.tView_Sindicato);
        tView_Sindicato.setText("Sindicato: "+Sindicato+"");
        TextView tView_SalarioLiquido = (TextView) findViewById(R.id.tView_SalarioLiquido);
        tView_SalarioLiquido.setText("SalárioLiquido: "+S_Liquido+"");
    }
}
