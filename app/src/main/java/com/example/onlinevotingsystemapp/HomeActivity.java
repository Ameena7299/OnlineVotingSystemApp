package com.example.onlinevotingsystemapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class HomeActivity extends AppCompatActivity {

    ImageView Auth,Tick;
    private ProgressDialog LoadingBar;
    String Phone;
    public String isVote="0";
    TextView VoteNowTv,VotedTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent i=getIntent();
        Phone = i.getStringExtra("phone");

        Auth=(ImageView)findViewById(R.id.authenticate);
        Tick=(ImageView)findViewById(R.id.votedicon);
        VoteNowTv=(TextView)findViewById(R.id.votenowtv);
        VotedTv=(TextView)findViewById(R.id.votedtv);

        LoadingBar=new ProgressDialog(this);

        final Executor executor = Executors.newSingleThreadExecutor();

        final HomeActivity activity=this;

//        Auth.setOnClickListener(new View.OnClickListener() {
//        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
//        inflater.inflate(R.menu.menu2,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {

    }
}