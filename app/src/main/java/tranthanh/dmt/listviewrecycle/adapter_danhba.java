package tranthanh.dmt.listviewrecycle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter_danhba extends RecyclerView.Adapter<adapter_danhba.Viewholder> {
    List<danhba> listDB;
    ionClickContact IonClickContact;

    public void setIonClickContact(ionClickContact ionClickContact) {
        IonClickContact = ionClickContact;
    }

    public adapter_danhba(List<danhba> listDB) {
        this.listDB = listDB;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.db_aa,parent,false);

        Viewholder viewholder=new Viewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        final danhba db=listDB.get(position);
        holder.txtHt.setText(db.gethT());
        holder.txtSdt.setText(db.getSdt()+"");
        holder.txtHt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IonClickContact.onclickName(db);
            }
        });
        holder.txtSdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IonClickContact.onClickPhone(db);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listDB.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        TextView txtHt,txtSdt;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            txtHt=itemView.findViewById(R.id.txtLOht);
            txtSdt=itemView.findViewById(R.id.txtLOsdt);
        }
    }
}
