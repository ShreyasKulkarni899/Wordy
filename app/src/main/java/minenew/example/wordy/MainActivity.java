package minenew.example.wordy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText NameTV,AgeTV,PhoneTV,HeightTV;
    Button btnSubmit,btnClear,btnShowthe;
    DatabaseReference reff;
    Member member;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NameTV = findViewById(R.id.NameTV);
        AgeTV = findViewById(R.id.AgeTV);
        PhoneTV = findViewById(R.id.PhoneTV);
        HeightTV = findViewById(R.id.HeightTV);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnClear = findViewById(R.id.btnClear);
        btnShowthe = findViewById(R.id.btnShowthe);
        member = new Member();
        reff = FirebaseDatabase.getInstance().getReference().child("Member");
        btnSubmit.setOnClickListener(v -> {
            int age =Integer.parseInt(AgeTV.getText().toString().trim());
            float ht = Float.parseFloat((HeightTV.getText().toString().trim()));
            Long ph = Long.parseLong(PhoneTV.getText().toString().trim());

            member.setName(NameTV.getText().toString().trim());
            member.setAge(age);
            member.setHt(ht);
            member.setPh(ph);
            reff.push().setValue(member);
            Toast.makeText(MainActivity.this,"Inserted Done!!",Toast.LENGTH_LONG).show();
        });
        btnClear.setOnClickListener(v -> {
            NameTV.setText("");
            AgeTV.setText("");
            PhoneTV.setText("");
            HeightTV.setText("");
            Toast.makeText(MainActivity.this,"All fields cleared",Toast.LENGTH_SHORT).show();
        });
        btnShowthe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, display_show_activity.class);
                startActivity(i);

            }
        });
    }
}