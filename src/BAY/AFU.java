package BAY;

public  class AFU extends Person {
    private static String Name = "Arena";
    private int FunctionOne;
    private double FunctionTwo;

    public AFU(int FunctionOne, double FunctionTwo) {
        this.FunctionOne = FunctionOne;
        this.FunctionTwo = FunctionTwo;
        this.Name = Name;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public int getFunctionOne() {
        return FunctionOne;
    }

    @Override
    public double getFunctionTwo() {
        return FunctionTwo;
    }
}
