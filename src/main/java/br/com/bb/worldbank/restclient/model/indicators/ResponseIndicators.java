package br.com.bb.worldbank.restclient.model.indicators;

import java.util.ArrayList;

public class ResponseIndicators {

    private ArrayList<Data> datum;

    public ArrayList<Data> getDatum() {
        return datum;
    }

    public void setDatum(ArrayList<Data> datum) {
        this.datum = datum;
    }
}
