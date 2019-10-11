package praktikum.reynaldo.angkatebakan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private Button enter;
    private EditText nim, nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nim = (EditText) findViewById(R.id.edt_nim);
        nama = (EditText) findViewById(R.id.edt_nama);

        enter = (Button) findViewById(R.id.btn_enter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                i.putExtra("nim", nim.getText().toString());
                i.putExtra("nama", nama.getText().toString());

                startActivity(i);
            }
        });
    }
}
