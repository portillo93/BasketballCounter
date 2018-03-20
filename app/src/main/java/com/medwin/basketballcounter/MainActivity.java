package com.medwin.basketballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teama = 0;
    int teamb= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teama = 0;
        teamb=0;
    }
    public void addunoteama(View a){
        teama=teama +1;
        displayteama(teama);
    }
    public void adddosteama(View a){
        teama=teama +2;
        displayteama(teama);
    }
    public void addtresteama(View a){
        teama=teama +3;
        displayteama(teama);
    }
    public void displayteama(int puntos){
        TextView puntaje = (TextView) findViewById(R.id.score1);
        puntaje.setText(String.valueOf(puntos));
    }
    public void addunoteamb(View a){
        teamb=teamb +1;
        displayteama(teamb);
    }
    public void adddosteamb(View a){
        teamb=teamb +2;
        displayteama(teamb);
    }
    public void addtresteamb(View a){
        teamb=teamb +3;
        displayteama(teamb);
    }
    public void displayteamb(int puntos){
        TextView puntaje = (TextView) findViewById(R.id.score2);
        puntaje.setText(String.valueOf(puntos));
    }
    public void resetALL(View v){
        displayteama(0);
        displayteamb(0);
    }
}
