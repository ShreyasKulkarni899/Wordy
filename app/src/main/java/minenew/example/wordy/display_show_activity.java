package minenew.example.wordy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class display_show_activity extends AppCompatActivity {
    private RecyclerView recyclerView;
    personDataAdapter adapter;
    DatabaseReference mbase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_show_activity);

        mbase = FirebaseDatabase.getInstance().getReference().child("Member");
        recyclerView = findViewById(R.id.recyclerShowData);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        FirebaseRecyclerOptions<person_data> options = new FirebaseRecyclerOptions.Builder<person_data>().setQuery(mbase, person_data.class).build();
        adapter = new personDataAdapter(options);
        recyclerView.setAdapter(adapter);
    }
    @Override protected void onStart()
    {
        super.onStart();
        adapter.startListening();
    }
    @Override protected void onStop()
    {
        super.onStop();
        adapter.stopListening();
    }
}
