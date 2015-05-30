
public class AmericanFactory extends ShoesFactory {
    public Size createSize(String type){
        return new AmericanSize();
    }

}
