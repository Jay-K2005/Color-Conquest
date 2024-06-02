package com.example.delta;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    private TextView pLayer1,pLayer2;
    int i=1;
    private Button box1,box2,box3,box4,box5,box6,box7,box8,box9,box10,box12,box11,box13,box14,box15,box16,box17,box18,box19,box20,box21,box22,box23,box24,box25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        pLayer1=findViewById(R.id.txtpla1);
        pLayer2=findViewById(R.id.txtpla2);
        box1=findViewById(R.id.box1);
        box2=findViewById(R.id.box2);
        box6=findViewById(R.id.box6);
        box3=findViewById(R.id.box3);
        box4=findViewById(R.id.box4);
        box5=findViewById(R.id.box5);
        box7=findViewById(R.id.box7);
        box8=findViewById(R.id.box8);
        box9=findViewById(R.id.box9);
        box10=findViewById(R.id.box10);
        box11=findViewById(R.id.box11);
        box12=findViewById(R.id.box12);
        box13=findViewById(R.id.box13);
        box14=findViewById(R.id.box14);
        box15=findViewById(R.id.box15);
        box16=findViewById(R.id.box16);
        box17=findViewById(R.id.box17);
        box18=findViewById(R.id.box18);
        box19=findViewById(R.id.box19);
        box20=findViewById(R.id.box20);
        box21=findViewById(R.id.box21);
        box22=findViewById(R.id.box22);
        box23=findViewById(R.id.box23);
        box24=findViewById(R.id.box24);
        box25=findViewById(R.id.box25);
        box25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(box25.getText().toString()==""){
                    box25.setText("1");
                    if(i%2==0 & i!=0)
                        box25.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box25.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box25.getText().toString()=="1"){
                    box25.setText("2");
                    if(i%2==0 & i!=0)
                        box25.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box25.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box25.getText().toString()=="2"){
                    box25.setText("3");
                    if(i%2==0 & i!=0)
                        box25.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box25.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box25.getText().toString()=="3"){
                    box25.setText("");
                    box24.setText("1");
                    box20.setText("1");
                    box25.setBackground(getDrawable(R.drawable.whitebox));

                }


            }
        });
        box24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(box24.getText().toString()==""){
                    box14.setText("1");
                    if(i%2==0 & i!=0)
                        box24.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box24.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box24.getText().toString()=="1"){
                    box24.setText("2");
                    if(i%2==0 & i!=0)
                        box24.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box24.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box24.getText().toString()=="2"){
                    box24.setText("3");
                    if(i%2==0 & i!=0)
                        box24.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box24.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box24.getText().toString()=="3"){
                    box24.setText("");
                    box23.setText("1");
                    box25.setText("1");
                    box19.setText("1");
                    box24.setBackground(getDrawable(R.drawable.whitebox));
                }

            }
        });
        box23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(box23.getText().toString()==""){
                    box23.setText("1");
                    if(i%2==0 & i!=0)
                        box23.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box23.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box23.getText().toString()=="1"){
                    box23.setText("2");
                    if(i%2==0 & i!=0)
                        box23.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box23.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box23.getText().toString()=="2"){
                    box23.setText("3");
                    if(i%2==0 & i!=0)
                        box23.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box23.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box23.getText().toString()=="3"){
                    box23.setText("");
                    box24.setText("1");
                    box22.setText("1");
                    box18.setText("1");
                    box23.setBackground(getDrawable(R.drawable.whitebox));

                }


            }
        });
        box22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(box22.getText().toString()==""){
                    box22.setText("1");
                    if(i%2==0 & i!=0)
                        box22.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box22.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box22.getText().toString()=="1"){
                    box22.setText("2");
                    if(i%2==0 & i!=0)
                        box22.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box1.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box2.getText().toString()=="2"){
                    box22.setText("3");
                    if(i%2==0 & i!=0)
                        box22.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box22.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box22.getText().toString()=="3"){
                    box22.setText("");
                    box21.setText("1");
                    box23.setText("1");
                    box17.setText("1");
                    box22.setBackground(getDrawable(R.drawable.whitebox));

                }


            }
        });
        box21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(box21.getText().toString()==""){
                    box21.setText("1");
                    if(i%2==0 & i!=0)
                        box21.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box21.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box21.getText().toString()=="1"){
                    box21.setText("2");
                    if(i%2==0 & i!=0)
                        box21.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box21.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box21.getText().toString()=="2"){
                    box21.setText("3");
                    if(i%2==0 & i!=0)
                        box21.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box21.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box21.getText().toString()=="3"){
                    box21.setText("");
                    box22.setText("1");
                    box16.setText("1");
                    box21.setBackground(getDrawable(R.drawable.whitebox));

                }


            }
        });
        box20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(box20.getText().toString()==""){
                    box20.setText("1");
                    if(i%2==0 & i!=0)
                        box20.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box20.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box20.getText().toString()=="1"){
                    box20.setText("2");
                    if(i%2==0 & i!=0)
                        box20.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box20.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box20.getText().toString()=="2"){
                    box20.setText("3");
                    if(i%2==0 & i!=0)
                        box20.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box20.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box20.getText().toString()=="3"){
                    box20.setText("");
                    box25.setText("1");
                    box15.setText("1");
                    box19.setText("1");
                    box20.setBackground(getDrawable(R.drawable.whitebox));
                }


            }
        });
        box19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(box19.getText().toString()==""){
                    box19.setText("1");
                    if(i%2==0 & i!=0)
                        box19.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box19.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box19.getText().toString()=="1"){
                    box19.setText("2");
                    if(i%2==0 & i!=0)
                        box19.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box19.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box19.getText().toString()=="2"){
                    box19.setText("3");
                    if(i%2==0 & i!=0)
                        box19.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box19.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box19.getText().toString()=="3"){
                    box19.setText("");
                    box18.setText("1");
                    box20.setText("1");
                    box24.setText("1");
                    box14.setText("1");
                    box19.setBackground(getDrawable(R.drawable.whitebox));
                }


            }
        });
        box18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(box18.getText().toString()==""){
                    box18.setText("1");
                    if(i%2==0 & i!=0)
                        box18.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box18.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box18.getText().toString()=="1"){
                    box18.setText("2");
                    if(i%2==0 & i!=0)
                        box18.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box18.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box18.getText().toString()=="2"){
                    box18.setText("3");
                    if(i%2==0 & i!=0)
                        box18.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box18.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box18.getText().toString()=="3"){
                    box18.setText("");
                    box19.setText("1");
                    box17.setText("1");
                    box23.setText("1");
                    box13.setText("1");
                    box18.setBackground(getDrawable(R.drawable.whitebox));
                }


            }
        });
        box17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(box17.getText().toString()==""){
                    box17.setText("1");
                    if(i%2==0 & i!=0)
                        box17.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box17.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box17.getText().toString()=="1"){
                    box17.setText("2");
                    if(i%2==0 & i!=0)
                        box17.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box17.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box17.getText().toString()=="2"){
                    box17.setText("3");
                    if(i%2==0 & i!=0)
                        box17.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box17.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box17.getText().toString()=="3"){
                    box17.setText("");
                    box16.setText("1");
                    box18.setText("1");
                    box22.setText("1");
                    box12.setText("1");
                    box17.setBackground(getDrawable(R.drawable.whitebox));
                }


            }
        });
        box16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(box16.getText().toString()==""){
                    box16.setText("1");
                    if(i%2==0 & i!=0)
                        box16.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box16.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box16.getText().toString()=="1"){
                    box16.setText("2");
                    if(i%2==0 & i!=0)
                        box16.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box16.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box16.getText().toString()=="2"){
                    box16.setText("3");
                    if(i%2==0 & i!=0)
                        box16.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box16.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box16.getText().toString()=="3"){
                    box16.setText("");
                    box17.setText("1");
                    box11.setText("1");
                    box21.setText("1");
                    box16.setBackground(getDrawable(R.drawable.whitebox));


                }


            }
        });
        box15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(box15.getText().toString()==""){
                    box15.setText("1");
                    if(i%2==0 & i!=0)
                        box15.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box15.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box15.getText().toString()=="1"){
                    box15.setText("2");
                    if(i%2==0 & i!=0)
                        box15.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box15.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box15.getText().toString()=="2"){
                    box15.setText("3");
                    if(i%2==0 & i!=0)
                        box15.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box15.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box15.getText().toString()=="3"){
                    box15.setText("");
                    box14.setText("1");
                    box10.setText("1");
                    box20.setText("1");
                    box15.setBackground(getDrawable(R.drawable.whitebox));

                }


            }
        });
        box14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(box14.getText().toString()==""){
                    box14.setText("1");
                    if(i%2==0 & i!=0)
                        box14.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box14.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box14.getText().toString()=="1"){
                    box14.setText("2");
                    if(i%2==0 & i!=0)
                        box14.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box14.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box14.getText().toString()=="2"){
                    box14.setText("3");
                    if(i%2==0 & i!=0)
                        box14.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box14.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box14.getText().toString()=="3"){
                    box14.setText("");
                    box19.setText("1");
                    box15.setText("1");
                    box13.setText("1");
                    box9.setText("1");
                    box14.setBackground(getDrawable(R.drawable.whitebox));
                }


            }
        });
        box13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(box13.getText().toString()==""){
                    box13.setText("1");
                    if(i%2==0 & i!=0)
                        box13.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box13.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box13.getText().toString()=="1"){
                    box13.setText("2");
                    if(i%2==0 & i!=0)
                        box13.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box13.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box13.getText().toString()=="2"){
                    box13.setText("3");
                    if(i%2==0 & i!=0)
                        box13.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box13.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box13.getText().toString()=="3"){
                    box13.setText("");
                    box14.setText("1");
                    box12.setText("1");
                    box18.setText("1");
                    box8.setText("1");
                    box13.setBackground(getDrawable(R.drawable.whitebox));
                }


            }
        });
        box12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(box12.getText().toString()==""){
                    box12.setText("1");
                    if(i%2==0 & i!=0)
                        box12.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box12.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box12.getText().toString()=="1"){
                    box12.setText("2");
                    if(i%2==0 & i!=0)
                        box12.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box12.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box12.getText().toString()=="2"){
                    box12.setText("3");
                    if(i%2==0 & i!=0)
                        box12.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box12.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box12.getText().toString()=="3"){
                    box12.setText("");
                    box13.setText("1");
                    box11.setText("1");
                    box17.setText("1");
                    box7.setText("1");
                    box12.setBackground(getDrawable(R.drawable.whitebox));
                }

            }
        });
        box11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(box11.getText().toString()==""){
                    box11.setText("1");
                    if(i%2==0 & i!=0)
                        box11.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box11.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box11.getText().toString()=="1"){
                    box11.setText("2");
                    if(i%2==0 & i!=0)
                        box11.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box11.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box11.getText().toString()=="2"){
                    box11.setText("3");
                    if(i%2==0 & i!=0)
                        box11.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box11.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box11.getText().toString()=="3"){
                    box11.setText("");
                    box6.setText("1");
                    box16.setText("1");
                    box12.setText("1");
                    box11.setBackground(getDrawable(R.drawable.whitebox));

                }


            }
        });
        box10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(box10.getText().toString()==""){
                    box10.setText("1");
                    if(i%2==0 & i!=0)
                        box10.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box10.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box10.getText().toString()=="1"){
                    box10.setText("2");
                    if(i%2==0 & i!=0)
                        box10.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box10.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box10.getText().toString()=="2"){
                    box10.setText("3");
                    if(i%2==0 & i!=0)
                        box10.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box10.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box10.getText().toString()=="3"){
                    box10.setText("");
                    box9.setText("1");
                    box5.setText("1");
                    box15.setText("1");
                    box10.setBackground(getDrawable(R.drawable.whitebox));

                }


            }
        });
        box9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(box9.getText().toString()==""){
                    box9.setText("1");
                    if(i%2==0 & i!=0)
                        box9.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box9.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box9.getText().toString()=="1"){
                    box9.setText("2");
                    if(i%2==0 & i!=0)
                        box9.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box9.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box9.getText().toString()=="2"){
                    box9.setText("3");
                    if(i%2==0 & i!=0)
                        box9.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box9.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box9.getText().toString()=="3"){
                    box9.setText("");
                    box8.setText("1");
                    box10.setText("1");
                    box14.setText("1");
                    box4.setText("1");
                    box9.setBackground(getDrawable(R.drawable.whitebox));
                }


            }
        });
        box8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(box8.getText().toString()==""){
                    box8.setText("1");
                    if(i%2==0 & i!=0)
                        box8.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box8.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box8.getText().toString()=="1"){
                    box8.setText("2");
                    if(i%2==0 & i!=0)
                        box8.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box8.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box8.getText().toString()=="2"){
                    box8.setText("3");
                    if(i%2==0 & i!=0)
                        box8.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box8.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box8.getText().toString()=="3"){
                    box8.setText("");
                    box7.setText("1");
                    box9.setText("1");
                    box13.setText("1");
                    box3.setText("1");
                    box8.setBackground(getDrawable(R.drawable.whitebox));
                }


            }
        });

        box7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(box7.getText().toString()==""){
                    box7.setText("1");
                    if(i%2==0 & i!=0)
                        box7.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box7.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box7.getText().toString()=="1"){
                    box7.setText("2");
                    if(i%2==0 & i!=0)
                        box7.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box7.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box7.getText().toString()=="2"){
                    box7.setText("3");
                    if(i%2==0 & i!=0)
                        box7.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box7.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box7.getText().toString()=="3"){
                    box7.setText("");
                    box2.setText("1");
                    box6.setText("1");
                    box8.setText("1");
                    box12.setText("1");
                    box7.setBackground(getDrawable(R.drawable.whitebox));
                }



            }
        });
        box6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(box6.getText().toString()==""){
                    box6.setText("1");
                    if(i%2==0 & i!=0)
                        box6.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box6.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box6.getText().toString()=="1") {
                    box6.setText("2");
                    if (i % 2 == 0 & i != 0)
                        box6.setBackground(getDrawable(R.drawable.bluebox));
                    else if (i % 2 != 0)
                        box6.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box6.getText().toString()=="2"){
                    box6.setText("3");
                    if(i%2==0 & i!=0)
                        box6.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box6.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box6.getText().toString()=="3"){
                    box6.setText("");
                    box1.setText("1");
                    box11.setText("1");
                    box7.setText("1");
                    box6.setBackground(getDrawable(R.drawable.whitebox));

                }




            }
        });
        box5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(box5.getText().toString()==""){
                    box5.setText("1");
                    if(i%2==0 & i!=0)
                        box5.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box5.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box5.getText().toString()=="1") {
                    box5.setText("2");
                    if (i % 2 == 0 & i != 0)
                        box5.setBackground(getDrawable(R.drawable.bluebox));
                    else if (i % 2 != 0)
                        box5.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box5.getText().toString()=="2"){
                    box5.setText("3");
                    if(i%2==0 & i!=0)
                        box5.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box5.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box5.getText().toString()=="3"){
                    box5.setText("");
                    box10.setText("1");
                    box4.setText("1");
                    box5.setBackground(getDrawable(R.drawable.whitebox));


                }


            }
        });
        box4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(box4.getText().toString()==""){
                    box4.setText("1");
                    if(i%2==0 & i!=0)
                        box4.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box4.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box4.getText().toString()=="1") {
                    box4.setText("2");
                    if (i % 2 == 0 & i != 0)
                        box4.setBackground(getDrawable(R.drawable.bluebox));
                    else if (i % 2 != 0)
                        box4.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box4.getText().toString()=="2"){
                    box4.setText("3");
                    if(i%2==0 & i!=0)
                        box4.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box4.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box4.getText().toString()=="3"){
                    box4.setText("");
                    box5.setText("1");
                    box3.setText("1");
                    box9.setText("1");
                    box4.setBackground(getDrawable(R.drawable.whitebox));

                }


            }
        });
        box3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(box3.getText().toString()==""){
                    box3.setText("1");
                    if(i%2==0 & i!=0)
                        box3.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box3.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box3.getText().toString()=="1"){ box3.setText("2");
                    if (i % 2 == 0 & i != 0)
                        box3.setBackground(getDrawable(R.drawable.bluebox));
                    else if (i % 2 != 0)
                        box3.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box3.getText().toString()=="2"){
                    box3.setText("3");
                    if(i%2==0 & i!=0)
                        box3.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box3.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box3.getText().toString()=="3"){
                    box3.setText("");
                    box2.setText("1");
                    box4.setText("1");
                    box8.setText("1");
                    box3.setBackground(getDrawable(R.drawable.whitebox));

                }


            }
        });

        box2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(box2.getText().toString()==""){
                    box2.setText("1");
                    if(i%2==0 & i!=0)
                        box2.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box2.setBackground(getDrawable(R.drawable.redbox));


                }
                else if(box2.getText().toString()=="1"){
                    box2.setText("2");
                    if(i%2==0 & i!=0)
                        box2.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box2.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box2.getText().toString()=="2"){
                    box2.setText("3");
                    if(i%2==0 & i!=0)
                        box2.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box2.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box2.getText().toString()=="3"){
                    box1.setText("1");
                    box3.setText("1");
                    box7.setText("1");
                    box2.setText("");
                    box2.setBackground(getDrawable(R.drawable.whitebox));
                }



            }
        });
        box1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                if(box1.getText().toString()==""){
                    box1.setText("1");
                    if(i%2==0 & i!=0)
                        box1.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box1.setBackground(getDrawable(R.drawable.redbox));

                }
                else if(box1.getText().toString()=="1"){
                    box1.setText("2");
                    if(i%2==0 & i!=0)
                        box1.setBackground(getDrawable(R.drawable.bluebox));

                    else if(i%2!=0)
                        box1.setBackground(getDrawable(R.drawable.redbox));
                }
                else if(box1.getText().toString()=="2"){
                    box1.setText("3");
                    if(i%2==0 & i!=0)
                        box1.setBackground(getDrawable(R.drawable.bluebox));
                    else if(i%2!=0)
                        box1.setBackground(getDrawable(R.drawable.redbox));


                }
                else if(box1.getText().toString()=="3"){
                    box2.setText("1");
                    box6.setText("1");
                    box1.setText("");
                    box1.setBackground(getDrawable(R.drawable.whitebox));
                    }









            }
        });





        String pl1=getIntent().getStringExtra("keyname");
        String pl2=getIntent().getStringExtra(("keysurname"));
        pLayer1.setText(pl1);
        pLayer2.setText(pl2);


        }
}