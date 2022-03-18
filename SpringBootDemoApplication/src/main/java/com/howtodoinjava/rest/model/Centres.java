package com.howtodoinjava.rest.model;

import java.util.ArrayList;
import java.util.List;

public class Centres
{
    private List<Centre> centreList;

    public List<Centre> getCentreList() {
        if(centreList == null) {
            centreList = new ArrayList<>();
        }
        return centreList;
    }

    public void setCentreList(List<Centre> centreList) {
        this.centreList = centreList;
    }
}
