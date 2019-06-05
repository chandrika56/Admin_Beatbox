package com.example.android.admin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Beatbox_classes extends AppCompatActivity {
    DatabaseReference rootRef,demoRef;
    EditText e,e2,e3,e4,e5,e6,e7,e8;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_beatbox_classes);
        rootRef = FirebaseDatabase.getInstance().getReference();
        //database reference pointing to demo node
        demoRef = rootRef.child("Beatbox_Classes");

        e=findViewById (R.id.editText);
        e2=findViewById (R.id.editText2);
        e3=findViewById (R.id.editText3);
        e4=findViewById (R.id.editText4);
        e5=findViewById (R.id.editText5);
        e6=findViewById (R.id.editText6);
        e7=findViewById (R.id.editText7);
        e8=findViewById (R.id.editText8);
        b=findViewById (R.id.button);
        b.setOnClickListener (new View.OnClickListener ( ) {

            @Override
            public void onClick(View v) {
                String value =e.getText().toString();
                String value2 =e2.getText().toString();
                String value3 =e3.getText().toString();
                String value4 =e4.getText().toString();
                String value5 =e5.getText().toString();
                String value6 =e6.getText().toString();
                String value7 =e7.getText().toString();
                String value8 =e8.getText().toString();
                demoRef.push ().setValue ("NAME:"+"                  "+value+"\nDESCRIPTION:"+"    "+value2+"\nDURATION:"+"          "+value3+"\nACHIEVEMENTS:"+value4+"\nTIMINGS:"+"             "+value8+"\nDATE:"+"                   "+value5+"\nENTRY FEE:"+"        "+value6+"\nLOCATION:"+"          "+value7);

                Toast.makeText(getApplicationContext(), "Details have been uploaded!", Toast.LENGTH_SHORT).show();
            }
        });}
}
