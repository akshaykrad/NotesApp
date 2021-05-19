package com.example.notesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectBranch extends AppCompatActivity {

    Button csebtn;
    Button ecebtn;
    Button mebtn;
    Button civilbtn;
    Button electricalbtn;
    Button environmentalbtn;
    Button petroliumbtn;
    Button miningbtn;
    Button miningMachinarybtn;
    Button mineralBtn;
    Button chemicalBtn;
    Button aglBtn;
    Button agpBtn;
    Button mncBtn;
    Button epBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_branch);

        csebtn= findViewById(R.id.csebtn);
        ecebtn= findViewById(R.id.ecebtn);
        mebtn= findViewById(R.id.mebtn);
        civilbtn= findViewById(R.id.civilbtn);
        electricalbtn= findViewById(R.id.eebtn);
        environmentalbtn= findViewById(R.id.environmentalbtn);
        petroliumbtn= findViewById(R.id.petroliumbtn);
        miningbtn= findViewById(R.id.miningbtn);
        miningMachinarybtn= findViewById(R.id.miningmachinarybtn);
        mineralBtn= findViewById(R.id.mineralbtn);
        epBtn=findViewById(R.id.epbtn);
        mncBtn=findViewById(R.id.mncbtn);
        aglBtn=findViewById(R.id.aglbtn);
        agpBtn=findViewById(R.id.agpbtn);
        chemicalBtn=findViewById(R.id.chembtn);
    }

    public void tp1(View view) {
        Intent in2=new Intent(this,PdfSelection.class);
        startActivity(in2);
    }
    public void tp2(View view) {
        Intent in3=new Intent(this,Display2.class);
        startActivity(in3);
    }
    public void tp3(View view) {
        Intent in4=new Intent(this,Display3.class);
        startActivity(in4);
    }
    public void tp4(View view) {
        Intent in5=new Intent(this,Display4.class);
        startActivity(in5);
    }
    public void tp5(View view) {
        Intent in6=new Intent(this,Display5.class);
        startActivity(in6);
    }
    public void tp6(View view) {
        Intent in7=new Intent(this,Display6.class);
        startActivity(in7);
    }
    public void tp7(View view) {
        Intent in8=new Intent(this,Display7.class);
        startActivity(in8);
    }
    public void tp8(View view) {
        Intent in9=new Intent(this,Display8.class);
        startActivity(in9);
    }
    public void tp9(View view) {
        Intent in10=new Intent(this,Display9.class);
        startActivity(in10);
    }
    public void tp10(View view) {
        Intent in11=new Intent(this,Display10.class);
        startActivity(in11);
    }
    public void tp11(View view) {
        Intent in12=new Intent(this,Display11.class);
        startActivity(in12);
    }
    public void tp12(View view) {
        Intent in13=new Intent(this,Display12.class);
        startActivity(in13);
    }
    public void tp13(View view) {
        Intent in14=new Intent(this,Display13.class);
        startActivity(in14);
    }
    public void tp14(View view) {
        Intent in15=new Intent(this,Display14.class);
        startActivity(in15);
    }
    public void tp15(View view) {
        Intent in16=new Intent(this,Display15.class);
        startActivity(in16);
    }

}