package app.infostudz.it.z.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import static android.content.Context.MODE_PRIVATE;

public class Preference {

    SharedPreferences prefs;
    SharedPreferences.Editor editor;

    public Preference(Context context ) {
        prefs = context.getSharedPreferences(context.getString(app.infostudz.it.z.R.string.Preferences), MODE_PRIVATE);
        editor = null;
    }

    public String getMatricola() {
        return prefs.getString("matricola", "");
    }

    public void setMatricola(String matricola) {
        setEditor();
        editor.putString("matricola", matricola);
    }

    public String getToken() {
        return prefs.getString("token", "");
    }

    public void setToken(String token) {
        setEditor();
        editor.putString("token",token);
    }

    private void setEditor()
    {
        if (editor == null) editor = prefs.edit();
    }

    public void close()
    {
        if (editor != null) editor.apply();
        prefs = null;
        editor = null;
    }
}
