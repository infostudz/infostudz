package app.infostudz.it.z.services;

import org.json.JSONObject;

import app.infostudz.it.z.httpclient.httpclient;
import app.infostudz.it.z.dto.Esito;

public class autenticazione extends httpclient {

    public autenticazione()
    {
        super();
    }

    public Esito autenticazione (String body)
    {
        Esito result = null;
        try {
            JSONObject postResult = super.postForm("autenticazione",body);
            result = new Esito(postResult);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

}
