
class ShoesMaker {
  private NormalCushion nc = new NormalCushion();

  private AirCushion ac = new AirCushion();

  private LunaCushion lc = new LunaCushion();

  private NormalWeight nw = new NormalWeight();

  private LightWeight lw = new LightWeight();
  
  public void selectCushion(){
      nc.cushion();
      ac.cushion();
      lc.cushion();
  }
  
  public void selectWeight(){
      nw.weight();
      lw.weight();
  }

}
