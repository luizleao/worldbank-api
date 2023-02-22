
package br.com.bb.worldbank.restclient.model.indicators;

import com.fasterxml.jackson.annotation.JsonProperty;
public class IndicatorType {

    @JsonProperty("id")
    private String id;

    @JsonProperty("value")
    private String value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
