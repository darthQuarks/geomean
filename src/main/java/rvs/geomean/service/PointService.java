package rvs.geomean.service;

import rvs.geomean.datamodel.Point;
import rvs.geomean.datamodel.PointCollection;

public interface PointService {
    Point getMeanPoint(Point current, Point next, double mass);

    Point getMeanPoint(PointCollection pointCollection);

}
