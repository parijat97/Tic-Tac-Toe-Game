package com.example.ticktackto;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView img0,img1,img2,img3,img4,img5,img6,img7,img8;
    boolean cross,zero;
    boolean first;
    Button btn1,btn2,btn3;
    char[] gamestate = {'a','a','a','a','a','a','a','a','a'};
    String win = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first = true;
        img0 = findViewById(R.id.img0);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        img7 = findViewById(R.id.img7);
        img8 = findViewById(R.id.img8);
        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(first){
                    cross = true;
                    zero = false;
                }
                first = false;
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(first){
                    cross = false;
                    zero = true;
                }
                first = false;
            }
        });
        img0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!winner(view)) {
                    if (img0.getDrawable() == null) {
                        if (cross) {
                            img0.setImageResource(R.drawable.corss1);
                            gamestate[0] = 'c';
                            cross = false;
                            zero = true;
                        } else if (zero) {
                            img0.setImageResource(R.drawable.zero1);
                            gamestate[0] = 'z';
                            cross = true;
                            zero = false;
                        }
                    }
                }else{
                    Toast.makeText(getApplicationContext(), win , Toast.LENGTH_LONG).show();
                }
            }
        });
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!winner(view)) {
                    if (img1.getDrawable() == null) {
                        if (cross) {
                            img1.setImageResource(R.drawable.corss1);
                            gamestate[1] = 'c';
                            cross = false;
                            zero = true;
                        } else if (zero) {
                            img1.setImageResource(R.drawable.zero1);
                            gamestate[1] = 'z';
                            cross = true;
                            zero = false;
                        }
                    }
                }else{
                    Toast.makeText(getApplicationContext(), win , Toast.LENGTH_LONG).show();
                }
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!winner(view)) {
                    if (img2.getDrawable() == null) {
                        if (cross) {
                            img2.setImageResource(R.drawable.corss1);
                            gamestate[2] = 'c';
                            cross = false;
                            zero = true;
                        } else if (zero) {
                            img2.setImageResource(R.drawable.zero1);
                            gamestate[2] = 'z';
                            cross = true;
                            zero = false;
                        }
                    }
                }else{
                    Toast.makeText(getApplicationContext(), win , Toast.LENGTH_LONG).show();
                }
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!winner(view)) {
                    if (img3.getDrawable() == null) {
                        if (cross) {
                            img3.setImageResource(R.drawable.corss1);
                            gamestate[3] = 'c';
                            cross = false;
                            zero = true;
                        } else if (zero) {
                            img3.setImageResource(R.drawable.zero1);
                            gamestate[3] = 'z';
                            cross = true;
                            zero = false;
                        }
                    }
                }else{
                    Toast.makeText(getApplicationContext(), win , Toast.LENGTH_LONG).show();
                }
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!winner(view)) {
                    if (img4.getDrawable() == null) {
                        if (cross) {
                            img4.setImageResource(R.drawable.corss1);
                            gamestate[4] = 'c';
                            cross = false;
                            zero = true;
                        } else if (zero) {
                            img4.setImageResource(R.drawable.zero1);
                            gamestate[4] = 'z';
                            cross = true;
                            zero = false;
                        }
                    }
                }else{
                    Toast.makeText(getApplicationContext(), win , Toast.LENGTH_LONG).show();
                }
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!winner(view)) {
                    if (img5.getDrawable() == null) {
                        if (cross) {
                            img5.setImageResource(R.drawable.corss1);
                            gamestate[5] = 'c';
                            cross = false;
                            zero = true;
                        } else if (zero) {
                            img5.setImageResource(R.drawable.zero1);
                            gamestate[5] = 'z';
                            cross = true;
                            zero = false;
                        }
                    }
                }else{
                    Toast.makeText(getApplicationContext(), win , Toast.LENGTH_LONG).show();
                }
            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!winner(view)) {
                    if (img6.getDrawable() == null) {
                        if (cross) {
                            img6.setImageResource(R.drawable.corss1);
                            gamestate[6] = 'c';
                            cross = false;
                            zero = true;
                        } else if (zero) {
                            img6.setImageResource(R.drawable.zero1);
                            gamestate[6] = 'z';
                            cross = true;
                            zero = false;
                        }
                    }
                }else{
                    Toast.makeText(getApplicationContext(), win , Toast.LENGTH_LONG).show();
                }
            }
        });
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!winner(view)) {
                    if (img7.getDrawable() == null) {
                        if (cross) {
                            img7.setImageResource(R.drawable.corss1);
                            gamestate[7] = 'c';
                            cross = false;
                            zero = true;
                        } else if (zero) {
                            img7.setImageResource(R.drawable.zero1);
                            gamestate[7] = 'z';
                            cross = true;
                            zero = false;
                        }
                    }
                }else{
                    Toast.makeText(getApplicationContext(), win , Toast.LENGTH_LONG).show();
                }
            }
        });
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!winner(view)) {
                    if (img8.getDrawable() == null) {
                        if (cross) {
                            img8.setImageResource(R.drawable.corss1);
                            gamestate[8] = 'c';
                            cross = false;
                            zero = true;
                        } else if (zero) {
                            img8.setImageResource(R.drawable.zero1);
                            gamestate[8] = 'z';
                            cross = true;
                            zero = false;
                        }
                    }
                }else{
                    Toast.makeText(getApplicationContext(), win , Toast.LENGTH_LONG).show();
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img0.setImageDrawable(null);
                img1.setImageDrawable(null);
                img2.setImageDrawable(null);
                img3.setImageDrawable(null);
                img4.setImageDrawable(null);
                img5.setImageDrawable(null);
                img6.setImageDrawable(null);
                img7.setImageDrawable(null);
                img8.setImageDrawable(null);
                char[] c = {'a','a','a','a','a','a','a','a','a'};
                gamestate = c;
                cross = false;
                zero = false;
                first = true;
            }
        });
    }

    protected boolean winner(View view){

        if(gamestate[0] != 'a' &&(gamestate[0]==gamestate[1] && gamestate[1]==gamestate[2])){
            if(gamestate[0]=='c') win = "Cross";
            else win = "Zero";
            return true;
        }else if(gamestate[3] != 'a' &&(gamestate[3]==gamestate[4] && gamestate[4]==gamestate[5])){
            if(gamestate[3]=='c') win = "Cross";
            else win = "Zero";
            return true;
        }else if(gamestate[6] != 'a' &&(gamestate[6]==gamestate[7] && gamestate[7]==gamestate[8])){
            if(gamestate[6]=='c') win = "Cross";
            else win = "Zero";
            return true;
        }else if(gamestate[0] != 'a' &&(gamestate[0]==gamestate[3] && gamestate[3]==gamestate[6])){
            if(gamestate[0]=='c') win = "Cross";
            else win = "Zero";
            return true;
        }else if(gamestate[1] != 'a' &&(gamestate[1]==gamestate[4] && gamestate[4]==gamestate[7])){
            if(gamestate[1]=='c') win = "Cross";
            else win = "Zero";
            return true;
        }else if(gamestate[2] != 'a' &&(gamestate[2]==gamestate[5] && gamestate[5]==gamestate[8])){
            if(gamestate[2]=='c') win = "Cross";
            else win = "Zero";
            return true;
        }else if(gamestate[2] != 'a' &&(gamestate[2]==gamestate[4] && gamestate[4]==gamestate[6])){
            if(gamestate[2]=='c') win = "Cross";
            else win = "Zero";
            return true;
        }else if(gamestate[0] != 'a' &&(gamestate[0]==gamestate[4] && gamestate[4]==gamestate[8])){
            if(gamestate[0]=='c') win = "Cross";
            else win = "Zero";
            return true;
        }else if(img0.getDrawable()!=null && img1.getDrawable()!=null && img2.getDrawable()!=null && img3.getDrawable()!=null && img4.getDrawable()!=null && img5.getDrawable()!=null && img6.getDrawable()!=null && img7.getDrawable()!=null && img8.getDrawable()!=null){
            win = "Draw";
            return true;
        }else{
            return false;
        }
    }
}