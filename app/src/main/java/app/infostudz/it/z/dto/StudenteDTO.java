package app.infostudz.it.z.dto;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.Vector;

@SuppressWarnings("serial")
public class StudenteDTO {

    private String codiceFiscale;
    private String cognome;
    private String nome;
    private String dataNascita;
    private String luogoNascita;
    private String annoDiCorso;
    private String annoPrimaIscrizione ;
    private String annoUltimaIscrizione;
    private String facolta;
    private String corsoDiStudi;
    private String annoAccademicoAttuale ;
    private String matricola;
    private String codiceCorsoDiStudi ;
    private String tipoStudente;
    private Boolean isImmatricolabile ;
    private String sesso ;
    //"tipoLaurea": null,
    private String provinciaNascita;
    private String nazioneNascita;
    private String comuneNascita;
   //"laureaItaFlag": "S",
    private String mail;
    private Boolean checkEmail;
    private String codiTipoTito;
    //"creditiTotali": "n.d.",
    //"accessoPrenotazione": true,
    //"dovuto": true,
    //"isMedicina": false,
    // "indiMailIstituzionale": "muzi.1225069@studenti.uniroma1.it",
    private String luogoDiNascitaShort;
    //"annoAccaCors": "2019",
    //"accessoPrenotazioneNote": null,
    private String descCittadinanza;
    private String descCittadinanzaEn ;
    private String cittadinanza;
    //"isAlias": "N",
    //"aliasNome": null,
    //"isErasmus": false

    public StudenteDTO(JSONObject response) throws JSONException {
        this.codiceFiscale =  response.getString("codiceFiscale");
        this.cognome =  response.getString("cognome");
        this.nome = response.getString("nome");
        this.dataNascita = response.getString("dataNascita");
        this.luogoNascita = response.getString("luogoNascita");
        this.annoDiCorso = response.getString("annoCorso");
        this.annoPrimaIscrizione =  response.getString("primaIscr");
        this.annoUltimaIscrizione = response.getString("ultIscr");
        this.facolta = response.getString("facolta");
        this.corsoDiStudi = response.getString("nomeCorso");
        this.annoAccademicoAttuale =  response.getString("annoAccaAtt");
        this.matricola = response.getString("matricola");
        this.codiceCorsoDiStudi =  response.getString("codCorso");
        this.tipoStudente = response.getString("tipoStudente"); //todo tipo studente
        this.isImmatricolabile = response.getString("iscritto").equalsIgnoreCase("NO");
        this.sesso = response.getString("sesso");
        //"tipoLaurea": null,
        this.provinciaNascita = response.getString("provinciaNascita");
        this.nazioneNascita = response.getString("nazioneNascita");
        this.comuneNascita = response.getString("comuneDiNasciata");
        //"laureaItaFlag": "S",
        this.mail = response.getString("indiMail");
        this.checkEmail = response.getString("mailConfermata").equalsIgnoreCase("S");
        this.codiTipoTito = response.getString("tipoCorso");
        //"creditiTotali": "n.d.",
        //"accessoPrenotazione": true,
        //"dovuto": true,
        //"isMedicina": false,
        // "indiMailIstituzionale": "muzi.1225069@studenti.uniroma1.it",
        this.luogoDiNascitaShort = response.getString("luogoDiNascitaShort");
        //"annoAccaCors": "2019",
        //"accessoPrenotazioneNote": null,
        this.descCittadinanza = response.getString("cittadinanza");
        this.descCittadinanzaEn = response.getString("cittadinanzaEn");
        this.cittadinanza = response.getString("codCittadinanza");
        //"isAlias": "N",
        //"aliasNome": null,
        //"isErasmus": false

    }


    public String getAnnoAccademicoAttuale() {
        return annoAccademicoAttuale;
    }

    public void setAnnoAccademicoAttuale(String annoAccademicoAttuale) {
        this.annoAccademicoAttuale = annoAccademicoAttuale;
    }

    public String getAnnoUltimaIscrizione() {
        return annoUltimaIscrizione;
    }

    public void setAnnoUltimaIscrizione(String annoUltimaIscrizione) {
        this.annoUltimaIscrizione = annoUltimaIscrizione;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCorsoDiStudi() {
        return corsoDiStudi;
    }

    public void setCorsoDiStudi(String corsoDiStudi) {
        this.corsoDiStudi = corsoDiStudi;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getFacolta() {
        return facolta;
    }

    public void setFacolta(String facolta) {
        this.facolta = facolta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getComuneNascita() {
        return comuneNascita;
    }

    public void setComuneNascita(String comuneNascita) {
        this.comuneNascita = comuneNascita;
    }

    public String getProvinciaNascita() {
        return provinciaNascita;
    }

    public void setProvinciaNascita(String provinciaNascita) {
        this.provinciaNascita = provinciaNascita;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public String getAnnoDiCorso() {
        return annoDiCorso;
    }

    public void setAnnoDiCorso(String annoDiCorso) {
        this.annoDiCorso = annoDiCorso;
    }

    public String getCodiceCorsoDiStudi() {
        return codiceCorsoDiStudi;
    }

    public void setCodiceCorsoDiStudi(String codiceCorsoDiStudi) {
        this.codiceCorsoDiStudi = codiceCorsoDiStudi;
    }

    public String getCodiTipoTito() {
        return codiTipoTito;
    }

    public void setCodiTipoTito(String codiTipoTito) {
        this.codiTipoTito = codiTipoTito;
    }


    public Boolean getIsImmatricolabile() {
        return isImmatricolabile;
    }

    public void setIsImmatricolabile(Boolean isImmatricolabile) {
        this.isImmatricolabile = isImmatricolabile;
    }

    public boolean getCheckEmail() {
        return this.checkEmail;
    }

    public void setCheckEmail(boolean checkEmail) {
        this.checkEmail = checkEmail;
    }

    public String getLuogoNascita() {
        return luogoNascita;
    }

    public void setLuogoNascita(String luogoNascita) {
        this.luogoNascita = luogoNascita;
    }

    public String getAnnoPrimaIscrizione() {
        return annoPrimaIscrizione;
    }

    public void setAnnoPrimaIscrizione(String annoPrimaIscrizione) {
        this.annoPrimaIscrizione = annoPrimaIscrizione;
    }

    public String getDescCittadinanza() {
        return descCittadinanza;
    }

    public void setDescCittadinanza(String descCittadinanza) {
        this.descCittadinanza = descCittadinanza;
    }

    public String getCittadinanza() {
        return cittadinanza;
    }

    public void setCittadinanza(String cittadinanza) {
        this.cittadinanza = cittadinanza;
    }

    public String getTipoStudente() {
        return tipoStudente;
    }

    public void setTipoStudente(String tipoStudente) {
        this.tipoStudente = tipoStudente;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNazioneNascita() {
        return nazioneNascita;
    }

    public void setNazioneNascita(String nazioneNascita) {
        this.nazioneNascita = nazioneNascita;
    }

	public String getLuogoDiNascitaShort() {
		return luogoDiNascitaShort;
	}

	public void setLuogoDiNascitaShort(String luogoDiNascitaShort) {
		this.luogoDiNascitaShort = luogoDiNascitaShort;
	}

	public String getDescCittadinanzaEn() {
		return descCittadinanzaEn;
	}

	public void setDescCittadinanzaEn(String descCittadinanzaEn) {
		this.descCittadinanzaEn = descCittadinanzaEn;
	}

	
}
