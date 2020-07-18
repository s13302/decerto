package pl.s13302.numbers.strategy;

public class GetNumberStrategyStub implements IGetNumberStrategy {

    private Integer result;

    public GetNumberStrategyStub(Integer result) {
        this.result = result;
    }

    @Override
    public Integer getNumber() {
        return new Integer(result);
    }
}
