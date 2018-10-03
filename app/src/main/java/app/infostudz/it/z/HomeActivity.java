package app.infostudz.it.z;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import app.infostudz.it.z.dto.Esito;
import app.infostudz.it.z.services.anagrafica;
import app.infostudz.it.z.util.Preference;

public class HomeActivity extends AppCompatActivity {
  CardView mycard ;
  private AnagraficaTask mAnagTask = null;

  Intent i ;
  LinearLayout ll;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);

    mAnagTask = new AnagraficaTask(getBaseContext());
    mAnagTask.execute((Void) null);
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
  /**
   * Shows the progress UI and hides the login form.
   */

  public class AnagraficaTask extends AsyncTask<Void, Void, Boolean> {

    private String mMatricola;
    private String mToken;
    private String mMessage;
    private static final String TAG = "MyActivity";
    private Context context;


    AnagraficaTask(Context context) {
      this.context = context;
      mMatricola = null;
      mToken = null;
      mMessage = "";
      this.context = context.getApplicationContext();
    }

    @Override
    protected Boolean doInBackground(Void... params) {

      boolean result = false;

      try {
        Preference pref = new Preference(context);
        mMatricola = pref.getMatricola();
        mToken = pref.getToken();

        anagrafica anag = new anagrafica();
        Esito esito = anag.anagrafica(mMatricola,mToken);

        if (esito.getFlagEsito() == 0 )
        {
          result = true;
          pref.setToken(esito.getOutput());
        }
        else
        {

          Toast.makeText(context ,getString(app.infostudz.it.z.R.string.error_generic), Toast.LENGTH_LONG).show();
          Intent intent = new Intent(context, LoginActivity.class);
          startActivity(intent);
        }
      } catch (Exception  ex)
      {
        Log.d(this.TAG,ex.getMessage());

      }

      return result;
    }

    @Override
    protected void onPostExecute(final Boolean success) {
      mAnagTask = null;
      Intent intent = null;
      Toast.makeText(context ,mMessage, Toast.LENGTH_LONG).show();
      Preference pref = new Preference(context);

      if (success) {
        pref.setMatricola(mMatricola);
        pref.setToken(mToken);
        pref.close();

      } else {
        pref.setMatricola(null);
        pref.close();
      }

      pref.close();

    }

    @Override
    protected void onCancelled() {
      mAnagTask = null;
    }
  }

}