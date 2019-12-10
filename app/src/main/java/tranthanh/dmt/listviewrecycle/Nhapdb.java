package tranthanh.dmt.listviewrecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Nhapdb extends AppCompatActivity {
    EditText txtHT,txtSDT;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhapdb);

        final Intent intent=new Intent();
        txtHT=findViewById(R.id.edtHT);
        txtSDT=findViewById(R.id.edtSDT);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final danhba db=new danhba(txtHT.getText().toString(),Integer.parseInt( txtSDT.getText().toString()));
                intent.putExtra("guiList",db);
                startActivity(new Intent( Nhapdb.this,MainActivity.class));
            }
        });

    }
}
