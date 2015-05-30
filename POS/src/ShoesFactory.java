
public abstract class ShoesFactory {
    protected abstract Size createSize(String type);
    
    public Size orderSize(String type){
        Size size = null;
        size = createSize(type);      
        
        return size;
    }
}
