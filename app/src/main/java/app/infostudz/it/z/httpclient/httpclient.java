package app.infostudz.it.z.httpclient;

import android.util.Log;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import org.json.JSONObject;

public class httpclient {
    private final String BASE_URL = "https://www.studenti.uniroma1.it/phoenixws/";
    private final MediaType mediaTypeForm = MediaType.parse("application/x-www-form-urlencoded");
    private final String  applicationXwwwformurlencoded = "application/x-www-form-urlencoded";
    private final String  applicationJson = "application/json";


    public JSONObject postForm(String resource,String bodyText) {
        JSONObject result = null;
        try {
            OkHttpClient client = new OkHttpClient();
            RequestBody body = RequestBody.create(mediaTypeForm, bodyText);
            Request request = new Request.Builder()
                    .url(BASE_URL + resource)
                    .post(body)
                    .addHeader("Accept", applicationJson)
                    .addHeader("Cache-Control", "no-cache")
                    .addHeader("Content-Type", applicationXwwwformurlencoded)
                    .build();

            String responseText = (client.newCall(request).execute()).body().string();
            result = new JSONObject(responseText);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public JSONObject get(String resource) {
        JSONObject result = null;
        //"https://www.studenti.uniroma1.it/phoenixws/studente/1225069?ingresso=0608cd9b-7cdc-49f7-8dcc-4a8755675e2f"
        try {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url(BASE_URL + resource)
                    .get()
                    .addHeader("Accept", applicationJson)
                    .addHeader("Cache-Control", "no-cache")
                    .build();

            Response resp = client.newCall(request).execute();
            String responseText = (client.newCall(request).execute()).body().string();
            result = new JSONObject(responseText);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
