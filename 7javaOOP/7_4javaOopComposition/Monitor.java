public class Monitor{
    private String model;
    private String manufacturer;
    private int size;
    //here Resolution is from the Resolution class and is an example of composition
    private Resolution nativeResolution;
    
    public Monitor(String model, String manufactuer, int size, Resolution nativeResolution){
        this.model=model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution=nativeResolution;
    }
    public void drawPixelAt(int x,int y, String color){
        System.out.println("Drawing pixel at "+x+", "+y+" in color "+color);
    }
    public String getModel(){
        return model;
    }
    public String getManufactuer(){
        return manufacturer;
    }
    public int getSize(){
        return size;
    }
    public Resolution getNativeResolution(){
        return nativeResolution;
    }
}