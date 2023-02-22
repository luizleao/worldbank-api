
package br.com.bb.worldbank.restclient.model.indicators;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Indicator {

    @JsonProperty("country")
    private Country country;

    @JsonProperty("countryiso3code")
    private String countryiso3code;

    @JsonProperty("date")
    private String date;

    @JsonProperty("decimal")
    private Long decimal;

    @JsonProperty("id")
    private String id;

    @JsonProperty("indicator")
    private Indicator indicator;

    @JsonProperty("obsStatus")
    private String obsStatus;

    @JsonProperty("unit")
    private String unit;

    @JsonProperty("value")
    private String value;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getCountryiso3code() {
        return countryiso3code;
    }

    public void setCountryiso3code(String countryiso3code) {
        this.countryiso3code = countryiso3code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getDecimal() {
        return decimal;
    }

    public void setDecimal(Long decimal) {
        this.decimal = decimal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Indicator getIndicator() {
        return indicator;
    }

    public void setIndicator(Indicator indicator) {
        this.indicator = indicator;
    }

    public String getObsStatus() {
        return obsStatus;
    }

    public void setObsStatus(String obsStatus) {
        this.obsStatus = obsStatus;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) { this.unit = unit; }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
