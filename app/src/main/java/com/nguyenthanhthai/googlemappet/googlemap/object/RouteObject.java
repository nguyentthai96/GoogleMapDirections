package com.nguyenthanhthai.googlemappet.googlemap.object;

import java.util.List;

/**
 * Created by NguyenThanhThai on 5/26/2017.
 */


public class RouteObject {
    private List<LegsObject> legs;
    public RouteObject(List<LegsObject> legs) {
        this.legs = legs;
    }
    public List<LegsObject> getLegs() {
        return legs;
    }
}