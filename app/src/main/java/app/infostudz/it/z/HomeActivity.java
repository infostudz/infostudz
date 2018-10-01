package app.infostudz.it.z;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;

public class HomeActivity extends AppCompatActivity {
  CardView mycard ;
  Intent i ;
  LinearLayout ll;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
    ll = (LinearLayout) findViewById(R.id.ll);
    ((CardView) findViewById(R.id.cardPrenotaId)).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          //startActivity(i);
          int i=1;
        }
    });
      ((CardView) findViewById(R.id.cardPrenotazioniId)).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          //startActivity(i);
          int i=1;
        }
      });
      ((CardView) findViewById(R.id.cardProfiloId)).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          //startActivity(i);
          int i=1;
        }
      });
      ((CardView) findViewById(R.id.cardSostenutId)).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          //startActivity(i);
          int i=1;
        }
      });
    ((CardView) findViewById(R.id.cardStatisticheId)).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        //startActivity(i);
        int i=1;
      }
    });


  }
}