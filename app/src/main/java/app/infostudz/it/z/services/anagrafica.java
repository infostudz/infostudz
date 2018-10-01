package app.infostudz.it.z.services;

import org.json.JSONObject;

import app.infostudz.it.z.dto.Esito;
import app.infostudz.it.z.httpclient.httpclient;
import app.infostudz.it.z.dto.StudenteDTO;

public class anagrafica extends httpclient {

    public anagrafica()
    {
        super();
    }

    public Esito anagrafica (String matricola,String token)
    {
        Esito result = null;

        try {

            JSONObject postResult = super.get("studente/" + matricola + "?ingresso=" + token );
            result = new Esito(postResult);
            StudenteDTO stud = new StudenteDTO(new JSONObject("output"));
            result.setRitorno(stud);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

}
