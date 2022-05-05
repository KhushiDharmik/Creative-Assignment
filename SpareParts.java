public abstract class SpareParts implements Beyblade{  
    private Beyblade newBeyblade;  
    public SpareParts(Beyblade newBeyblade)  {  
        this.newBeyblade=newBeyblade;  
    }  
    @Override  
    public String description(){  
        return newBeyblade.description();   
    }  
    public double cost(){  
        return newBeyblade.cost();  
    }  
}  