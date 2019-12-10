package tranthanh.dmt.listviewrecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<danhba> dblist =new ArrayList<>();
    RecyclerView lv;
    adapter_danhba adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getBaseContext(), LinearLayoutManager.VERTICAL,false);

        dblist.add(new danhba("tran thanh",9837438));
        dblist.add(new danhba("Giang",9837438));
        dblist.add(new danhba("le",9831111));
        dblist.add(new danhba("tran",98322228));
        dblist.add(new danhba("truong",9833338));

        adapter=new adapter_danhba(dblist);
        adapter.setIonClickContact(new ionClickContact() {
            @Override
            public void onclickName(danhba db) {

                startActivity(new Intent(MainActivity.this,Nhapdb.class));
            }

            @Override
            public void onClickPhone(danhba db) {
                 Intent intent=new Intent(getBaseContext(),hienthi.class);
                intent.putExtra("hienthi",db);
                startActivity(intent);
            }
        });
        lv.setLayoutManager(layoutManager);
        lv.setAdapter(adapter);
        Intent intent1=getIntent();
        danhba db= (danhba) intent1.getSerializableExtra("guiList");
        if(db!=null){
            dblist.add(db);
            adapter.notifyDataSetChanged();
        }
    }
}
