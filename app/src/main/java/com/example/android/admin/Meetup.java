package com.example.android.admin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Meetup extends AppCompatActivity {
    DatabaseReference rootRef,demoRef;
    EditText e,e2,e3,e4,e5;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_meetup);
        rootRef = FirebaseDatabase.getInstance().getReference();
        //database reference pointing to demo node
        demoRef = rootRef.child("meetup");

        e=findViewById (R.id.editText9);
        e2=findViewById (R.id.editText10);
        e3=findViewById (R.id.editText11);
        e4=findViewById (R.id.editText12);
        e5=findViewById (R.id.editText18);
        b=findViewById (R.id.button3);
        b.setOnClickListener (new View.OnClickListener ( ) {

            @Override
            public void onClick(View v) {
                String value =e.getText().toString();
                String value2 =e2.getText().toString();
                String value3 =e3.getText().toString();
                String value4 =e4.getText().toString();
                String value5 =e5.getText().toString();


                // if(value != null && !value.isEmpty() && value2!=null&& !value2.isEmpty()&&value3!=null&& !value3.isEmpty()&&value4!=null&& !value4.isEmpty()&&value5!=null&& !value5.isEmpty())
                demoRef.push().setValue("MEETUP TYPE:"+value+"\nNAME:"+"              "+value2 +"\nVENUE:"+"            "+ value3 +"\nDATE:"+"               "+  value4+"\nLOCATION:"+"       "+value5);
                //demoRef.setValue (value);
                //demoRef.setValue (value2);
                //demoRef.setValue (value3);
                //demoRef.setValue (value5);}
                //if(value2!=null&& !value2.isEmpty()) {demoRef.child ("name").setValue (value2);}
                //if(value3!=null&& !value3.isEmpty()) {demoRef.child ("ven").setValue (value3);}
                //if(value4!=null&& !value4.isEmpty()){demoRef.child ("dat").setValue (value4);}

                //if(value5!=null&& !value5.isEmpty()){demoRef.child ("loc").setValue (value5);}

                Toast.makeText(getApplicationContext(), "Details have been uploaded!", Toast.LENGTH_SHORT).show();
            }
        });}
}


