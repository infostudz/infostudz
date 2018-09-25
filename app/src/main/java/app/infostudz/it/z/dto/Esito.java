package app.infostudz.it.z.dto;

import org.json.JSONException;
import org.json.JSONObject;
public class Esito {

    private int flagEsito =0;
    private int id = 0;
    private String nota = null;
    private String ritorno = null;
    private String output = null;

    public Esito(JSONObject rsespone) throws JSONException
    {
        JSONObject esito = new JSONObject(rsespone.getString("esito"));
        this.flagEsito =  esito.getInt("flagEsito");
        this.id =  esito.getInt("id");
        this.nota =  esito.getString("nota");
        this.ritorno =  esito.getString("ritorno");
        this.output =  rsespone.getString("output");
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

    public String getRitorno() {
        return ritorno;
    }

    public void setRitorno(String ritorno) {
        this.ritorno = ritorno;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
