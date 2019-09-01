package com.example.javalatihan4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity{

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnTambah,btnKurang,btnBagi,btnKali,btnSamaDengan,titik,allClear;
    TextView txt0;
    Float hasil1, hasil2;
    boolean hasilTambah, hasilKurang, hasilKali, hasilBagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnTambah = findViewById(R.id.btnTambah);
        btnKurang = findViewById(R.id.btnKurang);
        btnKali = findViewById(R.id.btnKali);
        btnBagi = findViewById(R.id.btnBagi);
        btnSamaDengan = findViewById(R.id.btnSamaDengan);
        titik = findViewById(R.id.btnTitik);
        txt0 = findViewById(R.id.txt0);
        allClear = findViewById(R.id.btnAC);

        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt0.setText(txt0.getText()+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt0.setText(txt0.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt0.setText(txt0.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt0.setText(txt0.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt0.setText(txt0.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt0.setText(txt0.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt0.setText(txt0.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt0.setText(txt0.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt0.setText(txt0.getText()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txt0.setText(txt0.getText()+"9");
            }
        });

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt0.getText().toString() == ""){
                    txt0.setText("");
                }
                else if (txt0.getText().toString() == "-"){
                    txt0.setText("");
                }
                else{
                    hasil1 = Float.parseFloat(txt0.getText()+"");
                    hasilTambah = true;
                    txt0.setText(null);
                }
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt0.getText().toString() == ""){
                    txt0.setText("-");
                }
                else if (txt0.getText().toString() == "-"){
                    txt0.setText("-");
                }
                else{
                    hasil1 = Float.parseFloat(txt0.getText()+"");
                    hasilKurang = true;
                    txt0.setText(null);
                }
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt0.getText().toString() == ""){
                    txt0.setText("");
                }
                else if (txt0.getText().toString() == "-"){
                    txt0.setText("");
                }
                else{
                    hasil1 = Float.parseFloat(txt0.getText()+"");
                    hasilKali = true;
                    txt0.setText(null);
                }
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt0.getText().toString() == ""){
                    txt0.setText("");
                }
                else if (txt0.getText().toString() == "-"){
                    txt0.setText("");
                }
                else {
                    hasil1 = Float.parseFloat(txt0.getText()+"");
                    hasilBagi = true;
                    txt0.setText(null);
                }
            }
        });

        titik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt0.getText().toString() == ""){
                    txt0.setText("");
                }
                else if (txt0.getText().toString() == "-"){
                    txt0.setText(txt0.getText());
                }
                else {
                    txt0.setText(txt0.getText()+".");
                }
            }
        });

        btnSamaDengan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hasilTambah == true){
                    hasil2 = Float.parseFloat(txt0.getText()+"");
                    txt0.setText(hasil1 + hasil2 + "");
                    hasilTambah = false;
                }

                else if (hasilKurang == true){
                    hasil2 = Float.parseFloat(txt0.getText()+"");
                    txt0.setText(hasil1 - hasil2 + "");
                    hasilKurang = false;
                }

                else if (hasilKali == true){
                    hasil2 = Float.parseFloat(txt0.getText()+"");
                    txt0.setText(hasil1 * hasil2 + "");
                    hasilKali = false;
                }

                else if (hasilBagi == true){
                    hasil2 = Float.parseFloat(txt0.getText()+"");
                    txt0.setText(hasil1 / hasil2 + "");
                    hasilBagi = false;
                }

                else if (txt0.getText().toString() == ""){
                    txt0.setText("");
                }

                else {
                    txt0.setText("");
                }
            }
        });

        allClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt0.setText("");
            }
        });
    }
}
