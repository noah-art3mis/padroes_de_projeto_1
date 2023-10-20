/**
 * MsiFactory
 */
public class MsiFactory implements AbstractFactory {

  @Override
  public Monitor makeMonitor() {
    return new MsiMonitor("msiMonitor", 4000);
  }

  @Override
  public Gpu makeGpu() {
    return new MsiGpu("msiGpu", 123);
  }
}
