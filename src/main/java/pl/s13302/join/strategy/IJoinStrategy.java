package pl.s13302.join.strategy;

import pl.s13302.numbers.strategy.IGetNumberStrategy;

public interface IJoinStrategy {

    /**
     * Joins data from two different sources into one result
     * @param dataSource1 data source
     * @param dataSource2 data source
     * @throws IllegalArgumentException when any of ${dataSource1} or ${dataSource2} is null or not able to get the data
     * @return result of joining data from sources
     * @see IllegalArgumentException
     */
    Integer doJoinData(IGetNumberStrategy dataSource1, IGetNumberStrategy dataSource2) throws IllegalArgumentException;

}
