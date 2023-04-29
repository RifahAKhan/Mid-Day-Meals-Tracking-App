package com.example.hackerrupt;

import android.app.ProgressDialog;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;


import com.example.hackerrupt.databinding.ActivityRegistrationBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

public class Registration extends AppCompatActivity {
    private Button registerButton;

    Spinner myspinner;
    Spinner myspinner2;
    Spinner myspinner3;

    ActivityRegistrationBinding binding;

    TextView userid;
    TextView password;
    FirebaseAuth firebaseAuth;
    FirebaseFirestore firebaseFirestore;
    ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        userid=findViewById(R.id.email);
        password=findViewById(R.id.password);

        binding=ActivityRegistrationBinding.inflate(getLayoutInflater());

        firebaseAuth = FirebaseAuth.getInstance();
        firebaseFirestore=firebaseFirestore.getInstance();

        progressDialog=new ProgressDialog(this);

        setContentView(binding.getRoot());

        binding.save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = binding.emailAddress.getText().toString().trim();
                String password = binding.password.getText().toString();


                progressDialog.show();
                firebaseAuth.createUserWithEmailAndPassword(email,password)
                        .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                            @Override
                            public void onSuccess(AuthResult authResult) {
                                startActivity(new Intent(Registration.this,Login.class));
                                progressDialog.cancel();

                                firebaseFirestore.collection("User")
                                        .document(FirebaseAuth.getInstance().getUid())
                                        .set(new UserModel(email));
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Registration.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                                progressDialog.cancel();
                            }
                        });

            }
        });

        myspinner = findViewById(R.id.myspinner);
        ArrayList<String> mylist=new ArrayList<>();
        mylist.add("Karnataka");
        mylist.add("Kerala");
        mylist.add("Tamil Nadu");
        mylist.add("Andhra Pradesh");
        mylist.add("Maharashtra");
        ArrayAdapter<String> myarrayadapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,mylist);
        myarrayadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner.setAdapter(myarrayadapter);
        myspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String data = myarrayadapter.getItem(i);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        myspinner2 = findViewById(R.id.myspinner2);
        ArrayList<String> mylist2=new ArrayList<>();
        mylist2.add("Mysuru");
        mylist2.add("Bengaluru");
        mylist2.add("Mandya");
        mylist2.add("Belagavi");
        mylist2.add("Chamarajanagar");
        ArrayAdapter<String> myarrayadapter2=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,mylist2);
        myarrayadapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner2.setAdapter(myarrayadapter2);
        myspinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String data = myarrayadapter2.getItem(i);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        myspinner3 = findViewById(R.id.myspinner3);
        ArrayList<String> mylist3=new ArrayList<>();
        mylist3.add("Kuvempunagar");
        mylist3.add("Rajendranagara");
        mylist3.add("Kallahalli");
        mylist3.add("Attigodu");
        mylist3.add("Hirehalli");
        ArrayAdapter<String> myarrayadapter3=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,mylist3);
        myarrayadapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner3.setAdapter(myarrayadapter3);
        myspinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String data = myarrayadapter3.getItem(i);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}