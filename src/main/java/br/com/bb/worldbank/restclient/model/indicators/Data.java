package br.com.bb.worldbank.restclient.model.indicators;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Data {
    @JsonProperty("")
    private Page page;

    @JsonProperty("")
    private ArrayList<Indicator> indicators;

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public ArrayList<Indicator> getIndicators() {
        return indicators;
    }

    public void setIndicators(ArrayList<Indicator> indicators) {
        this.indicators = indicators;
    }
}


