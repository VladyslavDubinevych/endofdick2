package BAY;

public class TEROBORONA extends Person
{
    private  String Name = "Coliseum";
    private int FunctionOne;
    private double FunctionTwo;

    public TEROBORONA(int FunctionOne, double FunctionTwo) {
        this.FunctionOne = FunctionOne;
        this.FunctionTwo = FunctionTwo;
    }

    @Override
    public int getFunctionOne() {
        return FunctionOne;
    }

    @Override
    public double getFunctionTwo() {
        return FunctionTwo;
    }
    @Override
    public String getName() {
        return Name;}
}
