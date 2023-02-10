package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,restart;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int flag=0,count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    public void init(){
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        restart=findViewById(R.id.restart);
    }

    public void printwinner(String s){
        Toast.makeText(this, "HURRAYYYY THE WINNER IS - "+s, Toast.LENGTH_SHORT).show();
    }

    private void gameover(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count=0;
        flag=0;
    }
    public void Check(View view){
        Button btncurr= (Button) view;
        if(btncurr.getText().toString().equals("oops! Restart the Game")){
            gameover();
            return;
        }
        if(btncurr.getText().toString().equals("")){
            count++;
            if(flag==0){
                btncurr.setText("X");
                flag=1;
            }
            else{
                btncurr.setText("O");
                flag=0;
            }

            if(count>4){
                b1= btn1.getText().toString();
                b2= btn2.getText().toString();
                b3= btn3.getText().toString();
                b4= btn4.getText().toString();
                b5= btn5.getText().toString();
                b6= btn6.getText().toString();
                b7= btn7.getText().toString();
                b8= btn8.getText().toString();
                b9= btn9.getText().toString();


                if(b1.equals(b2) && b2.equals(b3) && !b1.equals("")){
                    printwinner(b1);

                    gameover();
                }else if(b4.equals(b5) && b5.equals(b6) && !b4.equals("")){
                    printwinner(b4);
                    gameover();
                }else if(b7.equals(b8) && b8.equals(b9) && !b7.equals("")){
                    printwinner(b7);
                    gameover();
                }else if(b1.equals(b4) && b4.equals(b7) && !b1.equals("")){
                    printwinner(b1);
                    gameover();
                }else if(b2.equals(b5) && b5.equals(b8) && !b2.equals("")){
                    printwinner(b2);
                    gameover();
                }else if(b3.equals(b6) && b6.equals(b9) && !b3.equals("")){
                    printwinner(b3);
                    gameover();
                }else if(b1.equals(b5) && b5.equals(b9) && !b1.equals("")){
                    printwinner(b1);
                    gameover();
                }else if(b3.equals(b5) && b5.equals(b7) && !b3.equals("")){
                    printwinner(b3);
                    gameover();
                }else if(count==9){
                    Toast.makeText(this, "Game is Draw... Lets play again", Toast.LENGTH_SHORT).show();
                    gameover();
                }
            }
        }

    }
}