package pl.s13302.join.strategy;

import pl.s13302.data.strategy.IGetDataStrategy;

public class Add implements IJoinStrategy<Integer> {

    @Override
    public Integer doJoinData(IGetDataStrategy<Integer> dataSource1, IGetDataStrategy<Integer> dataSource2) throws IllegalArgumentException {
        if (dataSource1 == null || dataSource2 == null) {
            throw new IllegalArgumentException("Data sources should not be null");
        }
        Integer data1 = dataSource1.getData();
        Integer data2 = dataSource2.getData();
        if (data1 == null || data2 == null) {
            throw new IllegalArgumentException("Data from sources should not be null");
        }
        return data1 + data2;
    }

}
