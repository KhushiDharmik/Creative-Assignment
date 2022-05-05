public class PerformanceTip extends SpareParts{    
    public PerformanceTip(Beyblade newBeyblade) {  
        super(newBeyblade);  
    }  
    public String description(){  
        return super.description() +" With Better Performance Tip  ";   
    }  
    public double cost()   {  
        return super.cost()+120.0;  
    }  
}  