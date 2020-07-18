package pl.s13302.join.strategy;

import pl.s13302.data.strategy.IGetDataStrategy;

public interface IJoinStrategy<T> {

    /**
     * Joins data from two different sources into one result
     * @param dataSource1 data source
     * @param dataSource2 data source
     * @throws IllegalArgumentException when any of ${dataSource1} or ${dataSource2} is null or not able to get the data
     * @return result of joining data from sources
     * @see IllegalArgumentException
     */
    T doJoinData(IGetDataStrategy<T> dataSource1, IGetDataStrategy<T> dataSource2) throws IllegalArgumentException;

}
