package com.example.delta;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private Button start;
    private EditText pla1,pla2;
    ImageView image1,image2;
    Drawable drawable1,drawable2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        pla1=findViewById(R.id.Play1);
        pla2=findViewById(R.id.Play2);
        start=findViewById(R.id.start);
        image1= this.<ImageView>findViewById(R.id.image1);
        drawable1=getResources().getDrawable(R.drawable.blue);
        image1.setImageDrawable(drawable1);
        image2=this.<ImageView>findViewById(R.id.image2);
        drawable2=getResources().getDrawable(R.drawable.red);
        image2.setImageDrawable(drawable2);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String pl1=pla1.getText().toString();
                String pl2=pla2.getText().toString();
                if(pl1.isEmpty() || pl2.isEmpty()){
                    Toast.makeText(MainActivity2.this, "Please Enter Player Name", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                    intent.putExtra("keyname", pl1);
                    intent.putExtra("keysurname", pl2);
                    startActivity(intent);
                }

            }
        });

    }
}