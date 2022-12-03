package grading;
public class DropFilter implements Filter{
    private boolean shouldDropLowest;
    private boolean shouldDropHighest;
    public DropFilter(){}
    public DropFilter(boolean shouldDropLowest, boolean shouldDropHighest){}
    
    public java.util.List<grading.Grade> apply(java.util.List<grading.Grade> grades) throws SizeException{ //from Filter interface
    return null;
    }
    
}
