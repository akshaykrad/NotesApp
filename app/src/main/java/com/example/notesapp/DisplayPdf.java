package com.example.notesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class DisplayPdf extends AppCompatActivity {
    PDFView pdf;
    int pos1,pos2,pos3,pos4,pos5,pos6,pos7,pos8,pos9,pos10,pos11,pos12,pos13,pos14,pos15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_pdf);
        pdf=findViewById(R.id.pdfView);
        pos1=getIntent().getIntExtra("key",1);
        pos2=getIntent().getIntExtra("key2",1);
        pos3=getIntent().getIntExtra("key3",1);
        pos4=getIntent().getIntExtra("key4",1);
        pos5=getIntent().getIntExtra("key5",1);
        pos6=getIntent().getIntExtra("key6",1);
        pos7=getIntent().getIntExtra("key7",1);
        pos8=getIntent().getIntExtra("key8",1);
        pos9=getIntent().getIntExtra("key9",1);
        pos10=getIntent().getIntExtra("key10",1);
        pos11=getIntent().getIntExtra("key11",1);
        pos12=getIntent().getIntExtra("key12",1);
        pos13=getIntent().getIntExtra("key13",1);
        pos14=getIntent().getIntExtra("key14",1);
        pos15=getIntent().getIntExtra("key15",1);


        if(pos1==0){
            pdf.fromAsset("cse.pdf").load();
        }else if(pos2==0){
            pdf.fromAsset("ece.pdf").load();
        }else if(pos3==0){
            pdf.fromAsset("ee.pdf").load();
        }else if(pos4==0){
            pdf.fromAsset("mech.pdf").load();
        }else if(pos5==0){
            pdf.fromAsset("civil.pdf").load();
        }else if(pos6==0){
            pdf.fromAsset("env.pdf").load();
        }else if(pos7==0){
            pdf.fromAsset("petro.pdf").load();
        }else if(pos8==0){
            pdf.fromAsset("mining.pdf").load();
        }else if(pos9==0){
            pdf.fromAsset("machine.pdf").load();
        }else if(pos10==0){
            pdf.fromAsset("min.pdf").load();
        }else if(pos11==0){
            pdf.fromAsset("chem.pdf").load();
        }else if(pos12==0){
            pdf.fromAsset("ep.pdf").load();
        }else if(pos13==0){
            pdf.fromAsset("mnc.pdf").load();
        }else if(pos14==0){
            pdf.fromAsset("agp.pdf").load();
        }else if(pos15==0){
            pdf.fromAsset("agl.pdf").load();
        }
    }
}
