package app.infostudz.it.z.dto;

import org.json.JSONException;
import org.json.JSONObject;
public class Esito {

    private int flagEsito =-1;
    private int id = 0;
    private String nota = null;
    private Object ritorno = null;
    private String output = null;

    public Esito(JSONObject response) throws JSONException
    {

        if (response != null)
        {
            JSONObject esito = new JSONObject(response.getString("esito"));
            this.flagEsito = esito.getInt("flagEsito");
            this.id = esito.getInt("id");
            this.nota = esito.getString("nota");
            this.ritorno = esito.getString("ritorno");
            this.output = response.getString("output");
        }
    }

    public int getFlagEsito() {
        return flagEsito;
    }

    public void setFlagEsito(int flagEsito) {
        this.flagEsito = flagEsito;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public Object getRitorno() {
        return ritorno;
    }

    public void setRitorno(Object ritorno) {
        this.ritorno = ritorno;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
