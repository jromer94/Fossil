package com.joshromer.fossil.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by josh on 12/7/15.
 */
public class FossilOccurence {

    private final String occurenceID;

    private final String name;

    private final String taxID;

    private final double lat;

    private final double lng;

    @JsonCreator
    public FossilOccurence(@JsonProperty("oid") String occurenceID, @JsonProperty("tna") String name, @JsonProperty("tid") String taxID, @JsonProperty("lat") double lat, @JsonProperty("lng") double lng ){
        this.occurenceID = occurenceID;
        this.name = name;
        this.taxID = taxID;
        this.lat = lat;
        this.lng = lng;
    }

    public String getOccurenceID() {
        return occurenceID;
    }

    public String getName() {
        return name;
    }

    public String getTaxID() {
        return taxID;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }
}
