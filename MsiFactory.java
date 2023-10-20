/**
 * MsiFactory
 */
public class MsiFactory extends AbstractFactory {

  @Override
  public Monitor makeMonitor() {
    return new Monitor("msiMonitor", 4000);
  }

  @Override
  public Gpu makeGpu() {
    return new Gpu("msiGpu", 123);
  }
}
