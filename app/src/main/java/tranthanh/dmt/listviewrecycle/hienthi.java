package tranthanh.dmt.listviewrecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class hienthi extends AppCompatActivity {
    TextView txtht,txtSdt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hienthi2);
        txtht=findViewById(R.id.txthtHT);
        txtSdt=findViewById(R.id.txtSDT);

        Intent intent=getIntent();
        danhba db= (danhba) intent.getSerializableExtra ("hienthi");
       if(db!=null) {
            txtht.setText(db.gethT().toString() + "");
            txtSdt.setText(db.getSdt() + "");
        }else {
            Toast.makeText(hienthi.this, "Null", Toast.LENGTH_SHORT).show();
        }
    }
}
