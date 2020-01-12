public class Case{
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;
    
    public Case(String model,String manufactuer, String powerSupply, Dimensions dimensions){
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
        
    }
    public void pressPowerButton(){
        
        System.out.println("Power button pressed");
    }
    public String getModel(){
        return model;
    }
    public String manufacturer(){
        return manufacturer;
    }
    public String getPowerSupply(){
        return powerSupply;
    }
    public Dimensions getDimensions(){
        return dimensions;
    }
    
}