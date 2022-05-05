public class ForgeDisc extends SpareParts{    
    public ForgeDisc(Beyblade newBeyblade) {  
        super(newBeyblade);  
    }  
    public String description(){  
        return super.description() +" With better Forge Disc  ";   
    }  
    public double cost()   {  
        return super.cost()+150.0;  
    }  
}  