package grading;
public class WeightedTotalStrategy implements GradingStrategy{
    private java.util.Map<java.lang.String, java.lang.Double> weights;
    public WeightedTotalStrategy(){};
    
    public WeightedTotalStrategy(java.util.Map<java.lang.String,java.lang.Double> weights){};
    
    @Override
    public Grade calculate(String key, java.util.List<Grade> grades) throws SizeException { //from GradingStrategy interface
    return null;
    }
}
