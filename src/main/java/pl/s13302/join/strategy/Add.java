package pl.s13302.join.strategy;

import pl.s13302.numbers.strategy.IGetNumberStrategy;

public class Add implements IJoinStrategy {

    @Override
    public Integer doJoinData(IGetNumberStrategy dataSource1, IGetNumberStrategy dataSource2) throws IllegalArgumentException {
        if (dataSource1 == null || dataSource2 == null) {
            throw new IllegalArgumentException("Data sources should not be null");
        }
        Integer data1 = dataSource1.getNumber();
        Integer data2 = dataSource2.getNumber();
        if (data1 == null || data2 == null) {
            throw new IllegalArgumentException("Data from sources should not be null");
        }
        return data1 + data2;
    }

}
