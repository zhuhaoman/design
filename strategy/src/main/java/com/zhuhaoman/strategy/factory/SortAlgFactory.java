package com.zhuhaoman.strategy.factory;

import com.zhuhaoman.strategy.strategy.*;

import java.util.HashMap;
import java.util.Map;

public class SortAlgFactory {
    private static final Map<String, ISortAlg> sortAlgs = new HashMap<>();
    //若新增实现类，是需要修改该处
    static {
        sortAlgs.put("QuickSort", new QuickSort());
        sortAlgs.put("ExternalSort", new ExternalSort());
        sortAlgs.put("ConcurrentExternalSort", new ConcurrentExternalSort());
        sortAlgs.put("MapReduceSort", new MapReduceSort());
    }

    public static ISortAlg getSortAlg(String type) {
        //省略判断
        return sortAlgs.get(type);
    }
}
