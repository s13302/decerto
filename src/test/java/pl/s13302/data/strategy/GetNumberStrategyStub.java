package pl.s13302.data.strategy;

public class GetNumberStrategyStub implements IGetDataStrategy<Integer> {

    private Integer result;

    public GetNumberStrategyStub(Integer result) {
        this.result = result;
    }

    @Override
    public Integer getData() {
        return new Integer(result);
    }
}
