package pooa20172.iff.br.trabalho01_2017_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText eText_Nome = (EditText) findViewById(R.id.eText_Nome);
        final EditText eText_ValorHora = (EditText) findViewById(R.id.eText_ValorHora);
        final EditText eText_HorasTrabalhadas = (EditText) findViewById(R.id.eText_HorasTrabalhadas);
        final Button bt_Calcular = (Button) findViewById(R.id.bt_Calcular);
        bt_Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //float fValorHora = Float.parseFloat(eText_ValorHora.getText().toString());
                //float fHorasTrabalhadas = Float.parseFloat(eText_HorasTrabalhadas.getText().toString());
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("nome", eText_Nome.getText().toString());
                intent.putExtra("valorhora", eText_ValorHora.getText().toString());
                intent.putExtra("horastrabalhadas", eText_HorasTrabalhadas.getText().toString());
                startActivity(intent);
            }
        });
    }
}
