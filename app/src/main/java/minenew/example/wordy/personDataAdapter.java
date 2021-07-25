package minenew.example.wordy;
import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;


public class personDataAdapter extends FirebaseRecyclerAdapter<person_data, personDataAdapter.personsViewholder> {

    public personDataAdapter(
            @NonNull FirebaseRecyclerOptions<person_data> options)
    {
        super(options);
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void
    onBindViewHolder(@NonNull personsViewholder holder, int position, @NonNull person_data model)
    {
        holder.nameTVShow.setText(model.getName());
        holder.AgeTVShow.setText(model.getAge().toString());
        //holder.phoneTVShow.setText(model.getPhoneNo().toString());
        holder.HeightTVShow.setText(model.getHeight());
    }
    @NonNull
    @Override
    public personsViewholder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.person_card, parent, false);
        return new personDataAdapter.personsViewholder(view);
    }


    class personsViewholder extends RecyclerView.ViewHolder {
        TextView nameTVShow, AgeTVShow,HeightTVShow;
        public personsViewholder(@NonNull View itemView)
        {
            super(itemView);
            nameTVShow= itemView.findViewById(R.id.nameTVShow);
            AgeTVShow = itemView.findViewById(R.id.AgeTVShow);
            //phoneTVShow = itemView.findViewById(R.id.phoneTVShow);
            HeightTVShow = itemView.findViewById(R.id.HeightTVShow);
        }
    }
}
