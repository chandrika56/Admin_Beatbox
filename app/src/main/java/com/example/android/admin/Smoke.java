package com.example.android.admin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Smoke extends AppCompatActivity {
    DatabaseReference rootRef,demoRef;
    EditText e,e2,e3,e4,e5,e6;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_smoke);
        rootRef = FirebaseDatabase.getInstance().getReference();
        //database reference pointing to demo node
        demoRef = rootRef.child("Adminlink").child("smoke_videos");

        e=findViewById (R.id.editText);
        e2=findViewById (R.id.editText2);
        e3=findViewById (R.id.editText3);
        e4=findViewById (R.id.editText4);
        e5=findViewById (R.id.editText5);
        e6=findViewById (R.id.editText6);

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
                if(value != null && !value.isEmpty()) {demoRef.child ("1").setValue (value);}
                if(value2!=null&& !value2.isEmpty()) {demoRef.child ("2").setValue (value2);}
                if(value3!=null&& !value3.isEmpty()) {demoRef.child ("3").setValue (value3);}
                if(value4!=null&& !value4.isEmpty()){demoRef.child ("4").setValue (value4);}
                if(value5!=null&& !value5.isEmpty()) {demoRef.child ("5").setValue (value5);}
                if(value6!=null&& !value6.isEmpty()){demoRef.child ("6").setValue (value6);}
                Toast.makeText(getApplicationContext(), "Link has been Submitted!", Toast.LENGTH_SHORT).show();
            }
        }); }
}
