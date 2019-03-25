package com.example.hq.cse308;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CreateAccount extends AppCompatActivity {
    EditText nameField;
    EditText addressField;
    EditText phoneField;
    DatabaseReference databaseReference;
    Post post;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create);

        nameField = (EditText)findViewById(R.id.nameField);
        addressField = (EditText)findViewById(R.id.addressField);
        phoneField = (EditText)findViewById(R.id.phoneField);
        Button createButton=(Button)findViewById(R.id.createButton);

        post = new Post();
        databaseReference=FirebaseDatabase.getInstance().getReference().child("account");

        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                post.setName(nameField.getText().toString());
                post.setAddress(addressField.getText().toString());
                post.setPhone(phoneField.getText().toString());

                databaseReference.push().setValue(post);
                startActivity(new Intent(CreateAccount.this, Account.class));
            }
        });
    }

}