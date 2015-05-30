
public class UKFactory extends ShoesFactory {

    protected Size createSize(String type) {
        return new UKSize();
    }

}
