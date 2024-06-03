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
    boolean gameover=true;

    private TextView pLayer1,pLayer2;
    TextView score1,score2;
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
        score1=findViewById(R.id.score1);
        score2=findViewById(R.id.score2);

            box25.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    if (box25.getText().toString() == "") {
                        box25.setText("1");
                        if (i % 2 == 0 & i != 0)
                            box25.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box25.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box25.getText().toString() == "1") {
                        box25.setText("2");
                        if (i % 2 == 0 & i != 0)
                            box25.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box25.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box25.getText().toString() == "2") {
                        box25.setText("3");
                        if (i % 2 == 0 & i != 0)
                            box25.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box25.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box25.getText().toString() == "3") {
                        box25.setText("");
                        box24.setText("1");
                        box20.setText("1");
                        ColorDrawable box25back = (ColorDrawable) box25.getBackground();
                        int colorid25 = box25back.getColor();
                        box25.setBackground(getDrawable(R.drawable.whitebox));
                        if (colorid25 == Color.RED) {
                            box24.setBackgroundColor(Color.parseColor("#ff0000"));
                            box20.setBackgroundColor(Color.parseColor("#ff0000"));

                        } else if (colorid25 == Color.BLUE) {
                            box24.setBackgroundColor(Color.parseColor("#0000ff"));
                            box20.setBackgroundColor(Color.parseColor("#0000ff"));


                        }

                    }


                }
            });
            box24.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    if (box24.getText().toString() == "") {
                        box14.setText("1");
                        if (i % 2 == 0 & i != 0)
                            box24.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box24.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box24.getText().toString() == "1") {
                        box24.setText("2");
                        if (i % 2 == 0 & i != 0)
                            box24.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box24.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box24.getText().toString() == "2") {
                        box24.setText("3");
                        if (i % 2 == 0 & i != 0)
                            box24.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box24.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box24.getText().toString() == "3") {
                        box24.setText("");
                        box23.setText("1");
                        box25.setText("1");
                        box19.setText("1");
                        ColorDrawable box24back = (ColorDrawable) box24.getBackground();
                        int colorid24 = box24back.getColor();
                        box24.setBackground(getDrawable(R.drawable.whitebox));
                        if (colorid24 == Color.RED) {
                            box23.setBackgroundColor(Color.parseColor("#ff0000"));
                            box19.setBackgroundColor(Color.parseColor("#ff0000"));
                            box25.setBackgroundColor(Color.parseColor("#ff0000"));

                        } else if (colorid24 == Color.BLUE) {
                            box19.setBackgroundColor(Color.parseColor("#0000ff"));
                            box23.setBackgroundColor(Color.parseColor("#0000ff"));
                            box25.setBackgroundColor(Color.parseColor("#0000ff"));


                        }
                    }

                }
            });
            box23.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    if (box23.getText().toString() == "") {
                        box23.setText("1");
                        if (i % 2 == 0 & i != 0)
                            box23.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box23.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box23.getText().toString() == "1") {
                        box23.setText("2");
                        if (i % 2 == 0 & i != 0)
                            box23.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box23.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box23.getText().toString() == "2") {
                        box23.setText("3");
                        if (i % 2 == 0 & i != 0)
                            box23.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box23.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box23.getText().toString() == "3") {
                        box23.setText("");
                        box24.setText("1");
                        box22.setText("1");
                        box18.setText("1");
                        ColorDrawable box23back = (ColorDrawable) box23.getBackground();
                        int colorid23 = box23back.getColor();
                        box23.setBackground(getDrawable(R.drawable.whitebox));
                        if (colorid23 == Color.RED) {
                            box18.setBackgroundColor(Color.parseColor("#ff0000"));
                            box22.setBackgroundColor(Color.parseColor("#ff0000"));
                            box24.setBackgroundColor(Color.parseColor("#ff0000"));

                        } else if (colorid23 == Color.BLUE) {
                            box18.setBackgroundColor(Color.parseColor("#0000ff"));
                            box22.setBackgroundColor(Color.parseColor("#0000ff"));
                            box24.setBackgroundColor(Color.parseColor("#0000ff"));


                        }

                    }


                }
            });
            box22.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    if (box22.getText().toString() == "") {
                        box22.setText("1");
                        if (i % 2 == 0 & i != 0)
                            box22.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box22.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box22.getText().toString() == "1") {
                        box22.setText("2");
                        if (i % 2 == 0 & i != 0)
                            box22.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box22.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box2.getText().toString() == "2") {
                        box22.setText("3");
                        if (i % 2 == 0 & i != 0)
                            box22.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box22.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box22.getText().toString() == "3") {
                        box22.setText("");
                        box21.setText("1");
                        box23.setText("1");
                        box17.setText("1");
                        ColorDrawable box22back = (ColorDrawable) box22.getBackground();
                        int colorid22 = box22back.getColor();
                        box22.setBackground(getDrawable(R.drawable.whitebox));
                        if (colorid22 == Color.RED) {
                            box17.setBackgroundColor(Color.parseColor("#ff0000"));
                            box21.setBackgroundColor(Color.parseColor("#ff0000"));
                            box23.setBackgroundColor(Color.parseColor("#ff0000"));

                        } else if (colorid22 == Color.BLUE) {
                            box17.setBackgroundColor(Color.parseColor("#0000ff"));
                            box21.setBackgroundColor(Color.parseColor("#0000ff"));
                            box23.setBackgroundColor(Color.parseColor("#0000ff"));


                        }

                    }


                }
            });
            box21.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    if (box21.getText().toString() == "") {
                        box21.setText("1");
                        if (i % 2 == 0 & i != 0)
                            box21.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box21.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box21.getText().toString() == "1") {
                        box21.setText("2");
                        if (i % 2 == 0 & i != 0)
                            box21.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box21.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box21.getText().toString() == "2") {
                        box21.setText("3");
                        if (i % 2 == 0 & i != 0)
                            box21.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box21.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box21.getText().toString() == "3") {
                        box21.setText("");
                        box22.setText("1");
                        box16.setText("1");
                        ColorDrawable box21back = (ColorDrawable) box21.getBackground();
                        int colorid21 = box21back.getColor();
                        box21.setBackground(getDrawable(R.drawable.whitebox));
                        if (colorid21 == Color.RED) {
                            box16.setBackgroundColor(Color.parseColor("#ff0000"));
                            box22.setBackgroundColor(Color.parseColor("#ff0000"));

                        } else if (colorid21 == Color.BLUE) {
                            box16.setBackgroundColor(Color.parseColor("#0000ff"));
                            box22.setBackgroundColor(Color.parseColor("#0000ff"));


                        }

                    }


                }
            });
            box20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    if (box20.getText().toString() == "") {
                        box20.setText("1");
                        if (i % 2 == 0 & i != 0)
                            box20.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box20.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box20.getText().toString() == "1") {
                        box20.setText("2");
                        if (i % 2 == 0 & i != 0)
                            box20.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box20.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box20.getText().toString() == "2") {
                        box20.setText("3");
                        if (i % 2 == 0 & i != 0)
                            box20.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box20.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box20.getText().toString() == "3") {
                        box20.setText("");
                        box25.setText("1");
                        box15.setText("1");
                        box19.setText("1");
                        ColorDrawable box20back = (ColorDrawable) box20.getBackground();
                        int colorid20 = box20back.getColor();
                        box20.setBackground(getDrawable(R.drawable.whitebox));
                        if (colorid20 == Color.RED) {
                            box15.setBackgroundColor(Color.parseColor("#ff0000"));
                            box19.setBackgroundColor(Color.parseColor("#ff0000"));
                            box25.setBackgroundColor(Color.parseColor("#ff0000"));

                        } else if (colorid20 == Color.BLUE) {
                            box19.setBackgroundColor(Color.parseColor("#0000ff"));
                            box15.setBackgroundColor(Color.parseColor("#0000ff"));
                            box25.setBackgroundColor(Color.parseColor("#0000ff"));


                        }
                    }


                }
            });
            box19.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    if (box19.getText().toString() == "") {
                        box19.setText("1");
                        if (i % 2 == 0 & i != 0)
                            box19.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box19.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box19.getText().toString() == "1") {
                        box19.setText("2");
                        if (i % 2 == 0 & i != 0)
                            box19.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box19.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box19.getText().toString() == "2") {
                        box19.setText("3");
                        if (i % 2 == 0 & i != 0)
                            box19.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box19.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box19.getText().toString() == "3") {
                        box19.setText("");
                        box18.setText("1");
                        box20.setText("1");
                        box24.setText("1");
                        box14.setText("1");
                        ColorDrawable box19back = (ColorDrawable) box19.getBackground();
                        int colorid19 = box19back.getColor();
                        box19.setBackground(getDrawable(R.drawable.whitebox));
                        if (colorid19 == Color.RED) {
                            box18.setBackgroundColor(Color.parseColor("#ff0000"));
                            box20.setBackgroundColor(Color.parseColor("#ff0000"));
                            box14.setBackgroundColor(Color.parseColor("#ff0000"));
                            box24.setBackgroundColor(Color.parseColor("#ff0000"));

                        } else if (colorid19 == Color.BLUE) {
                            box18.setBackgroundColor(Color.parseColor("#0000ff"));
                            box20.setBackgroundColor(Color.parseColor("#0000ff"));
                            box14.setBackgroundColor(Color.parseColor("#0000ff"));
                            box24.setBackgroundColor(Color.parseColor("#0000ff"));


                        }
                    }


                }
            });
            box18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    if (box18.getText().toString() == "") {
                        box18.setText("1");
                        if (i % 2 == 0 & i != 0)
                            box18.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box18.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box18.getText().toString() == "1") {
                        box18.setText("2");
                        if (i % 2 == 0 & i != 0)
                            box18.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box18.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box18.getText().toString() == "2") {
                        box18.setText("3");
                        if (i % 2 == 0 & i != 0)
                            box18.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box18.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box18.getText().toString() == "3") {
                        box18.setText("");
                        box19.setText("1");
                        box17.setText("1");
                        box23.setText("1");
                        box13.setText("1");
                        ColorDrawable box18back = (ColorDrawable) box18.getBackground();
                        int colorid18 = box18back.getColor();
                        box18.setBackground(getDrawable(R.drawable.whitebox));
                        if (colorid18 == Color.RED) {
                            box19.setBackgroundColor(Color.parseColor("#ff0000"));
                            box17.setBackgroundColor(Color.parseColor("#ff0000"));
                            box13.setBackgroundColor(Color.parseColor("#ff0000"));
                            box23.setBackgroundColor(Color.parseColor("#ff0000"));

                        } else if (colorid18 == Color.BLUE) {
                            box19.setBackgroundColor(Color.parseColor("#0000ff"));
                            box17.setBackgroundColor(Color.parseColor("#0000ff"));
                            box13.setBackgroundColor(Color.parseColor("#0000ff"));
                            box23.setBackgroundColor(Color.parseColor("#0000ff"));


                        }
                    }


                }
            });
            box17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    if (box17.getText().toString() == "") {
                        box17.setText("1");
                        if (i % 2 == 0 & i != 0)
                            box17.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box17.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box17.getText().toString() == "1") {
                        box17.setText("2");
                        if (i % 2 == 0 & i != 0)
                            box17.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box17.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box17.getText().toString() == "2") {
                        box17.setText("3");
                        if (i % 2 == 0 & i != 0)
                            box17.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box17.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box17.getText().toString() == "3") {
                        box17.setText("");
                        box16.setText("1");
                        box18.setText("1");
                        box22.setText("1");
                        box12.setText("1");
                        ColorDrawable box17back = (ColorDrawable) box17.getBackground();
                        int colorid17 = box17back.getColor();
                        box17.setBackground(getDrawable(R.drawable.whitebox));
                        if (colorid17 == Color.RED) {
                            box16.setBackgroundColor(Color.parseColor("#ff0000"));
                            box18.setBackgroundColor(Color.parseColor("#ff0000"));
                            box12.setBackgroundColor(Color.parseColor("#ff0000"));
                            box22.setBackgroundColor(Color.parseColor("#ff0000"));

                        } else if (colorid17 == Color.BLUE) {
                            box16.setBackgroundColor(Color.parseColor("#0000ff"));
                            box18.setBackgroundColor(Color.parseColor("#0000ff"));
                            box12.setBackgroundColor(Color.parseColor("#0000ff"));
                            box22.setBackgroundColor(Color.parseColor("#0000ff"));


                        }
                    }


                }
            });
            box16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    if (box16.getText().toString() == "") {
                        box16.setText("1");
                        if (i % 2 == 0 & i != 0)
                            box16.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box16.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box16.getText().toString() == "1") {
                        box16.setText("2");
                        if (i % 2 == 0 & i != 0)
                            box16.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box16.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box16.getText().toString() == "2") {
                        box16.setText("3");
                        if (i % 2 == 0 & i != 0)
                            box16.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box16.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box16.getText().toString() == "3") {
                        box16.setText("");
                        box17.setText("1");
                        box11.setText("1");
                        box21.setText("1");
                        ColorDrawable box16back = (ColorDrawable) box16.getBackground();
                        int colorid16 = box16back.getColor();
                        box16.setBackground(getDrawable(R.drawable.whitebox));
                        if (colorid16 == Color.RED) {
                            box17.setBackgroundColor(Color.parseColor("#ff0000"));
                            box11.setBackgroundColor(Color.parseColor("#ff0000"));
                            box21.setBackgroundColor(Color.parseColor("#ff0000"));

                        } else if (colorid16 == Color.BLUE) {
                            box17.setBackgroundColor(Color.parseColor("#0000ff"));
                            box11.setBackgroundColor(Color.parseColor("#0000ff"));
                            box21.setBackgroundColor(Color.parseColor("#0000ff"));


                        }


                    }


                }
            });
            box15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    if (box15.getText().toString() == "") {
                        box15.setText("1");
                        if (i % 2 == 0 & i != 0)
                            box15.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box15.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box15.getText().toString() == "1") {
                        box15.setText("2");
                        if (i % 2 == 0 & i != 0)
                            box15.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box15.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box15.getText().toString() == "2") {
                        box15.setText("3");
                        if (i % 2 == 0 & i != 0)
                            box15.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box15.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box15.getText().toString() == "3") {
                        box15.setText("");
                        box14.setText("1");
                        box10.setText("1");
                        box20.setText("1");
                        ColorDrawable box15back = (ColorDrawable) box15.getBackground();
                        int colorid15 = box15back.getColor();
                        box15.setBackground(getDrawable(R.drawable.whitebox));
                        if (colorid15 == Color.RED) {
                            box14.setBackgroundColor(Color.parseColor("#ff0000"));
                            box10.setBackgroundColor(Color.parseColor("#ff0000"));
                            box20.setBackgroundColor(Color.parseColor("#ff0000"));

                        } else if (colorid15 == Color.BLUE) {
                            box14.setBackgroundColor(Color.parseColor("#0000ff"));
                            box10.setBackgroundColor(Color.parseColor("#0000ff"));
                            box20.setBackgroundColor(Color.parseColor("#0000ff"));


                        }

                    }


                }
            });
            box14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    if (box14.getText().toString() == "") {
                        box14.setText("1");
                        if (i % 2 == 0 & i != 0)
                            box14.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box14.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box14.getText().toString() == "1") {
                        box14.setText("2");
                        if (i % 2 == 0 & i != 0)
                            box14.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box14.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box14.getText().toString() == "2") {
                        box14.setText("3");
                        if (i % 2 == 0 & i != 0)
                            box14.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box14.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box14.getText().toString() == "3") {
                        box14.setText("");
                        box19.setText("1");
                        box15.setText("1");
                        box13.setText("1");
                        box9.setText("1");
                        ColorDrawable box14back = (ColorDrawable) box14.getBackground();
                        int colorid14 = box14back.getColor();
                        box14.setBackground(getDrawable(R.drawable.whitebox));
                        if (colorid14 == Color.RED) {
                            box19.setBackgroundColor(Color.parseColor("#ff0000"));
                            box15.setBackgroundColor(Color.parseColor("#ff0000"));
                            box13.setBackgroundColor(Color.parseColor("#ff0000"));
                            box9.setBackgroundColor(Color.parseColor("#ff0000"));

                        } else if (colorid14 == Color.BLUE) {
                            box19.setBackgroundColor(Color.parseColor("#0000ff"));
                            box15.setBackgroundColor(Color.parseColor("#0000ff"));
                            box13.setBackgroundColor(Color.parseColor("#0000ff"));
                            box9.setBackgroundColor(Color.parseColor("#0000ff"));


                        }
                    }


                }
            });
            box13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    if (box13.getText().toString() == "") {
                        box13.setText("1");
                        if (i % 2 == 0 & i != 0)
                            box13.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box13.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box13.getText().toString() == "1") {
                        box13.setText("2");
                        if (i % 2 == 0 & i != 0)
                            box13.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box13.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box13.getText().toString() == "2") {
                        box13.setText("3");
                        if (i % 2 == 0 & i != 0)
                            box13.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box13.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box13.getText().toString() == "3") {
                        box13.setText("");
                        box14.setText("1");
                        box12.setText("1");
                        box18.setText("1");
                        box8.setText("1");
                        ColorDrawable box13back = (ColorDrawable) box13.getBackground();
                        int colorid13 = box13back.getColor();
                        box13.setBackground(getDrawable(R.drawable.whitebox));
                        if (colorid13 == Color.RED) {
                            box14.setBackgroundColor(Color.parseColor("#ff0000"));
                            box8.setBackgroundColor(Color.parseColor("#ff0000"));
                            box12.setBackgroundColor(Color.parseColor("#ff0000"));
                            box18.setBackgroundColor(Color.parseColor("#ff0000"));

                        } else if (colorid13 == Color.BLUE) {
                            box6.setBackgroundColor(Color.parseColor("#0000ff"));
                            box8.setBackgroundColor(Color.parseColor("#0000ff"));
                            box12.setBackgroundColor(Color.parseColor("#0000ff"));
                            box2.setBackgroundColor(Color.parseColor("#0000ff"));


                        }
                    }


                }
            });
            box12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    if (box12.getText().toString() == "") {
                        box12.setText("1");
                        if (i % 2 == 0 & i != 0)
                            box12.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box12.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box12.getText().toString() == "1") {
                        box12.setText("2");
                        if (i % 2 == 0 & i != 0)
                            box12.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box12.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box12.getText().toString() == "2") {
                        box12.setText("3");
                        if (i % 2 == 0 & i != 0)
                            box12.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box12.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box12.getText().toString() == "3") {
                        box12.setText("");
                        box13.setText("1");
                        box11.setText("1");
                        box17.setText("1");
                        box7.setText("1");
                        ColorDrawable box12back = (ColorDrawable) box12.getBackground();
                        int colorid12 = box12back.getColor();
                        box12.setBackground(getDrawable(R.drawable.whitebox));
                        if (colorid12 == Color.RED) {
                            box13.setBackgroundColor(Color.parseColor("#ff0000"));
                            box11.setBackgroundColor(Color.parseColor("#ff0000"));
                            box17.setBackgroundColor(Color.parseColor("#ff0000"));
                            box7.setBackgroundColor(Color.parseColor("#ff0000"));

                        } else if (colorid12 == Color.BLUE) {
                            box13.setBackgroundColor(Color.parseColor("#0000ff"));
                            box11.setBackgroundColor(Color.parseColor("#0000ff"));
                            box17.setBackgroundColor(Color.parseColor("#0000ff"));
                            box7.setBackgroundColor(Color.parseColor("#0000ff"));


                        }
                    }

                }
            });
            box11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    if (box11.getText().toString() == "") {
                        box11.setText("1");
                        if (i % 2 == 0 & i != 0)
                            box11.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box11.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box11.getText().toString() == "1") {
                        box11.setText("2");
                        if (i % 2 == 0 & i != 0)
                            box11.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box11.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box11.getText().toString() == "2") {
                        box11.setText("3");
                        if (i % 2 == 0 & i != 0)
                            box11.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box11.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box11.getText().toString() == "3") {
                        box11.setText("");
                        box6.setText("1");
                        box16.setText("1");
                        box12.setText("1");
                        ColorDrawable box11back = (ColorDrawable) box11.getBackground();
                        int colorid11 = box11back.getColor();
                        box11.setBackground(getDrawable(R.drawable.whitebox));
                        if (colorid11 == Color.RED) {
                            box6.setBackgroundColor(Color.parseColor("#ff0000"));
                            box12.setBackgroundColor(Color.parseColor("#ff0000"));
                            box16.setBackgroundColor(Color.parseColor("#ff0000"));

                        } else if (colorid11 == Color.BLUE) {
                            box6.setBackgroundColor(Color.parseColor("#0000ff"));
                            box16.setBackgroundColor(Color.parseColor("#0000ff"));
                            box12.setBackgroundColor(Color.parseColor("#0000ff"));


                        }

                    }


                }
            });
            box10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    if (box10.getText().toString() == "") {
                        box10.setText("1");
                        if (i % 2 == 0 & i != 0)
                            box10.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box10.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box10.getText().toString() == "1") {
                        box10.setText("2");
                        if (i % 2 == 0 & i != 0)
                            box10.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box10.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box10.getText().toString() == "2") {
                        box10.setText("3");
                        if (i % 2 == 0 & i != 0)
                            box10.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box10.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box10.getText().toString() == "3") {
                        box10.setText("");
                        box9.setText("1");
                        box5.setText("1");
                        box15.setText("1");
                        ColorDrawable box10back = (ColorDrawable) box10.getBackground();
                        int colorid10 = box10back.getColor();
                        box10.setBackground(getDrawable(R.drawable.whitebox));
                        if (colorid10 == Color.RED) {
                            box9.setBackgroundColor(Color.parseColor("#ff0000"));
                            box15.setBackgroundColor(Color.parseColor("#ff0000"));
                            box5.setBackgroundColor(Color.parseColor("#ff0000"));

                        } else if (colorid10 == Color.BLUE) {
                            box9.setBackgroundColor(Color.parseColor("#0000ff"));
                            box15.setBackgroundColor(Color.parseColor("#0000ff"));
                            box5.setBackgroundColor(Color.parseColor("#0000ff"));


                        }

                    }


                }
            });
            box9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    if (box9.getText().toString() == "") {
                        box9.setText("1");
                        if (i % 2 == 0 & i != 0)
                            box9.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box9.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box9.getText().toString() == "1") {
                        box9.setText("2");
                        if (i % 2 == 0 & i != 0)
                            box9.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box9.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box9.getText().toString() == "2") {
                        box9.setText("3");
                        if (i % 2 == 0 & i != 0)
                            box9.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box9.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box9.getText().toString() == "3") {
                        box9.setText("");
                        box8.setText("1");
                        box10.setText("1");
                        box14.setText("1");
                        box4.setText("1");
                        ColorDrawable box9back = (ColorDrawable) box9.getBackground();
                        int colorid9 = box9back.getColor();
                        box9.setBackground(getDrawable(R.drawable.whitebox));
                        if (colorid9 == Color.RED) {
                            box10.setBackgroundColor(Color.parseColor("#ff0000"));
                            box8.setBackgroundColor(Color.parseColor("#ff0000"));
                            box14.setBackgroundColor(Color.parseColor("#ff0000"));
                            box4.setBackgroundColor(Color.parseColor("#ff0000"));

                        } else if (colorid9 == Color.BLUE) {
                            box10.setBackgroundColor(Color.parseColor("#0000ff"));
                            box8.setBackgroundColor(Color.parseColor("#0000ff"));
                            box14.setBackgroundColor(Color.parseColor("#0000ff"));
                            box4.setBackgroundColor(Color.parseColor("#0000ff"));


                        }
                    }


                }
            });
            box8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    if (box8.getText().toString() == "") {
                        box8.setText("1");
                        if (i % 2 == 0 & i != 0)
                            box8.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box8.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box8.getText().toString() == "1") {
                        box8.setText("2");
                        if (i % 2 == 0 & i != 0)
                            box8.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box8.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box8.getText().toString() == "2") {
                        box8.setText("3");
                        if (i % 2 == 0 & i != 0)
                            box8.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box8.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box8.getText().toString() == "3") {
                        box8.setText("");
                        box7.setText("1");
                        box9.setText("1");
                        box13.setText("1");
                        box3.setText("1");
                        ColorDrawable box8back = (ColorDrawable) box8.getBackground();
                        int colorid8 = box8back.getColor();
                        box8.setBackground(getDrawable(R.drawable.whitebox));
                        if (colorid8 == Color.RED) {
                            box7.setBackgroundColor(Color.parseColor("#ff0000"));
                            box9.setBackgroundColor(Color.parseColor("#ff0000"));
                            box13.setBackgroundColor(Color.parseColor("#ff0000"));
                            box3.setBackgroundColor(Color.parseColor("#ff0000"));

                        } else if (colorid8 == Color.BLUE) {
                            box7.setBackgroundColor(Color.parseColor("#0000ff"));
                            box9.setBackgroundColor(Color.parseColor("#0000ff"));
                            box13.setBackgroundColor(Color.parseColor("#0000ff"));
                            box3.setBackgroundColor(Color.parseColor("#0000ff"));


                        }
                    }


                }
            });

            box7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    if (box7.getText().toString() == "") {
                        box7.setText("1");
                        if (i % 2 == 0 & i != 0)
                            box7.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box7.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box7.getText().toString() == "1") {
                        box7.setText("2");
                        if (i % 2 == 0 & i != 0)
                            box7.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box7.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box7.getText().toString() == "2") {
                        box7.setText("3");
                        if (i % 2 == 0 & i != 0)
                            box7.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box7.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box7.getText().toString() == "3") {
                        box7.setText("");
                        box2.setText("1");
                        box6.setText("1");
                        box8.setText("1");
                        box12.setText("1");
                        ColorDrawable box7back = (ColorDrawable) box7.getBackground();
                        int colorid7 = box7back.getColor();
                        box7.setBackground(getDrawable(R.drawable.whitebox));
                        if (colorid7 == Color.RED) {
                            box6.setBackgroundColor(Color.parseColor("#ff0000"));
                            box8.setBackgroundColor(Color.parseColor("#ff0000"));
                            box12.setBackgroundColor(Color.parseColor("#ff0000"));
                            box2.setBackgroundColor(Color.parseColor("#ff0000"));

                        } else if (colorid7 == Color.BLUE) {
                            box6.setBackgroundColor(Color.parseColor("#0000ff"));
                            box8.setBackgroundColor(Color.parseColor("#0000ff"));
                            box12.setBackgroundColor(Color.parseColor("#0000ff"));
                            box2.setBackgroundColor(Color.parseColor("#0000ff"));


                        }
                    }


                }
            });
            box6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    if (box6.getText().toString() == "") {
                        box6.setText("1");
                        if (i % 2 == 0 & i != 0)
                            box6.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box6.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box6.getText().toString() == "1") {
                        box6.setText("2");
                        if (i % 2 == 0 & i != 0)
                            box6.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box6.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box6.getText().toString() == "2") {
                        box6.setText("3");
                        if (i % 2 == 0 & i != 0)
                            box6.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box6.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box6.getText().toString() == "3") {
                        box6.setText("");
                        box1.setText("1");
                        box11.setText("1");
                        box7.setText("1");
                        ColorDrawable box6back = (ColorDrawable) box6.getBackground();
                        int colorid6 = box6back.getColor();
                        box6.setBackground(getDrawable(R.drawable.whitebox));
                        if (colorid6 == Color.RED) {
                            box1.setBackgroundColor(Color.parseColor("#ff0000"));
                            box11.setBackgroundColor(Color.parseColor("#ff0000"));
                            box7.setBackgroundColor(Color.parseColor("#ff0000"));

                        } else if (colorid6 == Color.BLUE) {
                            box1.setBackgroundColor(Color.parseColor("#0000ff"));
                            box11.setBackgroundColor(Color.parseColor("#0000ff"));
                            box7.setBackgroundColor(Color.parseColor("#0000ff"));


                        }

                    }


                }
            });
            box5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    if (box5.getText().toString() == "") {
                        box5.setText("1");
                        if (i % 2 == 0 & i != 0)
                            box5.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box5.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box5.getText().toString() == "1") {
                        box5.setText("2");
                        if (i % 2 == 0 & i != 0)
                            box5.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box5.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box5.getText().toString() == "2") {
                        box5.setText("3");
                        if (i % 2 == 0 & i != 0)
                            box5.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box5.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box5.getText().toString() == "3") {
                        box5.setText("");
                        box10.setText("1");
                        box4.setText("1");
                        ColorDrawable box5back = (ColorDrawable) box5.getBackground();
                        int colorid5 = box5back.getColor();
                        box5.setBackground(getDrawable(R.drawable.whitebox));
                        if (colorid5 == Color.RED) {
                            box10.setBackgroundColor(Color.parseColor("#ff0000"));
                            box4.setBackgroundColor(Color.parseColor("#ff0000"));

                        } else if (colorid5 == Color.BLUE) {
                            box10.setBackgroundColor(Color.parseColor("#0000ff"));
                            box4.setBackgroundColor(Color.parseColor("#0000ff"));


                        }


                    }


                }
            });
            box4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    if (box4.getText().toString() == "") {
                        box4.setText("1");
                        if (i % 2 == 0 & i != 0)
                            box4.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box4.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box4.getText().toString() == "1") {
                        box4.setText("2");
                        if (i % 2 == 0 & i != 0)
                            box4.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box4.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box4.getText().toString() == "2") {
                        box4.setText("3");
                        if (i % 2 == 0 & i != 0)
                            box4.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box4.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box4.getText().toString() == "3") {
                        box4.setText("");
                        box5.setText("1");
                        box3.setText("1");
                        box9.setText("1");
                        ColorDrawable box4back = (ColorDrawable) box4.getBackground();
                        int colorid4 = box4back.getColor();
                        box4.setBackground(getDrawable(R.drawable.whitebox));
                        if (colorid4 == Color.RED) {
                            box5.setBackgroundColor(Color.parseColor("#ff0000"));
                            box3.setBackgroundColor(Color.parseColor("#ff0000"));
                            box9.setBackgroundColor(Color.parseColor("#ff0000"));

                        } else if (colorid4 == Color.BLUE) {
                            box5.setBackgroundColor(Color.parseColor("#0000ff"));
                            box3.setBackgroundColor(Color.parseColor("#0000ff"));
                            box9.setBackgroundColor(Color.parseColor("#0000ff"));


                        }

                    }


                }
            });
            box3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    if (box3.getText().toString() == "") {
                        box3.setText("1");
                        if (i % 2 == 0 & i != 0)
                            box3.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box3.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box3.getText().toString() == "1") {
                        box3.setText("2");
                        if (i % 2 == 0 & i != 0)
                            box3.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box3.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box3.getText().toString() == "2") {
                        box3.setText("3");
                        if (i % 2 == 0 & i != 0)
                            box3.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box3.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box3.getText().toString() == "3") {
                        box3.setText("");
                        box2.setText("1");
                        box4.setText("1");
                        box8.setText("1");
                        ColorDrawable box3back = (ColorDrawable) box3.getBackground();
                        int colorid3 = box3back.getColor();
                        box3.setBackground(getDrawable(R.drawable.whitebox));
                        if (colorid3 == Color.RED) {
                            box2.setBackgroundColor(Color.parseColor("#ff0000"));
                            box4.setBackgroundColor(Color.parseColor("#ff0000"));
                            box8.setBackgroundColor(Color.parseColor("#ff0000"));

                        } else if (colorid3 == Color.BLUE) {
                            box2.setBackgroundColor(Color.parseColor("#0000ff"));
                            box4.setBackgroundColor(Color.parseColor("#0000ff"));
                            box8.setBackgroundColor(Color.parseColor("#0000ff"));


                        }

                    }


                }
            });

            box2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    int sum3 = 0, sum4 = 0;
                    if (box2.getText().toString() == "") {
                        box2.setText("1");
                        if (i % 2 == 0)
                            sum3 = sum3 + 1;
                        else
                            sum4 = sum4 + 1;
                        if (i % 2 == 0 & i != 0)
                            box2.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box2.setBackgroundColor(Color.parseColor("#ff0000"));


                    } else if (box2.getText().toString() == "1") {
                        box2.setText("2");
                        if (i % 2 == 0)
                            sum3 = sum3 + 1;
                        else
                            sum4 = sum4 + 1;
                        if (i % 2 == 0 & i != 0)
                            box2.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box2.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box2.getText().toString() == "2") {
                        box2.setText("3");
                        if (i % 2 == 0)
                            sum3 = sum3 + 1;
                        else
                            sum4 = sum4 + 1;
                        if (i % 2 == 0 & i != 0)
                            box2.setBackgroundColor(Color.parseColor("#0000ff"));
                        else if (i % 2 != 0)
                            box2.setBackgroundColor(Color.parseColor("#ff0000"));
                    } else if (box2.getText().toString() == "3") {
                        box1.setText("1");
                        box3.setText("1");
                        box7.setText("1");
                        box2.setText("");
                        ColorDrawable box2back = (ColorDrawable) box2.getBackground();
                        int colorid2 = box2back.getColor();
                        box2.setBackground(getDrawable(R.drawable.whitebox));
                        if (i % 2 == 0)
                            sum3 = sum3 + 1;
                        else
                            sum4 = sum4 + 1;
                        if (colorid2 == Color.RED) {
                            box1.setBackgroundColor(Color.parseColor("#ff0000"));
                            box3.setBackgroundColor(Color.parseColor("#ff0000"));
                            box7.setBackgroundColor(Color.parseColor("#ff0000"));

                        } else if (colorid2 == Color.BLUE) {
                            box1.setBackgroundColor(Color.parseColor("#0000ff"));
                            box3.setBackgroundColor(Color.parseColor("#0000ff"));
                            box7.setBackgroundColor(Color.parseColor("#0000ff"));


                        }
                    }


                }
            });
            box1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    int sum1 = 0;
                    int sum2 = 0;
                    if (box1.getText().toString() == "") {
                        box1.setText("1");

                        if (i % 2 == 0 & i != 0) {
                            box1.setBackgroundColor(Color.parseColor("#0000ff"));

                        } else if (i % 2 != 0) {
                            box1.setBackgroundColor(Color.parseColor("#ff0000"));

                        }

                    } else if (box1.getText().toString() == "1") {
                        box1.setText("2");

                        if (i % 2 == 0 & i != 0) {
                            box1.setBackgroundColor(Color.parseColor("#0000ff"));

                        } else if (i % 2 != 0) {
                            box1.setBackgroundColor(Color.parseColor("#ff0000"));

                        }

                    } else if (box1.getText().toString() == "2") {
                        box1.setText("3");

                        if (i % 2 == 0 & i != 0) {
                            box1.setBackgroundColor(Color.parseColor("#0000ff"));

                        } else if (i % 2 != 0) {
                            box1.setBackgroundColor(Color.parseColor("#ff0000"));

                        }


                    } else if (box1.getText().toString() == "3") {
                        box2.setText("1");
                        box6.setText("1");
                        box1.setText("");
                        ColorDrawable box1back = (ColorDrawable) box1.getBackground();
                        int colorid1 = box1back.getColor();
                        box1.setBackground(getDrawable(R.drawable.whitebox));


                        if (colorid1 == Color.RED) {
                            box2.setBackgroundColor(Color.parseColor("#ff0000"));
                            box6.setBackgroundColor(Color.parseColor("#ff0000"));


                        } else if (colorid1 == Color.BLUE) {
                            box2.setBackgroundColor(Color.parseColor("#0000ff"));
                            box6.setBackgroundColor(Color.parseColor("#0000ff"));


                        }
                    }


                }
            });














        String pl1=getIntent().getStringExtra("keyname");
        String pl2=getIntent().getStringExtra(("keysurname"));
        pLayer1.setText(pl1);
        pLayer2.setText(pl2);








        }
}