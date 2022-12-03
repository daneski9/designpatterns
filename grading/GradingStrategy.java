package grading;
public interface GradingStrategy {
    public grading.Grade calculate(String key, java.util.List<grading.Grade> grades) throws SizeException;
    
}
