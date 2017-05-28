package com.nguyenthanhthai.googlemappet.googlemap.object;

import java.util.List;

/**
 * Created by NguyenThanhThai on 5/26/2017.
 */

public class LegsObject {
    private List<StepsObject> steps;
    public LegsObject(List<StepsObject> steps) {
        this.steps = steps;
    }
    public List<StepsObject> getSteps() {
        return steps;
    }
}
