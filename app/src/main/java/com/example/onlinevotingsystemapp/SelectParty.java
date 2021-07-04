package com.example.onlinevotingsystemapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SelectParty extends AppCompatActivity {

    Button PTI,PMN,PPP;
    private DatabaseReference mref;
    private ProgressDialog LoadingBar;
    String Phone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_party);

        PTI=(Button)findViewById(R.id.party1);
        PMN=(Button)findViewById(R.id.party2);
        PPP=(Button)findViewById(R.id.party3);
        Intent i=getIntent();
        Phone=i.getStringExtra("phone");
        mref= FirebaseDatabase.getInstance().getReference();
        LoadingBar=new ProgressDialog(this);


        PTI.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                final AlertDialog.Builder builder=new AlertDialog.Builder(SelectParty.this);
                builder.setTitle("Confirm Your Party");
                builder.setMessage("Do you want to give your vote to Party1");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        LoadingBar.setTitle("Voting Inprogress");
                        LoadingBar.setMessage("Please wait..");
                        LoadingBar.setCanceledOnTouchOutside(false);
                        LoadingBar.show();

                        mref.child("Users").child(Phone).child("Party").setValue("PTI").addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {

                                Intent i=new Intent(SelectParty.this,FinalActivity.class);
                                i.putExtra("phone",Phone);
                                i.putExtra("partyname","PTI");

                                startActivity(i);

                                LoadingBar.dismiss();
                                Toast.makeText(SelectParty.this, "Your Vote is Submitted to our database..", Toast.LENGTH_LONG).show();
                            }
                        });
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.cancel();
                    }
                });
                builder.show();




            }
        });
        PMN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder builder=new AlertDialog.Builder(SelectParty.this);
                builder.setTitle("Confirm Your Party");
                builder.setMessage("Do you want to give your vote to Party2");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        LoadingBar.setTitle("Voting Inprogress");
                        LoadingBar.setMessage("Please wait..");
                        LoadingBar.setCanceledOnTouchOutside(false);
                        LoadingBar.show();

                        mref.child("Users").child(Phone).child("Party").setValue("PMN").addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {

                                Intent i=new Intent(SelectParty.this,FinalActivity.class);
                                i.putExtra("phone",Phone);
                                i.putExtra("partyname","PMN");

                                startActivity(i);

                                LoadingBar.dismiss();
                                Toast.makeText(SelectParty.this, "Your Vote is Submitted to our database..", Toast.LENGTH_LONG).show();
                            }
                        });
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });
        PPP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder builder=new AlertDialog.Builder(SelectParty.this);
                builder.setTitle("Confirm Your Party");
                builder.setMessage("Do you want to give your vote to Party3");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        LoadingBar.setTitle("Voting Inprogress");
                        LoadingBar.setMessage("Please wait..");
                        LoadingBar.setCanceledOnTouchOutside(false);
                        LoadingBar.show();

                        mref.child("Users").child(Phone).child("Party").setValue("PPP").addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {

                                Intent i=new Intent(SelectParty.this,FinalActivity.class);
                                i.putExtra("phone",Phone);
                                i.putExtra("partyname","PPP");

                                startActivity(i);

                                LoadingBar.dismiss();
                                Toast.makeText(SelectParty.this, "Your Vote is Submitted to our database..", Toast.LENGTH_LONG).show();
                            }
                        });
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });
    }

    @Override
    public void onBackPressed() {

    }
}

