package br.com.bb.worldbank.restclient.model.indicators;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Page {

    @JsonProperty("page")
    public int page;

    @JsonProperty("pages")
    public int pages;

    @JsonProperty("per_page")
    public int per_page;

    @JsonProperty("total")
    public int total;

    @JsonProperty("sourceid")
    public String sourceid;

    @JsonProperty("sourcename")
    public String sourcename;

    @JsonProperty("lastupdated")
    public String lastupdated;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getSourceid() {
        return sourceid;
    }

    public void setSourceid(String sourceid) {
        this.sourceid = sourceid;
    }

    public String getSourcename() {
        return sourcename;
    }

    public void setSourcename(String sourcename) {
        this.sourcename = sourcename;
    }

    public String getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(String lastupdated) {
        this.lastupdated = lastupdated;
    }
}
