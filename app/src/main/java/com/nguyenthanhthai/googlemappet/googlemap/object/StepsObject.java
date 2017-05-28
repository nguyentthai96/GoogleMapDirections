package com.nguyenthanhthai.googlemappet.googlemap.object;

/**
 * Created by NguyenThanhThai on 5/26/2017.
 */

public class StepsObject {
    private PolylineObject polyline;
    public StepsObject(PolylineObject polyline) {
        this.polyline = polyline;
    }
    public PolylineObject getPolyline() {
        return polyline;
    }
}