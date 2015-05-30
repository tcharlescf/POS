
public class EuropeanFactory extends ShoesFactory {
    public Size createSize(String type){
        return new EuropeanSize();
    }

}
