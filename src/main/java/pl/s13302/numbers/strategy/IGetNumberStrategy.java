package pl.s13302.numbers.strategy;

public interface IGetNumberStrategy {

    /**
     * Gets the pseudorandom number from ${from} inclusive to ${to} exclusive
     * @param from start point of boundary
     * @param to end point of boundary
     * @return the number between ${from} inclusive to ${to} exclusive
     */
    Integer getNumber(int from, int to);

}
