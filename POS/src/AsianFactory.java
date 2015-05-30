
public class AsianFactory extends ShoesFactory {
    protected Size createSize(String type){
        return new AsianSize();
    }
}
