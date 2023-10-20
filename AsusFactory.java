/**
 * AsusFactory
 */
public class AsusFactory extends AbstractFactory {

  @Override
  public Monitor makeMonitor() {
    return new Monitor("asusMonitor", 1080);
  }

  @Override
  public Gpu makeGpu() {
    return new Gpu("asusGpu", 999);
  }
}
