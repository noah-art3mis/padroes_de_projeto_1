/**
 * AsusFactory
 */
public class AsusFactory implements AbstractFactory {

  @Override
  public Monitor makeMonitor() {
    return new AsusMonitor("asusMonitor", 1080);
  }

  @Override
  public Gpu makeGpu() {
    return new AsusGpu("asusGpu", 999);
  }
}
