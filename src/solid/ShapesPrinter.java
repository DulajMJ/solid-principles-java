package solid;

import java.util.List;

public class ShapesPrinter {
    IAreaCalculator areaCalculator;

    public String json(List<Object> shapes){
        return "{sum:"+areaCalculator.sum(shapes)+"}";
    }
}
